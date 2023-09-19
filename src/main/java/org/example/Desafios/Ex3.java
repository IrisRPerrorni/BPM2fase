package org.example.Desafios;

import java.util.Scanner;
// Desafio 3
// Sequência de Fibonacci (Recursividade)

/*
A Sequência de Fibonacci tem como primeiros termos os números 0 e 1 e, a seguir,
cada termo subsequente é obtido pela soma dos dois termos predecessores:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

Fibonacci(0) = 0
Fibonacci(1) = 1
Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o valor relativo ao N número da sequência de Fibonacci, exemplo:

N = 0  => saída "Fib = 0"
N = 1  => saída "Fib = 1"
N = 3  => saída "Fib = 2"
M = 29 => saída "Fib = 514229"

 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        chamada();
        int num = entrada.nextInt();
        for (int i = 0 ; i< num ; i++){
            System.out.println(fibonacii(i) + " ");
        }

        System.out.println("Fib = " + calculadoraFibonacii(num));


    }
    public static int fibonacii(int num){
        if (num<2){
            return 1;
        }
        return fibonacii(num-1) +fibonacii(num-2);
    }
    public static int calculadoraFibonacii(int num){
        if (num<2){
            return num;
        }
        return calculadoraFibonacii(num-1) +calculadoraFibonacii(num-2);
    }
    public static void chamada(){
        System.out.println("Digite o numero que deseja calcular o seu valor do Fibonaci: ");
    }
}
