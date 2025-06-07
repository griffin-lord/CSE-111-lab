import java.util.Objects;

class Laptop
{
    String model;
    int price;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
public class ClassStringHashcode {

    public static void main(String []args)
    {
        Laptop lap = new Laptop();
        lap.model = "Samsung 234";
        lap.price = 150000;

        Laptop lap1 = new Laptop();
        lap1.model = "Samsung 234";
        lap1.price = 150000;

        System.out.println(lap.equals(lap1));
        System.out.println(lap1);
    }
}