package ObjectOrientedProgramming.generics;

public class Pair2Use {
    public static void main(String[] args){
        Pair2<String, Integer> pInner = new Pair2<>("ab", 100);
        Pair2<String, Integer> pInner2 = new Pair2<>("cd", 200);
        Pair2<Pair2<String, Integer>, Pair2<String, Integer>> p = new Pair2<>();
        p.setFirst(pInner);
        p.setSecond(pInner2);
        System.out.println(p.getFirst()+" "+p.getSecond());
        System.out.println(p.getFirst().getFirst()+" "+p.getFirst().getSecond());
        System.out.println(p.getSecond().getFirst()+" "+p.getSecond().getSecond());
    }
}
