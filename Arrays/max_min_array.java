package Arrays;

public class max_min_array {

    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int low, int high) {
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int mid;

        // If only one element
        if (low == high) {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }

        // If two elements
        if (high == low+1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }

        // If more than 2 elements
        mid = (low + high) / 2;
        mml = getMinMax(arr, low, mid);
        mmr = getMinMax(arr, mid+1, high);

        // Compare minimum of two parts
        if (mml.min < mmr.min)
            minmax.min = mml.min;
        else
            minmax.min = mmr.min;

        if (mml.max < mmr.max)
            minmax.max = mmr.max;
        else
            minmax.max = mml.max;
        
        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = arr.length;
        Pair minmax = getMinMax(arr, 0, arr_size-1);
        System.out.println("Minimum: " + minmax.min);
        System.out.println("Maximum: " + minmax.max);
    }
}