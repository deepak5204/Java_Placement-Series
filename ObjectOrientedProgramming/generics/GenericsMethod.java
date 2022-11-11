package ObjectOrientedProgramming.generics;

public class GenericsMethod {
    // print array
    public static <T extends PrintInterface> void printArray(T [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
            // System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer [] arr = new Integer[5];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = i + 1;
        // }
        // printArray(arr);

        // String[] strArr = new String[5];
        // for(int i = 0; i < strArr.length; i++){
        //     strArr[i] = "abcdef";
        // }
        // printArray(strArr);

        Vehicle v[] = new Vehicle[5];
        for(int i = 0; i < v.length; i++){
            v[i] = new Vehicle(200, "car");
        }
        printArray(v);

        Student students[] = new Student[5];
        for(int i = 0; i < students.length; i++){
            students[i] = new Student(100+i+1);
        }
        printArray(students);
    }
}
