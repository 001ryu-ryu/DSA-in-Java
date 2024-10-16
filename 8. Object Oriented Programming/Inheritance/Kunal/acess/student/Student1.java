package Kunal.acess.student;

public class Student1 extends Students {
    public static Student1 iftikar;
   
    

    public Student1(int rollNo, String name, float cgpa, String department) {
        super(rollNo, name, cgpa, department);
        
        
    }

    static {
        iftikar = new Student1(22003, "Iftikar Hussain", 6.55f, "mathematics");
        // iftikar.setGf("Mamtaz Begum");
    }
    
    
    
    
    
}
