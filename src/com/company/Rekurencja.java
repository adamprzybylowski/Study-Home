package com.company;

public class Rekurencja {


    public int sumaIteracja(int n) {
        int suma = 0;
        while (n > 0) {
            suma = suma + n;
            n--;
        }
        return suma;
    }

    public int sumaRekurencja(int n) {

        if (n > 0) {
            return n + sumaRekurencja(n - 1);
        } else {
            return n;
        }
    }

}


