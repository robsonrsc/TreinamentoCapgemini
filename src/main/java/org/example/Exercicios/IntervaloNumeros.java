package org.example.Exercicios;

import java.util.Scanner;

public class IntervaloNumeros {

    Scanner scan = new Scanner(System.in);

    public int numero (){
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        return num;
    }


    public void   consulta (Integer num){

        if (num > 100 && num < 200) {

            System.out.println("ok");

        }
        else {
            System.out.println("nao ok");
        }
    }

    public void  teste(){

    }
}
