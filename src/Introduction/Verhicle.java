package Introduction;

public class Verhicle {
    String name;
    String color;
    public Verhicle(String name, String color) {
        this.name = name;
        this.color = color;
    }
    void Speed(String v){
        System.out.println("Ban co the chay voi toc do bao nhieu \n" + " Toi co the chay voi toc do: "+v);
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
    }
    public static void main(String[] args) {
        Verhicle v1 = new Verhicle("Car", "yellow");
        Verhicle v2 = new Verhicle("Horse", "blue");
        v1.displayInfo();
        v2.displayInfo();
    }
}
