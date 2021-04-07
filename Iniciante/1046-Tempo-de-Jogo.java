/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.

import java.util.Scanner;

class Main{
  public static void main(String[]args){
    int a, b;

    Scanner teclado = new Scanner(System.in);
    a = teclado.nextInt();
    b = teclado.nextInt();

    if (a == b){
      System.out.println("O JOGO DUROU 24 HORA(S)");
    } else if ( a > b) {
      System.out.printf("O JOGO DUROU %d HORA(S)\n", b - a + 24);
    } else {
      System.out.printf("O JOGO DUROU %d HORA(S)\n", b - a);
    }    
  }
}*/