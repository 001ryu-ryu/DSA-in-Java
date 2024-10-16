package Kunal.acess.student;

public class Students {
    
    protected int rollNo;
    protected String name;
    protected float cgpa;
    protected String department;
    private String girlfriend;
    

    public Students(int rollNo, String name, float cgpa, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
        this.department = department;
    }

    public int getRoll() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public String getDepartment() {
        return department;
    }

    public String getGirlfriend() {
        return girlfriend;
    }

    public void setGf(String girlfriend) {
        this.girlfriend = girlfriend;
    }



    
}
