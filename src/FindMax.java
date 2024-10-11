import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        int range;
        int arr[][];

        do {
            System.out.print("Enter the rows of the array: ");
            rows = scanner.nextInt();
            if (rows > 5) {
                System.out.println("Row does not exceed 5");
            }
        } while (rows > 5);
        do {
            System.out.print("Enter the cols of the array: ");
            cols = scanner.nextInt();
            if (cols > 10) {
                System.out.println("cols does not exceed 10");
            }
        } while (cols > 10);
        arr = new int[rows][cols];

        do {
            System.out.print("Enter the range of elements, from 0 to: ");
            range = scanner.nextInt();
            if (range > 50) {
                System.out.println("Range does not exceed 50");
            }
        } while (range > 50);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = (int) Math.round(Math.random() * range);
            }
        }

        System.out.println("The array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int indexI = 0, indexJ = 0;
        int max = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println("Max length is " + max + ", position at rows " + (indexI + 1) + ", columns " + (indexJ + 1));
    }
}
