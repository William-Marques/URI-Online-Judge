/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.


import java.util.Scanner;

class Main{
  public static void main(String [] args){

    int x = 0;

    Scanner teclado = new Scanner(System.in);

    x = teclado.nextInt();

    for (int i=0; i <= x; i++){
      if (x <= 1000 && i % 2 !=0){
        System.out.println(i);
      }
    }
  }
}

*/