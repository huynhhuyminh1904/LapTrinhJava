package communityuni.com;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuongTrinhNhapSoTuNhien {

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] M = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("M[" + i + "] = ");
            M[i] = scanner.nextInt();
        }

        // Khởi tạo các danh sách để phân loại
        ArrayList<Integer> soLe = new ArrayList<>();
        ArrayList<Integer> soChan = new ArrayList<>();
        ArrayList<Integer> soNguyenTo = new ArrayList<>();
        ArrayList<Integer> khongPhaiSNT = new ArrayList<>();

        for (int x : M) {
            // Phân loại chẵn lẻ
            if (x % 2 != 0) soLe.add(x);
            else soChan.add(x);

            // Phân loại số nguyên tố
            if (isPrime(x)) soNguyenTo.add(x);
            else khongPhaiSNT.add(x);
        }

        // Xuất kết quả
        System.out.println("\nKẾT QUẢ:");
        
        // Dòng 1: Số lẻ
        System.out.print("Dòng 1 (Số lẻ): ");
        for (int x : soLe) System.out.print(x + " ");
        System.out.println("-> Tổng cộng có " + soLe.size() + " số lẻ.");

        // Dòng 2: Số chẵn
        System.out.print("Dòng 2 (Số chẵn): ");
        for (int x : soChan) System.out.print(x + " ");
        System.out.println("-> Tổng cộng có " + soChan.size() + " số chẵn.");

        // Dòng 3: Số nguyên tố
        System.out.print("Dòng 3 (Số nguyên tố): ");
        for (int x : soNguyenTo) System.out.print(x + " ");
        System.out.println();

        // Dòng 4: Không phải số nguyên tố
        System.out.print("Dòng 4 (Không phải SNT): ");
        for (int x : khongPhaiSNT) System.out.print(x + " ");
        System.out.println();

        scanner.close();
    }
}
