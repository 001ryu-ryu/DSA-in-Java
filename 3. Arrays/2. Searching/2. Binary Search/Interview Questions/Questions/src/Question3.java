
public class Question3 {
    public static char nextGreatesLetter(char[] letters, int target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return  letters[start % letters.length];
    }

    public static void main(String[] args) {
       char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatesLetter(letters, target));
    }
}
