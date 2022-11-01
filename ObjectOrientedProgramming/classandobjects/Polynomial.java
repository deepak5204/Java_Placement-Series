package ObjectOrientedProgramming.classandobjects;

public class Polynomial {

    private int DA[];
    private int nextEltsIndex;

    public Polynomial() {
        DA = new int[2];
        nextEltsIndex = 0;
    }

    // set coefficient
    public void setCoefficient(int deg, int coff) {
        if (deg >= nextEltsIndex) {
            doubleCapicity();
        }
        DA[deg] = coff;
        nextEltsIndex++;
    }

    // print polynomial
    public void printPolynomial() {
        System.out.println();
        int term = 0;
        for (int i = 0; i < DA.length; i++) {
            if (DA[i] != 0) {
                if (term != 0) {
                    System.out.print("+ ");
                }
                System.out.print(DA[i] + "x^" + i + " ");
                term++;
            }
        }
    }


    // Add polynomial
    public void addPolynomial(Polynomial p) {
        for (int i = 0; i < DA.length; i++) {
            this.DA[i] = this.DA[i] + p.DA[i];
        }
    }

    // Second way of addition
    // public Polynomial addPolynomial_2(Polynomial p1, Polynomial p2){
    //     for (int i = 0; i < DA.length; i++) {
    //     DA[i] = p1.DA[i] + p2.DA[i];
    //     }
    // }


    // subtract polynomial
    public void subPolynomial(Polynomial p) {
        for (int i = 0; i < DA.length; i++) {
            this.DA[i] = this.DA[i] - p.DA[i];
        }
    }

    public int getSize() {
        return nextEltsIndex;
    }

    public void doubleCapicity() {
        int temp[] = DA;
        DA = new int[temp.length * 2];

        for (int i = 0; i < temp.length; i++) {
            DA[i] = temp[i];
        }
    }

    public void add(int value) {

        if (nextEltsIndex == DA.length) {
            doubleCapicity();
        }

        DA[nextEltsIndex] = value;
        nextEltsIndex++;
    }

}
