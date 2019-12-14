package com.company;

public class Main {

    public static void main(String[] args) {

        Rekurencja r = new Rekurencja();
        int iteracja = 0;
        int rekurencja = 0;

        iteracja = r.sumaIteracja(6);
        rekurencja = r.sumaRekurencja(6);

        System.out.println("Iteracja " + iteracja);
        System.out.println("Rekurencja " + rekurencja);

    }
}



