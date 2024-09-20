import java.util.Scanner;

public class practical3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance (in meters): ");
        double distanceMeters = scanner.nextDouble();

        System.out.print("Enter time (hours): ");
        int hours = scanner.nextInt();
        System.out.print("Enter time (minutes): ");
        int minutes = scanner.nextInt();
        System.out.print("Enter time (seconds): ");
        int seconds = scanner.nextInt();

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        if (totalSeconds == 0) {
            System.out.println("Time cannot be zero.");
            return;
        }

        
        double speedMps = distanceMeters / totalSeconds;

        double distanceKilometers = distanceMeters / 1000;
        double speedKph = distanceKilometers / (totalSeconds / 3600.0);

        double distanceMiles = distanceMeters / 1609;
        double speedMph = distanceMiles / (totalSeconds / 3600.0);

        System.out.printf("Speed: %.2f meters per second%n", speedMps);
        System.out.printf("Speed: %.2f kilometers per hour%n", speedKph);
        System.out.printf("Speed: %.2f miles per hour%n", speedMph);
    }
}