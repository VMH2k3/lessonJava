package Introduction;

public class Demo {
    public Demo(){
        System.out.println("Khoi tao khong tham so");

    }    public Demo(int i){
        System.out.println("Khoi tao voi 1 tham so");

    }    public Demo(int i, int j){
        System.out.println("Khoi tao voi hai tham so");

    }
    {
        System.out.println("Day la: ");
    }
    //Lop vo danh tu dong thuc hien truoc moi method
    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo demo1 = new Demo(1);
        Demo demo2 = new Demo(1,2);
    }
}
