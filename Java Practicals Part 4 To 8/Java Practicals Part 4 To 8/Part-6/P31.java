import java.io.*;

public class P31 {

    public static void main(String[] args) {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter fileWriter = null;

        try {
            System.out.print("Enter the name of the output file: ");
            String outputFileName = consoleReader.readLine();

            fileWriter = new BufferedWriter(new FileWriter(outputFileName));

            System.out.println("Enter text to write to the file (type 'exit' to finish):");

            String inputLine;
            while (true) {
                inputLine = consoleReader.readLine();
                if ("exit".equalsIgnoreCase(inputLine)) {
                    break;
                }
                fileWriter.write(inputLine);
                fileWriter.newLine();
            }

            System.out.println("Data has been written to '" + outputFileName + "' successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                consoleReader.close();
            } catch (IOException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }

        String byteFileName = "byteData.dat";
        try (FileOutputStream fos = new FileOutputStream(byteFileName)) {
            String byteData = "This is some sample byte data.";
            fos.write(byteData.getBytes());
            System.out.println("Byte data has been written to '" + byteFileName + "' successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing byte data: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(byteFileName)) {
            int byteContent;
            System.out.print("Reading byte data: ");
            while ((byteContent = fis.read()) != -1) {
                System.out.print((char) byteContent);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("An error occurred while reading byte data: " + e.getMessage());
        }
    }
}