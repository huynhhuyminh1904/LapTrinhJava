package communityuni.com;

public class HinhTron extends Hinh {
    private double bankinh;

    public HinhTron(String mau, double bankinh) {
        super(mau);
        this.bankinh = bankinh;
    }

    public double TinhDienTich() {
        return Math.PI * bankinh * bankinh;
    }

    public double TinhChuVi() {
        return 2 * Math.PI * bankinh;
    }

    public String LayThongTin() {
        return super.LayThongTin() + ", Bán kính: " + bankinh;
    }
}
