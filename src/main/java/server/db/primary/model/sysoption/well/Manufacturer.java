package server.db.primary.model.sysoption.well;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

@Table(name = "CBMDB.MANUFACTURER")
@Data
@Accessors(chain=true)
public class Manufacturer implements Serializable {
    @Column(name = "NAME")
    private String name;

    @Column(name = "VALUE")
    private Long value;

    @Column(name = "TYPE")
    private String type;

    private static final long serialVersionUID = 1L;
}