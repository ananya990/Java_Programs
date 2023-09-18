public class AddComplexNo
{
    double real;
    double imag;

    public Complex(double real, double imag) 
    {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) 
    {
        Complex n1 = new Complex(1.4, 6.5),
                n2 = new Complex(2.0, 2.8),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}
