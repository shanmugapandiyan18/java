import java.util.Scanner;

public class NumberSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of series (1-5): ");
        int seriesType = scanner.nextInt();

        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        switch (seriesType) {
            case 1:
                printNaturalNumbers(numTerms);
                break;
            case 2:
                printEvenNumbers(numTerms);
                break;
            case 3:
                printOddNumbers(numTerms);
                break;
            case 4:
                printFibonacciSeries(numTerms);
                break;
            case 5:
                System.out.print("Enter the first term (a): ");
                int firstTerm = scanner.nextInt();
                System.out.print("Enter the common difference (d): ");
                int commonDifference = scanner.nextInt();
                printArithmeticProgression(numTerms, firstTerm, commonDifference);
                break;
            default:
                System.out.println("Invalid series type.");
        }

        scanner.close();
    }

    static void printNaturalNumbers(int numTerms) {
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void printEvenNumbers(int numTerms) {
        for (int i = 2; i <= numTerms * 2; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void printOddNumbers(int numTerms) {
        for (int i = 1; i <= numTerms * 2; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void printFibonacciSeries(int numTerms) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < numTerms; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
`    static void printArithmeticProgression(int numTerms, int firstTerm, int commonDifference) {
        for (int i = 0; i < numTerms; i++) {
            System.out.print(firstTerm + (i * commonDifference) + " ");
        }
        System.out.println();
    }
}
