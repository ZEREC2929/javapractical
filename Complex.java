import java.util.Scanner;

public class Complex {
    private final int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        return new Complex(this.real * other.real - this.imaginary * other.imaginary, 
                           this.real * other.imaginary + this.imaginary * other.real);
    }

    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Complex c1 = new Complex(scanner.nextInt(), scanner.nextInt());
        Complex c2 = new Complex(scanner.nextInt(), scanner.nextInt());

        c1.add(c2).display();      
        c1.subtract(c2).display(); 
        c1.multiply(c2).display(); 

        scanner.close();
    }

    public int getReal() {
        return real;
    }
}
