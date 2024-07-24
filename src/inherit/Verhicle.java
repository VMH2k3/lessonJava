package inherit;

abstract class Verhicle {
    protected String brand;
    protected String version;
     public Verhicle(String brand, String version) {
         this.brand = brand;
         this.version = version;
     }
     public abstract void banglai();
     public void display(){
         System.out.println("Brand: " + brand + " "+"Version: " + version);
     }
}
