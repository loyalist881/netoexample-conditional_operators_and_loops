import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Введите год:");
            String lineYear = scanner.nextLine();
            if (lineYear.equals("end")) {
                System.out.println("Конец программы");
                break;
            }
            int year = Integer.parseInt(lineYear);
            int correctDays = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? 366 : 365;
            System.out.println("Введите количество дней:");
            String lineDays = scanner.nextLine();
            int days = Integer.parseInt(lineDays);
            if (days == correctDays) {
                sum++;
            } else {
                System.out.println("Неправильно! В этом году " + correctDays +  " дней!");
                System.out.println("Набрано очков: " + sum);
                break;
            }
        }
    }
}