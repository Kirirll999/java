package HW4.Animals;

import java.util.Objects;

public class cat extends Animals {
    public String breed;
private int height;

    public String getBreed() {
        return breed;
    }

    public int getHeight() {
        if (height >= 0);
        return height;
    }

    public cat(String breed,int Height, String name, String color){
        super(name, color);
        this.breed=breed;
    }

    public int getAge(){
        return 6;
}

    public double getWeight(){
        return 2.3;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cat cat = (cat) o;
        return height == cat.height && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, height);
    }

    @Override
    public String toString() {
        return "cat:" +
                "name: " + name + '\'' +
                "color: " + color + '\'' +
                "breed: " + getBreed() + '\'' +
                "weight: " +getWeight() + '\'' +
                "age: " + getAge();




    }
}
