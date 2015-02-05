
package javadersleri;

import java.util.Arrays;

public class JavaDersleri {

    public static void main(String[] args) {
//        int sayi=1;
//        int sayi2=1;
//        while(sayi<5){
//            System.out.println(" *******-"+sayi+"-******");
//            while(sayi2<10){
//                System.out.println("///-"+sayi2+"-///");
//                if(sayi2==3)
//                    break;
//                sayi2++;
//            }
//            sayi++;
//        }
        String [] dizi1={"A","C","D","a","F","G"};
        Arrays.sort(dizi1);
        String dizi2 [] = new String [7];
        System.arraycopy(dizi1, 1, dizi2, 1, 2);
        Arrays.fill(dizi2, "4");
        int a=Arrays.binarySearch(dizi1, "b");
        System.out.println(a);
//        if(Arrays.equals(dizi1, dizi2))
//            System.out.println("Eşit");
//        else
//            System.out.println("Degil");
//        for (int i = 0; i < dizi2.length; i++) {
//            System.out.println(dizi2[i]);
//        }
    }
}
