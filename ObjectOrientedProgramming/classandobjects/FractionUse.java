package ObjectOrientedProgramming.classandobjects;

public class FractionUse {
   public static void main(String[] args){
    Fraction f1 = new Fraction(10, 6);
   //  f1.increment();
    f1.print();
    
    Fraction f2 = new Fraction(4, 3);
    try {
      f2.setDenominator(0);
   } catch (nonZeroDenominator e) {
      System.out.println("Denominator must not be zero");
      e.printStackTrace();
   }
      f2.print();
      // f1.add(f2);
      // f1.print();
      // f1.subtract(f2);
      // f1.print();
      f1.product(f2);
      f1.print();

      // Fraction f3 = Fraction.add(f1,f2);
      // f3.print();

      // Fraction f4 = Fraction.subtract( f1,  f2);
      // f4.print();

      // Fraction f5 = Fraction.product(f1, f2);
      // f5.print();
   }
}
