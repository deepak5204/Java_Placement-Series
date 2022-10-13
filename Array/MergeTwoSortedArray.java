package Array;

public class MergeTwoSortedArray {
    public static void main(String[] args){
        int[] arr1 = {1, 4, 7, 9, 11};
        int[] arr2 = {0, 3, 5, 8};

        int idx1 = 0;
        int idx2 = 0;
        int i = 0;
        int [] mrgArr = new int[arr1.length + arr2.length];

        while( idx1 < arr1.length && idx2 < arr2.length){
            if(arr1[idx1] < arr2[idx2]){
                mrgArr[i] = arr1[idx1];
                idx1++;
                i++;
            } else {
                mrgArr[i] = arr2[idx2];
                idx2++;
                i++;
            }
        }

        //if elements remain in array 1 
        while(idx1 < arr1.length){
            mrgArr[i] = arr1[idx1];
            idx1++;
            i++;
        }

        //if elements remain in array 2 
        while(idx2 < arr2.length){
            mrgArr[i] = arr2[idx2];
            idx2++;
            i++;
        }

        //print merge array
        for(int p = 0; p < mrgArr.length; p++){
            System.out.print(mrgArr[p]+" ");
        }
    }
}
