package baitap;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle( double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void tinhChuVi() {
        super.setChuVi(2*Math.PI*radius);
    }

    @Override
    public void tinhDienTich() {
        super.setDienTich(Math.PI*Math.pow(radius,2));
    }
}
