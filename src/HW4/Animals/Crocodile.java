package HW4.Animals;

public class Crocodile extends Animals implements walking {
    public int age;
    public String habitat = "African";

    public Crocodile() {
        super("kuzya", "green");
    }

    public Crocodile(int age, String habitat, String name, String color) {
        super(name, color);

    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
        ;
    }

    public int getAge() {
        return 12;
    }

@Override
    public void walk() {
        System.out.println("im walking");
    }

    public double getWeight() {
        return 240;
    }

    @Override
    public String toString() {
        return "Crocodile\n" +
                "age: " + getAge() +
                "\nhabitat: " + habitat + '\'' +
                "\nname: " + name + '\'' +
                "\ncolor: " + color + '\'' +
                "\nWeight: " + getWeight();
    }
}