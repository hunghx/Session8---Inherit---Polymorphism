package ra;

public class Animals {
    private double weight;
    private double height;

    public Animals() {
    }

    public Animals(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override // đè của lớp Object
    public String toString() {
        return "weight :" +weight +"| height :"+height;
    }
   public void makeSound(){
        System.out.println("gâu gau !");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
