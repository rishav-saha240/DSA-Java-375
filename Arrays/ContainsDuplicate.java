package Arrays;
import java.io.*;
import java.util.HashSet;

public class ContainsDuplicate {

    static boolean containsDuplicate(int intArr[]) {
        HashSet<Integer> hash = new HashSet<Integer>();

        for (int i:intArr)
            hash.add(i);

        if (hash.size() == intArr.length)
            return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String inp = br.readLine();
        String strArr[] = inp.split(",");
        int[] intArr = new int[strArr.length];

        for(int i=0;i<strArr.length;i+=1)
            intArr[i] = Integer.parseInt(strArr[i]);
        
        System.out.print(containsDuplicate(intArr));
    }
}

/*
Inputs:

1) 1,2,3,1
2) 1,2,3,4
3) 1,1,1,3,3,4,3,2,4,2
*/
