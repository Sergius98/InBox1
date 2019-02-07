package task1.ua.kpi.fpm;

/**
 * Created by M on 02/07/2019
 */
public class Model {
    private String str;

    // The Program logic

    /**
     * in this method concatenate newStr with this.str
     * @param newStr
     * @return concatenation
     */
    public String concatenateStrings(String newStr){
        return str += " " + newStr;
    }

    public String getValue() {
        return str;
    }

    public void setValue(String newStr) {
        this.str = newStr;
    }
}
