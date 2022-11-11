package ObjectOrientedProgramming.generics;

public class PairUse {
    public static void main(String [] args){

        // multiple type in generics
        Pair<Integer, String> p = new Pair<>(97,"A");
        System.out.println(p.getFirst()+" "+ p.getSecond());

        // int i = 10;
        // Integer i1 = 10;
        /*These are look like similar but both are quite different.
         * 'i' is object and 'i1' is reference of object, we can store null in 'i1' but not in 'i', because in java reference may be null.
         */


        // Pair p = new Pair(10, 20);
        /* if we dont specify the type then it will be type object, and getting value from object is very dangerous because we dont know the type of the value stored in Object because Object is super class of every class in java and it can take any value. */
        // p.getFirst();

        // Pair pS = new Pair("aa", "bb");
        // Pair pD = new Pair(3.14, 4.2);

        // Pair<String> pS = new Pair<String>("Deepak", "Kumar");
        // System.out.println(pS.getFirst() +" "+pS.getSecond());


        // Pair<int> pI = new Pair<>(5, 3);
        // Pair<double> pI = new Pair<>(5.2, 3.4);
        // Pair<char> pI = new Pair<>('P', 'D');

        /* we can not use primitive data types in generics but we can use wrapper class for these data types. Here Integer, Double, Character etc. are Wrapper class. */

        // Pair <Integer> pI = new Pair<>(5,7);
        // Pair <Double> pD = new Pair<>(5.2, 3.4);
        // Pair <Character> pC = new Pair<>('P', 'D');
        // System.out.println(pI.getFirst() +" "+pI.getSecond());
        // System.out.println(pD.getFirst() +" "+pD.getSecond());
        // System.out.println(pC.getFirst() +" "+pC.getSecond());
    }
}
