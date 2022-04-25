package com.example;

public class MainProgram {

    public static void main(String[] args){

        /**
         * Utwórz klasę Fraction, która ma dwie składowe: licznik i mianownik (typ int)
         * Konstruktor powinien móc przekazać wartości do składowych
         */
//        Fraction dwieCzwarte = new Fraction(2, 4);

        /**
         * Utwórz zestaw getterów i setterów do składowych licznik i mianownik
         */
//
//        int licznik = dwieCzwarte.getLicznik();
//        int mianownik = dwieCzwarte.getMianownik();
//
//        if(licznik!=2 || mianownik!=4){
//            System.out.println("wartości licznika lub mianownika nie zostały poprawnie zwrócone");
//            return;
//        }
//
//
//        dwieCzwarte.setLicznik(4);
//        dwieCzwarte.setMianownik(8);
//
//        licznik = dwieCzwarte.getLicznik();
//        mianownik = dwieCzwarte.getMianownik();
//        if(licznik!=4 || mianownik!=8){
//            System.out.println("wartości licznika lub mianownika nie zostały poprawnie pzypisane do składowych");
//            return;
//        }

        /**
         * Utwórz klasę FractionHelper, która ma metodę SATYCZNĄ o nazwie simplify.
         * Ta metoda ma skrócić ułamek do ułamka nieskracalnego i zwrócić go w nowym obiekcie
         */
//
//        Fraction jednaDruga = FractionHelper.simplify(dwieCzwarte);

        /**
         * Do klasy Fraction dodaj metodę która pozwoli na dodawanie/odejmowanie ułamków
         */

//        Fraction dwieTrzecie= new Fraction(2,3);
//
//        Fraction siedemSzostych = jednaDruga.plus(dwieTrzecie);
//        Fraction minusJednaSzosta = jednaDruga.minus(dwieTrzecie);
//
//        if(siedemSzostych.getLicznik()!=7 && siedemSzostych.getMianownik()!=6){
//            System.out.println("dodawanie źle działa");
//            return;
//        }

//        if(minusJednaSzosta.getLicznik()!=-1&&minusJednaSzosta.getMianownik()!=6){
//            System.out.println("odejmowanie źle działa");
//            return;
//        }

        /**
         * Nadpisz metode toString() aby zwracała napis z ułamkiem
         * tzn. jednaDruga.toString() powinna zwrócić Sring o wartości "1/2"
         */
//        if(!jednaDruga.toString().equals("1/2")){
//            System.out.println("metoda toString została źle nadpisana");
//            return;
//        }

        /**
         * Nadpisz metodę equals(), tak aby porównywała wartości ułamków
         * tzn. jednaDruga.equals(dwieCzwarte) zwraca wartość true
         */
//
//        if(!jednaDruga.equals(dwieCzwarte)){
//            System.out.println("porównywanie ułamków nie działa poprawnie");
//            return;
//        }
//
//        System.out.println("Koniec.");
    }
}
