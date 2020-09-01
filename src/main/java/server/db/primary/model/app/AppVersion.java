package server.db.primary.model.app;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

@Table(name = "CBMDB.APP_VERSION")
@Data
@Accessors(chain = true)
public class AppVersion implements Serializable {
    @Column(name = "VERSION")
    private String version;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "IS_FORCE_UPDATE")
    private Short isForceUpdate;

    @Column(name = "APK_FILE_PATH")
    private String apkFilePath;

    @Column(name = "USER_GROUP_KEY")
    private String userGroupKey;

    private static final long serialVersionUID = 1L;

    public static final String VERSION = "version";

    public static final String DB_VERSION = "VERSION";

    public static final String CREATEDATE = "createDate";

    public static final String DB_CREATE_DATE = "CREATE_DATE";

    public static final String ISFORCEUPDATE = "isForceUpdate";

    public static final String DB_IS_FORCE_UPDATE = "IS_FORCE_UPDATE";

    public static final String APKFILEPATH = "apkFilePath";

    public static final String DB_APK_FILE_PATH = "APK_FILE_PATH";

    public static final String USERGROUPKEY = "userGroupKey";

    public static final String DB_USER_GROUP_KEY = "USER_GROUP_KEY";
}