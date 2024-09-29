public class FindSubset {

    public static void findsubset(String set, String ans, int i) {
        if (i == set.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        findsubset(set, ans + set.charAt(i), i+1);
        findsubset(set, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findsubset(str, "", 0);
    }
}
