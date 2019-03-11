package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    public void setLabName(String labName) {
        this.labName = labName;
    }

    private String labName;
    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName=labName;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "labName='" + labName + '\'' +
                '}';
    }

    public String getName() {
        return labName;
    }
}
