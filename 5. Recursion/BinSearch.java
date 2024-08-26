
import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();

       int ans = binSearch(arr, target, 0, n);
       System.out.println(ans);
    }

    public static int binSearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s)/2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return binSearch(arr, target, s, m - 1);
            }
            return binSearch(arr, target, m + 1, e);
        }
    }

