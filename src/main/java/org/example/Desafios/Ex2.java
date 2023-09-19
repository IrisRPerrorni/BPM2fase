package org.example.Desafios;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
//Desafio 2
// Conversão de Tempo
/*
Você terá o desafio de ler um valor inteiro, faça a conversão desse valor para date e informe-o expresso no formato
dia/mês/ano horas:minutos:segundos.

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido.

- Obs

Utilize UTC (GMT-0)

- Exemplo:
    Entrada: 1693225566
    Saída: 28/Aug/2023 12:26:06
*/
public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        chamado();
        int num = entrada.nextInt();


        Date dataEHora = new Date(num* 1000);
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        TimeZone zonaHoraria = TimeZone.getTimeZone("GMT 0");
        formatarData.setTimeZone(zonaHoraria);
        String dataformatada = formatarData.format(dataEHora);
        System.out.println(dataformatada);


    }
    public static void chamado(){
        System.out.println("Digite um valor inteiro para decobrir a data e hora: ");
    }

}
