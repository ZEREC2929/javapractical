public class Stringpractical5 {
    public static void main(String[] args) {
       
        String str = "CHARUSAT UNIVERSITY";
        
       
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
       
        String replacedStr = str.replace('H', 'A'); 
        System.out.println("String after replacing 'H': " + replacedStr);
        
       
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);
    }
}
