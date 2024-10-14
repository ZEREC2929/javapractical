import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P29
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the word to search for: ");
    
        String wordToSearch = scanner.nextLine();

        Integer count = searchWordInFile("sample.txt", wordToSearch);

        if (count != null)
        {
            System.out.println("The word '" + wordToSearch + "' was found " + count + " times.");
        }
        else
        {
            System.out.println("An error occurred while reading the file.");
        }

        scanner.close();
    }

    public static Integer searchWordInFile(String fileName, String word)
    {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                String[] words = line.split("\\W+");
                for (String w : words)
                {
                    if (w.equalsIgnoreCase(word))
                    {
                        count++;
                    }
                }
            }
            return count;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null; 
        }
    }
}