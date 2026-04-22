package communityuni.com;

public class LayTenBaiHat {

	public static void main(String[] args) {
		String path = "D:/music/bolero/longme.mp3";
		
		// 1. Lấy tên bài hát kèm đuôi (longme.mp3)
		// Tìm vị trí cuối cùng của dấu '/'
		int lastSlashIndex = path.lastIndexOf("/");
		String tenKemDuoi = path.substring(lastSlashIndex + 1);
		
		// 2. Lấy tên bài hát không kèm đuôi (longme)
		// Tìm vị trí cuối cùng của dấu '.'
		int lastDotIndex = tenKemDuoi.lastIndexOf(".");
		String tenKhongDuoi = tenKemDuoi.substring(0, lastDotIndex);
		
		// Xuất kết quả ra màn hình
		System.out.println("Đường dẫn gốc: " + path);
		System.out.println("Tên bài hát có đuôi: " + tenKemDuoi);
		System.out.println("Tên bài hát không có đuôi: " + tenKhongDuoi);
	}
}
