package communityuni.com;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceTest {
    private static ArrayList<Invoice> invoiceList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Tạo sẵn dữ liệu mẫu (Mock data) gồm 10 hóa đơn để test nhanh
        initMockData();

        int luaChon;
        do {
            System.out.println("\n========= MENU QUẢN LÝ HÓA ĐƠN =========");
            System.out.println("1. Nhập thêm hóa đơn mới");
            System.out.println("2. Xuất toàn bộ danh sách hóa đơn");
            System.out.println("3. Sắp xếp danh sách (Tăng dần theo Mã mặt hàng & Số lượng)");
            System.out.println("4. Tìm kiếm hóa đơn theo Mã mặt hàng");
            System.out.println("5. Xóa hóa đơn theo Mã mặt hàng");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng (0-5): ");
            
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ nhớ đệm

            switch (luaChon) {
                case 1:
                    nhapInvoice();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 3:
                    sapXepInvoice();
                    break;
                case 4:
                    timKiemInvoice();
                    break;
                case 5:
                    xoaInvoice();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        } while (luaChon != 0);
    }

    // Hàm tạo sẵn 10 dữ liệu giả
    private static void initMockData() {
        invoiceList.add(new Invoice("MS05", "Chuột Logitech", 10, 250000));
        invoiceList.add(new Invoice("MS02", "Bàn phím cơ", 5, 1200000));
        invoiceList.add(new Invoice("MS01", "Màn hình Dell", 2, 4500000));
        invoiceList.add(new Invoice("MS08", "Tai nghe Gaming", 15, 600000));
        invoiceList.add(new Invoice("MS01", "Màn hình ASUS", 4, 3900000)); // Trùng mã MS01 để test sắp xếp theo số lượng
        invoiceList.add(new Invoice("MS04", "Ổ cứng SSD 512GB", 8, 1100000));
        invoiceList.add(new Invoice("MS09", "Ram DDR4 16GB", 20, 950000));
        invoiceList.add(new Invoice("MS03", "Mainboard MSI", 3, 3200000));
        invoiceList.add(new Invoice("MS07", "Nguồn Máy Tính", 7, 1350000));
        invoiceList.add(new Invoice("MS06", "Vỏ Case Gaming", 12, 850000));
    }

    // Chức năng 1: Nhập hóa đơn mới và chặn trùng mã
    private static void nhapInvoice() {
        System.out.print("Nhập mã mặt hàng: ");
        String partNumber = scanner.nextLine();

        // Kiểm tra xem mã đã tồn tại trong danh sách chưa
        for (Invoice inv : invoiceList) {
            if (inv.getPartNumber().equalsIgnoreCase(partNumber)) {
                System.out.println("Lỗi: Mã mặt hàng này đã tồn tại! Không được nhập trùng.");
                return;
            }
        }

        System.out.print("Nhập mô tả mặt hàng: ");
        String partDescription = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        int quantity = scanner.nextInt();
        System.out.print("Nhập giá mỗi mặt hàng: ");
        double pricePerItem = scanner.nextDouble();

        Invoice newInvoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);
        invoiceList.add(newInvoice);
        System.out.println("Thêm hóa đơn thành công!");
    }

    // Chức năng 2: Xuất danh sách hóa đơn
    private static void xuatDanhSach() {
        if (invoiceList.isEmpty()) {
            System.out.println("Danh sách hóa đơn đang trống!");
            return;
        }
        System.out.println("\n--- DANH SÁCH HÓA ĐƠN ---");
        for (Invoice inv : invoiceList) {
            System.out.println(inv);
        }
    }

    // Chức năng 3: Sắp xếp nổi bọt (Bubble Sort) theo Mã tăng dần, nếu mã trùng thì xếp theo Số lượng mua tăng dần
    private static void sapXepInvoice() {
        int n = invoiceList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Invoice current = invoiceList.get(j);
                Invoice next = invoiceList.get(j + 1);

                // So sánh theo mã mặt hàng trước
                int compareCode = current.getPartNumber().compareTo(next.getPartNumber());

                if (compareCode > 0 || (compareCode == 0 && current.getQuantity() > next.getQuantity())) {
                    // Tráo đổi vị trí 2 phần tử trong ArrayList
                    invoiceList.set(j, next);
                    invoiceList.set(j + 1, current);
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách tăng dần theo Mã và Số lượng thành công!");
    }

    private static void timKiemInvoice() {
        System.out.print("Nhập mã mặt hàng cần tìm: ");
        String searchCode = scanner.nextLine();
        boolean timThay = false;

        for (Invoice inv : invoiceList) {
            if (inv.getPartNumber().equalsIgnoreCase(searchCode)) {
                System.out.println("Kết quả tìm thấy: " + inv);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy hóa đơn nào có mã: " + searchCode);
        }
    }

    // Chức năng 5: Xóa hóa đơn theo mã mặt hàng
    private static void xoaInvoice() {
        System.out.print("Nhập mã mặt hàng cần xóa: ");
        String deleteCode = scanner.nextLine();
        boolean daXoa = false;

        // Duyệt ngược từ cuối danh sách lên đầu để tránh lỗi bỏ sót phần tử khi xóa trong ArrayList
        for (int i = invoiceList.size() - 1; i >= 0; i--) {
            if (invoiceList.get(i).getPartNumber().equalsIgnoreCase(deleteCode)) {
                invoiceList.remove(i);
                daXoa = true;
            }
        }

        if (daXoa) {
            System.out.println("Đã xóa hóa đơn thành công!");
        } else {
            System.out.println("Không tìm thấy mã mặt hàng để xóa!");
        }
    }
}