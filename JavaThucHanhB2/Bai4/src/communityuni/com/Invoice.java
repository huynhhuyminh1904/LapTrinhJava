package communityuni.com;

public class Invoice {
    // 1. Các thuộc tính (Instance variables)
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // 2. Constructor (Hàm khởi tạo) đầy đủ tham số kèm điều kiện ràng buộc
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        
        // Nếu số lượng không dương, đặt thành 0
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        // Nếu giá không dương, đặt thành 0.0
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // 3. Các phương thức Getters và Setters
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // 4. Phương thức tính thành tiền của hóa đơn
    public double getInvoiceAmount() {
        return this.quantity * this.pricePerItem;
    }

    // Ghi đè phương thức toString để in thông tin nhanh chóng
    @Override
    public String toString() {
        return String.format("Mã: %-8s | Mô tả: %-15s | SL: %-4d | Đơn giá: %-8.2f | Thành tiền: %-10.2f", 
                partNumber, partDescription, quantity, pricePerItem, getInvoiceAmount());
    }
}