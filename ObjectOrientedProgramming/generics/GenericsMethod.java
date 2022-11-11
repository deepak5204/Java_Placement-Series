package ObjectOrientedProgramming.generics;

public class GenericsMethod {
    // print array
    public static <T> void printArray(T [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        printArray(arr);

        String[] strArr = new String[5];
        for(int i = 0; i < strArr.length; i++){
            strArr[i] = "abcdef";
        }
        printArray(strArr);

        Vehicle v[] = new Vehicle[5];
        for(int i = 0; i < v.length; i++){
            v[i] = new Vehicle();
        }
        printArray(v);
    }
}
