public class MergeSort {
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void mergeSort(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = start + (end -start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        merge(arr, start, mid, end);
    }

    //merge method to merge the sorted parts
    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end-start+1];
        int i = start; //idx for 1st sorted part
        int j = mid+1; //idx for 2nd sorted part
        int k = 0; //idx for temp

        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of 1st sorted part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        //for leftover elements of 2nd sorted part
        while(j <= end) {
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 5, 8, 3};
        mergeSort(arr, 0, arr.length-1);

        printArray(arr);
    }
}