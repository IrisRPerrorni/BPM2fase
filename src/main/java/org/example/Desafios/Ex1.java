package org.example.Desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//// Desafio 1
//// Ordenando Números Pares e Ímpares
//
///* Crie um programa onde você receberá valores inteiros não negativos como
//entrada.
//
//Ordene estes valores de acordo com o seguinte critério:
//
//- Primeiro os Pares
//- Depois os Ímpares
//- Você deve exibir os pares em ordem crescente e na sequência os ímpares em
//ordem decrescente.
//
//- Entrada
//
//A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
//Este é o número de linhas de entrada que vem logo a seguir. As próximas N
//linhas terão, cada uma delas, um valor inteiro não negativo.
//
//- Saída
//
//Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
//Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
//*/
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        List<Integer> listaPares = new ArrayList<>();
        List<Integer> listaImpares = new ArrayList<>();
        int num;

        do{
            chamada();
            num = scanner.nextInt();
            if(num >= 0){
                if(num % 2 == 0){
                    listaPares.add(num);
                } else {
                    listaImpares.add(num);
                }
            }

        } while(num>=0);

        Collections.sort(listaPares);
        Collections.reverse(listaImpares);


        System.out.print("Numeros Pares em ordem crescente" + listaPares );
        System.out.print("Numeros impares em ordem descrescente" + listaImpares);


    }
    public static void chamada (){
        System.out.print("Digite valores inteiros não negativos: ");
        System.out.print(" Para encerrar o processo digite um numero negativo ");
    }
    }


