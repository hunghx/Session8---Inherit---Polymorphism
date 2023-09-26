package baitap;

public abstract class Shape {
    private double chuVi;
    private double dienTich;
    public abstract void tinhChuVi();
    public abstract void tinhDienTich();

    public Shape(double chuVi, double dienTich) {
        this.chuVi = chuVi;
        this.dienTich = dienTich;
    }

    public Shape() {
    }

    public double getChuVi() {
        return chuVi;
    }

    public void setChuVi(double chuVi) {
        this.chuVi = chuVi;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
}
