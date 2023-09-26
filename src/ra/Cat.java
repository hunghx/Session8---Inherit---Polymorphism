package ra;

public class Cat extends Animals{
    private String color;

    public Cat() {

    }

    public void move(){

    }
    public Cat(String color,double weight,double height){
//        super(weight,height);
        this.color = color;
        super.setHeight(height);
        super.setWeight(weight);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override // ghi đè của Animals
    public String toString() {
        return super.toString()+"| color :" + color;
    }

    @Override
    public void makeSound() {
        System.out.println("meomeo");
    }
}
