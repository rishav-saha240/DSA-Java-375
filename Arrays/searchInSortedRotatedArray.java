package Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class searchInSortedRotatedArray {
    
    static int findPivot(int[] arr, int low, int high) {
        // base case
        if (high < low)
            return -1;
        if (high == low)
            return low;

        int mid = (low+high)/2;
        if (mid < high && arr[mid] > arr[mid+1])
            return mid;
        if (mid > low && arr[mid] < arr[mid-1])
            return mid-1;
        if (arr[mid] <= arr[low])
            return findPivot(arr, low, mid-1);
        return findPivot(arr, mid+1, high);
    }

    static int binarySearch(int arr[], int low, int high, int key) {
        if (high < low)
            return -1;
        
        int mid = (high + low)/2;
        if (key == arr[mid])
            return mid;
        if (arr[mid] < key)
            return binarySearch(arr, mid+1, high, key);
        else
            return binarySearch(arr, low, mid-1, key);
    }

    static int pivotedBinarySearch(int arr[], int n, int key) {
        int pivot = findPivot(arr, 0, n-1);

        if (pivot == -1)
            return binarySearch(arr, 0, n-1, key);

        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return binarySearch(arr, 0, pivot-1, key);
        else
            return binarySearch(arr, pivot+1, n-1, key);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter array: ");
        String inp = br.readLine();
        String[] strArr = inp.split(", ");
        
        int[] intArr = new int[strArr.length];
        for (int i=0;i<strArr.length;i+=1)
            intArr[i] = Integer.parseInt(strArr[i]);

        System.out.print("Enter number to search: ");
        int key = Integer.parseInt(br.readLine());
        System.out.println("\nIndex of the element is " + pivotedBinarySearch(intArr, intArr.length, key));

    }    
}
