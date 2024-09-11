public class Accessmod {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.username = "iftikar";
        //b1.password = "abc";
        b1.setPassword("1abc");
      //  b1.getPassword();
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
    // public void getPassword() {
    //    String pwd = password;
    //     System.out.println(pwd);
    // }
}
