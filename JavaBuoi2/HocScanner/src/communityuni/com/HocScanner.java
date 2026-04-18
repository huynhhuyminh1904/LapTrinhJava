package communityuni.com;

import java.util.Scanner;

public class HocScanner {

	public static void main(String[] args) {
		
		// --- 1. NHẬP SỐ NGUYÊN (int) ---
		System.out.println("1. Nhập số nguyên:");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Giá trị số nguyên: " + a);
		
		
		// --- 2. NHẬP SỐ THỰC (double, float) ---
		System.out.println("\n2. Nhập số double:");
		double d = new Scanner(System.in).nextDouble();
		
		System.out.println("Nhập số float:");
		float f = new Scanner(System.in).nextFloat();
		System.out.println("Giá trị thực: d=" + d + ", f=" + f);
		
		
		// --- 3. NHẬP CHUỖI (String) ---
		System.out.println("\n3. Mời bạn nhập tên (Chuỗi):");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("Tên bạn là: " + ten);
		
		
		// --- 4. NHẬP CHUỖI VÀ SỐ, HOẶC CHUỖI LIÊN TỤC ---
		System.out.println("\n4. Nhập địa chỉ (Chuỗi):");
		String s = new Scanner(System.in).nextLine();
		
		System.out.println("Nhập mã số (Số):");
		int x = new Scanner(System.in).nextInt();
		
		System.out.println("Kết quả mục 4: Địa chỉ: " + s + " | Mã số: " + x);

	}
}