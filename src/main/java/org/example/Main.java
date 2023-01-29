package org.example;

import org.example.Exercicios.IntervaloNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IntervaloNumeros  teste = new IntervaloNumeros();

     /*   int numero = teste.numero();
        teste.consulta(numero);*/
        Scanner scan = new Scanner(System.in);
            int anoFabricacao = 0;
            float valorCarro = 0.0f;
            int qtdCarrosNovos =0;
            int qtdCarroTotal= 0;
            String desejaRepetir = scan.next();
            desejaRepetir.charAt(0);

            while (desejaRepetir == "s"){

                System.out.println(desejaRepetir);
                System.out.println("Digite o ano de Fabricacao: ");
                anoFabricacao = scan.nextInt();
                valorCarro = scan.nextFloat();

                float valorDesconto;
                if (anoFabricacao <=2000){
                    float desconto = valorCarro*0.12f;
                    System.out.println(desconto);

                }else {
                    float desconto = valorCarro*0.07f;
                    System.out.println(desconto);
                    qtdCarrosNovos++;


                }

                System.out.println("Deseja exibir mais cadastro? Digite S (sim) e N (Nao)");
                String decisao = scan.next();
                decisao.charAt(0);


                if (decisao == "n" || decisao == "N"){
                    desejaRepetir = "n";

                }

                qtdCarroTotal++;

            }

        System.out.println("Quantidade de veiculos total: "+ qtdCarroTotal);
        System.out.println("Quantidade de veiculos antigos: "+ qtdCarrosNovos);


}
}