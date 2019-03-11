package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private Map<String, Lab> map;
    private String labName;
    private LabStatus labStatus;
    public void setLabName(String labName) {
        this.labName = labName;
    }


    public Student() {
        this(null);
    }

    public Student(Map<Lab, LabStatus> map) {
        Lab lab = new Lab();
        this.map = new TreeMap<>();
    }

    public Lab getLab(String labName) {
        Lab lab = new Lab(labName);

        return lab;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        this.labName = labName;
        this.labStatus=LabStatus.COMPLETED;
    }


    public void forkLab(Lab lab) {
        Lab lab1 = new Lab();
        lab1.getName();

    }

    public LabStatus getLabStatus(String labName) {
        return LabStatus.PENDING;
    }
}