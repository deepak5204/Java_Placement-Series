package Recursion;

import java.util.Arrays;

public class MergeSort {

    public static void merg(int[] fh, int[] sh, int[] arr) {

        int[] mrg = new int[fh.length + sh.length];

        int fi = 0;
        int si = 0;
        int x = 0;

        // check element size of divide array and assign in merge array
        while (fi < fh.length && si < sh.length) {
            if (fh[fi] <= sh[si]) {
                mrg[x] = fh[fi];
                x++;
                fi++;
            } else {
                mrg[x] = sh[si];
                x++;
                si++;
            }
        }

        //if first half array than copy to merg array
        while (fi < fh.length) {
            mrg[x] = fh[fi];
            fi++;
            x++;
        }

        //if first half array than copy to merg array
        while (si < sh.length) {
            mrg[x] = sh[si];
            si++;
            x++;
        }

        // copy element from mergedArr to original array
        for (int i = 0; i < mrg.length; i++) {
            arr[i] = mrg[i];
        }
    }

    public static void divide(int[] arr) {
        if (arr.length <= 0) {
            return;
        }
        int[] fh = new int[arr.length / 2];
        // System.out.println(fh.length);
        int[] sh = new int[arr.length - fh.length];
        // System.out.println(sh.length);

        for (int i = 0; i < fh.length; i++) {
            fh[i] = arr[i];
        }

        for (int i = 0; i < sh.length; i++) {
            sh[i] = arr[fh.length + i];
        }

        //sort first half and second half arr by using sort function
        Arrays.sort(fh);
        Arrays.sort(sh);

        //call merg function for merg the tow sorted array
        merg(fh, sh, arr);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 4, 5 };
        divide(arr);

        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
