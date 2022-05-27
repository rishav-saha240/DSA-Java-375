package Arrays;

public class NextPermutation {

    private static void nextPermutation(int[] arr) {
        int i = arr.length - 2;

        while (i >= 0 && arr[i+1] <= arr[i]) {
            i -= 1;
        }

        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i])
                j -= 1;
            
            swap(arr, i, j);
        }
        reverse(arr, i+1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int start) {
        int i=start, j=arr.length-1;
        while (i<j) {
            swap(arr, i, j);
            i+=1;
            j-=1;
        }
    }

    private static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i+=1)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] =  {1, 5, 8, 4, 7, 6, 5, 3, 1};
        System.out.print("Original array: ");
        printArray(arr);
        System.out.print("Next permutation: ");
        nextPermutation(arr);
        printArray(arr);
    }
}
