

public class Main
{
    public static void main(String[] args) {
        Car car1 = new Car("Mazda FC", 1996, 250, 20);
        System.out.println(car1.serialId);
        car1.honk();
        car1.describe();

    }
}

