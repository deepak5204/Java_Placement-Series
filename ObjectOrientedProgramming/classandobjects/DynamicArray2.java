package ObjectOrientedProgramming.classandobjects;

import java.util.ArrayList;

public class DynamicArray2 {
    ArrayList<Integer> seq = new ArrayList<>();
    ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();
    int lastAns = 0;

    // constructor
    public DynamicArray2(int n){
        for(int i = 0; i < n; i++){
            seq = new ArrayList<>();
            seqList.add(seq);
        }
    }

    public void appendValue(int x, int y, int n){
        int rowIndex = (x ^ lastAns) % n;
        ArrayList<Integer> seq = seqList.get(rowIndex);
        seq.add(y);
    }

    public void printValue(int x, int y, int n){
        int colIndex = 0;
        int rowIndex = (x ^ lastAns) % n;
        ArrayList<Integer> seq = seqList.get(rowIndex);
        colIndex = y % seq.size();
        lastAns = seq.get(colIndex);
        System.out.println(lastAns);
    }

}
