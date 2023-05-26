package HW4.Animals;
public abstract class Animals {
public String name;
public String color;
    public Animals(String name, String color) {
        this.name = name;
        this.color = color;
    }

public abstract int getAge();
public abstract double getWeight();
}