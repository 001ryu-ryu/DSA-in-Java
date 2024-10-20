import java.util.ArrayList;

public class PairSum {

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for(int i = 0; i < list.size(); i++) {
            for(int j = i+1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <=6; i++) {
            list.add(i*1);
        }

        System.out.println(pairSum(list, 5));
    }
}
