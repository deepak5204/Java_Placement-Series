package ObjectOrientedProgramming.classandobjects;

// import java.lang.reflect.Array;

public class DynamicArrayUse {
    public static void main(String[] args){
        DynamicArray da = new DynamicArray();

        
        // is DAempty?
        // System.out.println(da.isEmpty());

        // get value from index
        // int value = da.getValue(2);
        // System.out.println(value);
        
        // add value in DA
        da.add(20);
        da.add(30);
        da.add(40);
        da.add(50);
        da.add(60);
        // System.out.println(da.getValue(3));

        System.out.println(da.size());
        // add value in middle of the Array
        da.addInMid(2, 100);
        da.addInMid(2, 100);
        
        // get size of DA
        // da.add(70);
        System.out.println(da.size());


        //set value on index
        da.setValue(2, 8);
        // System.out.println(da.getValue(2));
        
    }
}
