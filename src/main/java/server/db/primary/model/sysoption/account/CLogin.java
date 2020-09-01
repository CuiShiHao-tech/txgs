package server.db.primary.model.sysoption.account;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Table(name = "CBMDB.C_LOGIN")
@Data
public class CLogin implements Serializable {
    @Id
    private Long id;

    private String cLoginname;

    private String cLoginpwd;

    private String cName;

    private Long cGid;

    private String cGno;

    private String cGname;

    private String remark;

    private Long ipLimitMark;

    private Long mark;

    private Date stime;

    private Date rtime;

    private Long urlType;

    private String urlFile;

    private AuthGroup authGroup;

    private Long isAdmin;

    @Transient
    private List<String> permissionIdList;

}