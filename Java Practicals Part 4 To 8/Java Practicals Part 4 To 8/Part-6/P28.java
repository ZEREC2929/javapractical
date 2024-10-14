import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P28
{
    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            // System.out.println("Usage: java CharacterCounter <character>");
            return;
        }

        char targetChar = args[0].charAt(0);
        String fileName = "HELLO.txt";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                for (char c : line.toCharArray())
                {
                    if (c == targetChar)
                    {
                        count++;
                    }
                }
            }
            System.out.println("The character '" + targetChar + "' appears " + count + " times in " + fileName + ".");
        }
        catch (IOException e)
        {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}