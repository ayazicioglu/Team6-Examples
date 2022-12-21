package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    /*
            Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
            liste olarak dondurecek bir method olusturun.
     */
    public static void main(String[] args) {
        System.out.println(isimlerMethodu());
    }

    private static List<String> isimlerMethodu() {
        String isim="";
        List<String> isimler=new ArrayList<>();
        do {
            Scanner scan=new Scanner(System.in);
            System.out.println("liste olusturmak icin isim giriniz. Listeyi görmek için Q basım");
            isim=scan.nextLine();
            if (!(isim.equalsIgnoreCase("q"))) {
                isimler.add(isim);
            }else break;
        }while (!isim.equalsIgnoreCase("q"));

        return isimler;
    }
}
