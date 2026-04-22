package communityuni.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BTArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> dsSo = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		// 1. THÊM (Nhập danh sách)
		System.out.print("Bạn muốn nhập bao nhiêu số? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập số thứ " + (i + 1) + ": ");
			int value = sc.nextInt();
			dsSo.add(value);
		}
		System.out.println("Danh sách vừa nhập: " + dsSo);

		// 2. SỬA
		System.out.print("\nBạn muốn sửa phần tử tại vị trí index thứ mấy? ");
		int indexSua = sc.nextInt();
		if (indexSua >= 0 && indexSua < dsSo.size()) {
			System.out.print("Nhập giá trị mới: ");
			int giaTriMoi = sc.nextInt();
			dsSo.set(indexSua, giaTriMoi);
			System.out.println("Sau khi sửa: " + dsSo);
		} else {
			System.out.println("Vị trí không hợp lệ!");
		}

		// 3. XÓA
		System.out.print("\nBạn muốn xóa phần tử tại index thứ mấy? ");
		int indexXoa = sc.nextInt();
		if (indexXoa >= 0 && indexXoa < dsSo.size()) {
			dsSo.remove(indexXoa);
			System.out.println("Sau khi xóa: " + dsSo);
		} else {
			System.out.println("Vị trí không hợp lệ!");
		}

		// 4. TÌM KIẾM
		System.out.print("\nNhập số cần tìm trong danh sách: ");
		int soTim = sc.nextInt();
		if (dsSo.contains(soTim)) {
			System.out.println("Tìm thấy " + soTim + " tại vị trí index: " + dsSo.indexOf(soTim));
		} else {
			System.out.println("Không tìm thấy " + soTim + " trong danh sách.");
		}

		// 5. SẮP XẾP
		Collections.sort(dsSo);
		System.out.println("\nDanh sách sau khi sắp xếp tăng dần: " + dsSo);
		
		Collections.reverse(dsSo);
		System.out.println("Danh sách sau khi sắp xếp giảm dần: " + dsSo);

		sc.close();
	}
}