package ra;

public class Pets extends Animals{
    private String color;
    private String skill;

    public Pets() {
    }

    public Pets(String color, String skill) {
        this.color = color;
        this.skill = skill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
