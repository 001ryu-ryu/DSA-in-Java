public class SearchInString {
    public static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        // for (int i = 0; i < str.length(); i++) {
        //     if (target == str.charAt(i)) {
        //         return true;
        //     }
        // }

        // Enhanced for

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "Ifikar";
        char ch = 'f';
        System.out.println(search(name, ch));
    }
}
