package Arrays;

public class maximum_contiguous_sub_array {

    static int max_contiguous_sub_array_sum(int arr[], int len) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i=0;i<len;i+=1) {
            maxEndingHere += arr[i];
            if (maxEndingHere > maxSoFar)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }
    
    static void printArray(int arr[]) {
        for (int i=0;i<arr.length;i+=1)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.print("Array: ");
        printArray(arr);
        System.out.println("Maximum contiguous sub-array sum: " + max_contiguous_sub_array_sum(arr, arr.length-1));
    }
}
