package Metotlar;

import java.util.Scanner;

public class RecursiveAsalSayi {

    static void primeNum(int a,int b){

        if (a==b){
            System.out.println(a +" Sayisi Asaldir ");
            return;
        }else if (a%b==0){
            System.out.println(a+ " Sayisi Asal Degildir");
            return;
        }
        primeNum(a,b+1);
    }

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Lutfen Sayi Giriniz : ");
        int a =input.nextInt();

        primeNum(a,2);


    }
}
