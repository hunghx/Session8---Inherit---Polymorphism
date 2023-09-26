package baitap;

public class Rectangle extends Shape{
    private  double chieuDai;
    private  double chieuRong;

    public Rectangle() {
    }

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public void tinhChuVi() {
        super.setChuVi(2*(chieuDai+chieuRong));
    }

    @Override
    public void tinhDienTich() {
        super.setDienTich(chieuDai*chieuRong);
    }
}
