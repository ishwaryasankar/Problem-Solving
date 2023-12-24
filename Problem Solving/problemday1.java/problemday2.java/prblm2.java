import java.util.Scanner;
public class prblm2 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double kilometers = scanner.nextDouble();
    double meters = kilometers * 1000;
    double centimeters = kilometers * 100000;
    System.out.printf("%.0f\n%.0f\n", meters, centimeters);
}
}

