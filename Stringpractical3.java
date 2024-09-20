public class Stringpractical3 {
    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) + "" + str.charAt(i);  
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));        
        System.out.println(doubleChar("AAbb"));     
        System.out.println(doubleChar("Hi-There")); 
    }
}
