package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String kalimat, hurufKecil, kapital;


        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Kalimat\t : ");
        kalimat = scn.nextLine();

        hurufKecil = kalimat.toLowerCase();
        kapital = kalimat.toUpperCase();

        System.out.println("======= Hasil Formating =======");
        System.out.println("Huruf Besar\t : " +kapital);
        System.out.println("Huruf Kecil\t : " +hurufKecil);

    }
}
