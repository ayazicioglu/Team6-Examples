package ArrayList;

public class Q4 { /*
    Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
            method olusturun.
     */
    public static void main(String[] args) {
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        System.out.println(elementleriCarp(arr));
    }

    private static int elementleriCarp(int[][] arr) {
        int toplam=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam=toplam*arr[i][j];

            }
        }
        return toplam;
    }
}
