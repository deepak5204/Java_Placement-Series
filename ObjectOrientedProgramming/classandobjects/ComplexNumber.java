package ObjectOrientedProgramming.classandobjects;

public class ComplexNumber {
    int realNo;
    int imaginaryNo;


    public ComplexNumber(int realNo, int imaginaryNo){
         this.realNo = realNo; 
         this.imaginaryNo = imaginaryNo;

    }

    //print complex Number

    public void print(){
        System.out.println(realNo +" + "+ imaginaryNo+"i");
    }

    //add complex number and update in first complex number
    public void add(ComplexNumber c2) {
        this.realNo = this.realNo + c2.realNo;
        this.imaginaryNo = this.imaginaryNo + c2.imaginaryNo;
    }

    //multiply two complex number
    public void prod(ComplexNumber c2){ 
        // this.realNo = (this.realNo * c2.realNo) + (this.imaginaryNo * c2.realNo) + (this.realNo * c2.imaginaryNo - this.imaginaryNo * c2.imaginaryNo);
        int temp = this.realNo;
        this.realNo = (this.realNo * c2.realNo) - (this.imaginaryNo * c2.imaginaryNo);
         this.imaginaryNo =  (temp * c2.imaginaryNo) + (this.imaginaryNo * c2.realNo);

        // ComplexNumber(newRealNo, newImaginaryNo);

    }
 
}


  