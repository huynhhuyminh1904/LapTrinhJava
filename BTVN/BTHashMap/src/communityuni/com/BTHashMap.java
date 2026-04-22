package communityuni.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BTHashMap {

	public static void main(String[] args) {
		// Khai báo HashMap: Key là Integer (Mã sách), Value là String (Tên sách)
		HashMap<Integer, String> dicBook = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);

		// 1. THÊM SÁCH
		dicBook.put(101, "Lập trình Java cơ bản");
		dicBook.put(102, "Cấu trúc dữ liệu và Giải thuật");
		dicBook.put(103, "Tâm lý học tội phạm");
		System.out.println("Đã thêm thành công 3 cuốn sách mẫu.");

		// 2. XUẤT DANH SÁCH
		System.out.println("\n--- DANH SÁCH SÁCH TRONG KHO ---");
		for (Map.Entry<Integer, String> entry : dicBook.entrySet()) {
			System.out.println("Mã: " + entry.getKey() + " | Tên sách: " + entry.getValue());
		}

		// 3. SỬA TÊN SÁCH
		System.out.print("\nNhập mã sách cần sửa tên: ");
		int maSua = sc.nextInt();
		sc.nextLine(); // Chống trôi lệnh
		if (dicBook.containsKey(maSua)) {
			System.out.print("Nhập tên mới cho sách: ");
			String tenMoi = sc.nextLine();
			dicBook.put(maSua, tenMoi);
			System.out.println("Cập nhật thành công!");
		} else {
			System.out.println("Mã sách không tồn tại!");
		}

		// 4. XÓA SÁCH
		System.out.print("\nNhập mã sách muốn xóa: ");
		int maXoa = sc.nextInt();
		if (dicBook.containsKey(maXoa)) {
			dicBook.remove(maXoa);
			System.out.println("Đã xóa sách có mã " + maXoa);
		} else {
			System.out.println("Không tìm thấy mã sách để xóa.");
		}

		// 5. TÌM KIẾM
		System.out.print("\nNhập mã sách cần tìm: ");
		int maTim = sc.nextInt();
		if (dicBook.containsKey(maTim)) {
			System.out.println("Kết quả tìm kiếm: " + dicBook.get(maTim));
		} else {
			System.out.println("Rất tiếc, mã sách này không có trong kho.");
		}

		// Xuất lại danh sách sau cùng để kiểm tra
		System.out.println("\nDanh sách sau khi thay đổi: " + dicBook);
		
		sc.close();
	}
}