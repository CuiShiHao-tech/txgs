package server.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.util.StringUtils;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;
import java.io.FileNotFoundException;

@Configuration
@MapperScan(basePackages = "server.db.primary.mapper", sqlSessionTemplateRef = "primarySqlSessionTemplate")
@Slf4j
public class PrimaryDBConfig {

    @Bean(name = "primaryDataSourceHikari")
    @ConfigurationProperties(prefix = "spring.datasource.primary.hikari")
    public HikariConfig primaryDataSourceHikari() {
        HikariConfig hikariConfig = new HikariConfig();
        if (StringUtils.isEmpty(hikariConfig.getPoolName())) {
            hikariConfig.setPoolName("PrimaryDBPool");
        }
        return hikariConfig;
    }

    @Bean(name = "primaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    @Primary
    public DataSource dataSource(@Qualifier("primaryDataSourceHikari") HikariConfig hikariConfig) {
        HikariDataSource build = DataSourceBuilder.create().type(HikariDataSource.class).build();
        hikariConfig.copyStateTo(build);
        return build;
    }

    @Bean(name = "primarySqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory(@Qualifier("primaryDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        try {
            bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/primary/**/*.xml"));
        } catch (FileNotFoundException e) {
            log.info(e.getMessage() + ". File not exists.");
        }
        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/mybatis.cfg.xml"));
        return bean.getObject();
    }

    @Bean(name = "primaryTransactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager(@Qualifier("primaryDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "primarySqlSessionTemplate")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("primarySqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
