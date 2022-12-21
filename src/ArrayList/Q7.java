package ArrayList;

import java.util.Arrays;

public class Q7 { /*
    Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
            olusturacagimiz tek katli bir array’e bu toplamlari atayin.
            input : int[][] arr = {{3,4,5}, {2,3,6,7}};
            output: [5, 7, 11]
     */

    public static void main(String[] args) {
        int[][] arr={{3,4,5},{2,3,6,7},{6,25,32,6,32,6,5}};
        int enKisaArr=arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length<enKisaArr){
                enKisaArr=arr[i].length;
            }
        }
        int [] toplamArray=new int[enKisaArr];
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < toplamArray.length; j++) {
                toplamArray[j]+=arr[i][j];
            }
        }
        System.out.println(Arrays.toString(toplamArray));
    }
}

