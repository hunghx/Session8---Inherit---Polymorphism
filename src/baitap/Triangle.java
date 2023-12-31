package baitap;

public class Triangle extends Shape{
    private double a,b,c;

    public Triangle() {
    }

    public Triangle( double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void tinhChuVi() {
        super.setChuVi(a+b+c);
    }

    @Override
    public void tinhDienTich() {
        double p = (a+b+c)/2;
        // công thức heron
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        super.setDienTich(s);
    }
}
