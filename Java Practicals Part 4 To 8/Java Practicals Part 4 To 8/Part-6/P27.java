import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class example
{
    public static void main(String[] args)
    {
        String filePath = "D:\\JAVA\\Individual-Java-Programs\\HELLO.txt"; 
        
        Path path = Paths.get(filePath);
        
        try
        {
            if (Files.exists(path))
            {  
                Files.lines(path).forEach(System.out::println);
            }
            else
            {
                System.out.println("Error: File not found at path " + filePath);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error while reading the file: " + e.getMessage());
        }
    }
}