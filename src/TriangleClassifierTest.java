import java.util.Scanner;
public class TriangleClassifierTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cạnh 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("nhập cạnh 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("nhập cạnh 3: ");
        double side3 = scanner.nextDouble();
        TriangleClassifier triangle = new TriangleClassifier(side1,side2,side3);
        System.out.println(triangle.toString()+triangle.display());
    }
}
