package com.company;

public class Main {

    public static void main(String[] args) {
        for(Tuna ppl : Tuna.values()){
            System.out.println(ppl + ppl.getDesc() + ppl.getYear());
        }

        // Enums zijn datatypes die bijna net als Maps gebruikt kunnen worden
        // De datatype-naam is een CONSTANTE en de waardes

        // Het is ook mogelijk om een Range te zetten met de enums

    }
}
