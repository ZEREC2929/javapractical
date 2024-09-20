import java.util.Scanner;

public class Stringpractical4 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
       
        int length = input.length();
        System.out.println("Length of the string: " + length);
        
       
        String lower = input.toLowerCase();
        System.out.println("Lowercase: " + lower);
        
        
        String upper = input.toUpperCase();
        System.out.println("Uppercase: " + upper);
        
        
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reverse);
        
        scanner.close();
    }
}
