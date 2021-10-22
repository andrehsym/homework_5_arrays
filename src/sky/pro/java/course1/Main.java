package sky.pro.java.course1;
import java.sql.SQLOutput;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        //ЗАДАЧА 1
        System.out.println("ЗАДАЧА 1");

        int[] arr = generateRandomArray();

        double sumMonth=0;
        for (int k : arr) {
            sumMonth = sumMonth + k;
        }
        System.out.println("Сумма трат за месяц составила " + (int)sumMonth + " рублей");

        System.out.println(" ");

        //ЗАДАЧА 2
        System.out.println("ЗАДАЧА 2");

        int minSpend=arr[0];
        int maxSpend = arr[0];
        for (int i : arr ) {
            if (minSpend > i) {
                minSpend = i;
            }
        }

        for (int j : arr) {
            if (maxSpend < j) {
                maxSpend = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpend + " рублей." +
                                                " Максимальная сумма трат за день составила " + maxSpend + " рублей.");

        System.out.println(" ");

        //ЗАДАЧА 3
        System.out.println("ЗАДАЧА 3");

        int reportMonth = 30; //создаем переменную с количеством отчетных дней из условия задачи
        double meanSpend = sumMonth/reportMonth;
        String formattedMeanSpend = String.format("%.2f", meanSpend);
        //для красоты, чтобы выводилось 2 знака после точки, а не десять

        System.out.println("Средняя сумма трат за месяц составила " + formattedMeanSpend + " рублей.");

        System.out.println(" ");

        //ЗАДАЧА 4
        System.out.println("ЗАДАЧА 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int t = reverseFullName.length; t > 0; t--) {
            System.out.print(reverseFullName[t-1]);
        }

        System.out.println(" ");
        }







    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
