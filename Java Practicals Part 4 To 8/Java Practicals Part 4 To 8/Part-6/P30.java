import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P30
{

    public static void copyFile(String sourcePath, String destinationPath)
    {
        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);

        try (FileReader fileReader = new FileReader(sourceFile);
             FileWriter fileWriter = new FileWriter(destinationFile))
        {

            if (!destinationFile.exists())
            {
                destinationFile.createNewFile();
            }

            char[] buffer = new char[1024];
            int bytesRead;

            while ((bytesRead = fileReader.read(buffer)) != -1)
            {
                fileWriter.write(buffer, 0, bytesRead);
            }

            System.out.println("Data copied from '" + sourcePath + "' to '" + destinationPath + "' successfully.");
        }
        catch (IOException e)
        {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        String sourcePath = "source.txt";
        String destinationPath = "destination.txt";
        copyFile(sourcePath, destinationPath);
    }
}