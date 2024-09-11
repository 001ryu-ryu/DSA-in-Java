public class Cnstructr {
    public static void main(String[] args) {
        Student s0 = new Student();
        Student s1 = new Student("Mamtaz");
        Student s2 = new Student(22003);

        
    }
}

class Student {
    String name;
    int rollNo;

    Student() {
        System.out.println("Constructor is called...");
    }


    Student(String name) {
        this.name = name;
        System.out.println(name);
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
        System.out.println(rollNo);
    }
}
