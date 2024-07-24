package inherit;

public class Car extends Verhicle{
    public Car(String brand, String version) {
        super(brand,version);}
        public void banglai(){
            System.out.println("Carnobanglai: B2");
        }

    public static void main(String[] args) {
        Car car = new Car("Car", "1.0");
        car.display();
        car.banglai();
    }
}
