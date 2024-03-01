import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");

        int n = scanner.nextInt();

        int maxNum = 0;
        int predMax = 0;

        int[] array = new int[n];

        for(int i = 0; i < array.length; i++) {
            System.out.print("Введите число под номером " + (i+1) + ": "  );
            array[i] = scanner.nextInt();

        }

        for (int num : array) {
            if (num > maxNum) {
                predMax = maxNum;
                maxNum = num;
            }
        }
        System.out.println("Максимальное число: " + maxNum);
        System.out.println("Предмаксимальное число: " + predMax);
    }
}