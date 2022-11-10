package ObjectOrientedProgramming.ExceptionHandling;

class negativeException extends Exception{

}

public class ExceptionDemo {

    public static int divide(int a, int b) throws DivideByZeroException, negativeException{
        if(b == 0){
            // throw new ArithmeticException();
            throw new DivideByZeroException();
        }
        if(b < 0){
            throw new negativeException();
        }
        return a/b;
    }
    public static void main(String[] args){

        try{
            divide(10, -2);
        } catch(DivideByZeroException e){
            System.out.println("divide by zero exception");
        } catch (negativeException n){
            System.out.println("denominator is negative");
        } finally{
            System.out.println("Finally block is always executed");
        }
    }
}
