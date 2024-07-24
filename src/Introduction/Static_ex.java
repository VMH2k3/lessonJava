package Introduction;

public class Static_ex {
        static double  persentage;
        static int rank;


    public static void main(String[] args) {
        System.out.println("Run Main");
        System.out.println("Rank: "+rank);
    }
    static{
        persentage = 10.1;
        rank = 6;
        System.out.println("static luôn được thực hiện trước main" );}
}
//Khoi tao tinhx
