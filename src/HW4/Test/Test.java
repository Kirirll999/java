package HW4.Test;
import HW4.Animals.Animals;
import HW4.Animals.cat;
import HW4.Animals.Crocodile;
public class Test{
    public static void main(String[] args) {
        cat myCat = new cat("British",24,"Monya","gray");
        System.out.println(myCat);
        Crocodile myCrocodile =new Crocodile(12,"African","Kuzya","green");
        System.out.println(myCrocodile);
    }
}
