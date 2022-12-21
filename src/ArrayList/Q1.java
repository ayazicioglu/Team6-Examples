package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
         /*
    Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
            elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
     */
        int[] arr={4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};
        System.out.println(Arrays.toString(tekrarsizElementlerarrayi(arr)));

    }

    private static int[] tekrarsizElementlerarrayi(int[] arr) {
        List<Integer> tekrarsiz=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsiz.contains(arr[i])){
                tekrarsiz.add(arr[i]);
            }
        }
        arr=new int[tekrarsiz.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=tekrarsiz.get(i);
        }
        return arr;
    }
}
