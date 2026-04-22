package communityuni.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BTMang {

	// Hàm kiểm tra số nguyên tố
	public static boolean laSoNguyenTo(int n) {
		if (n < 2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("Nhập số lượng phần tử N: ");
		int n = sc.nextInt();
		int[] M = new int[n];

		// 1. Nhập mảng ngẫu nhiên và Xuất toàn bộ mảng
		System.out.print("Mảng ngẫu nhiên được tạo là: ");
		for (int i = 0; i < n; i++) {
			M[i] = rd.nextInt(100);
			System.out.print(M[i] + " ");
		}
		System.out.println();

		// 2. Tính tổng mảng
		int tong = 0;
		for (int x : M) tong += x;
		System.out.println("Tổng mảng: " + tong);

		// 3. Tìm số lần xuất hiện của K
		System.out.print("Nhập số K để kiểm tra: ");
		int k = sc.nextInt();
		int demK = 0;
		for (int x : M) {
			if (x == k) demK++;
		}
		System.out.println("Số " + k + " xuất hiện " + demK + " lần.");

		// 4 & 5. Tìm Max và Min
		int max = M[0], min = M[0];
		for (int i = 1; i < n; i++) {
			if (M[i] > max) max = M[i];
			if (M[i] < min) min = M[i];
		}
		System.out.println("Phần tử lớn nhất: " + max);
		System.out.println("Phần tử nhỏ nhất: " + min);

		// 6. Xuất các số nguyên tố
		System.out.print("Các số nguyên tố trong mảng: ");
		for (int x : M) {
			if (laSoNguyenTo(x)) System.out.print(x + " ");
		}
		System.out.println();

		// 7. Sắp xếp mảng tăng dần
		Arrays.sort(M);
		System.out.println("Mảng tăng dần: " + Arrays.toString(M));

		// 8. Sắp xếp mảng giảm dần
		System.out.print("Mảng giảm dần: ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(M[i] + " ");
		}
		System.out.println();
		
		sc.close();
	}
}