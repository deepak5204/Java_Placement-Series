package ObjectOrientedProgramming.classandobjects;

public class PolynomialUse {
    public static void main(String[] args){
        Polynomial p1 = new Polynomial();
        // p1.setCoefficient(1, 04);
        p1.setCoefficient(2, 4);
        p1.setCoefficient(3,07);
        p1.setCoefficient(4, 5);
        p1.printPolynomial();

        Polynomial p2 = new Polynomial();
        p2.setCoefficient(2, 3);
        p2.setCoefficient(3, 5);
        p2.setCoefficient(5, 7);
        p2.printPolynomial();

        // p1.addPolynomial(p2);
        // p1.printPolynomial();

        // p1.subPolynomial(p2);
        // p1.printPolynomial();

        addPolynomial_2(p1, p2);

        // p.add(9);
        // p.add(7);
        // p.add(5);
        // System.out.println(p.getSize());

    }

    private static void addPolynomial_2(Polynomial p1, Polynomial p2) {
    }
}
