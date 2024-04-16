import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // Kiểm tra số chẵn
                sum += i; // Thêm số chẵn vào tổng
            }
        }

        System.out.println("Tong cac so chan tu " + n + " la: " + sum);
    }
}