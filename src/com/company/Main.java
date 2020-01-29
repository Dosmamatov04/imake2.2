package com.company;

public class Main {


    public static void main(String[] args) {
        String name = "Бекзат";
        int age = 46;
        int temperature = 5;
        if (age < 20 && age > 45 && temperature < +30 && temperature > -20) {
            System.out.println("Можно идти гулять!!!");
        }
        if (age < 20 && temperature > 0 && temperature < 28){
            System.out.println("Можно гулять!!");
        }
        if (age > 45 && temperature > -10 && temperature < 25){
            System.out.println(" можно гулять!");

        }
    }
}
