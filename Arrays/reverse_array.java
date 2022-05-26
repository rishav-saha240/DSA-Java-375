package Arrays;



public class reverse_array {

    static void reverseArray(int arr[], int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = arr[start];
        reverseArray(arr, start+1, end-1);
    }

    static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i+=1) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr);
        reverseArray(arr, 0, arr.length-1);
        System.out.println();
        printArray(arr);
    }
}
