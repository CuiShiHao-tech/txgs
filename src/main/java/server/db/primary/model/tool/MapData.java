package server.db.primary.model.tool;

/**
 * Created by william on 2019/05/10
 * Description:
 **/
public class MapData {
    private String wellName;
    private String[] value;
    private String direction;

    public String getWellName() {
        return wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName;
    }

    public String[] getValue() {
        return value;
    }

    public void setValue(String[] value) {
        this.value = value;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
