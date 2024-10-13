class Test2 {
    String name;
    public Test2 (String name) {
        this.name = name;
    }
}
public class InnerClass {
    class Test1 {
        String name;
        public Test1(String name) {
            this.name = name;
        }
    }

    static class Test3 {
        String name;
        public Test3(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test1 a = new Test1("Mamtaz");
        Test2 b = new Test2("Iftikar");
        Test3 c = new Test3("Popi");
    }
}
