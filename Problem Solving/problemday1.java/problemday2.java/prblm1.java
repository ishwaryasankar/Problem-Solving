import java.util.Scanner;
public class prblm1 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
               double a  = scanner.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        System.out.printf("%.2f", area);

    }
}
