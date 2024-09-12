import java.net.SocketOption;
import java.sql.SQLOutput;

public class Perbandingan {
    public static void main(String[] args) {
        int nilai = 10;
        int minimumkelulusan = 68;
        //sama dengan
        System.out.println(nilai == minimumkelulusan);
        //tidak sama dengan
        System.out.println(nilai != minimumkelulusan);
        //lebih besar dari
        System.out.println(nilai > minimumkelulusan);
        //lebih kecil dari
        System.out.println(nilai < minimumkelulusan);
        //lebih besar sama dengan
        System.out.println(nilai >= minimumkelulusan);
        //lebih kecil samadengan
        System.out.println(nilai <= minimumkelulusan);
    }
}