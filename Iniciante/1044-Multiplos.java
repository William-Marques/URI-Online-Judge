/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.

import java.util.Scanner;

class Main{
  public static void main(String[]args){
    int a,b;
    
    Scanner teclado = new Scanner(System.in);
    a = teclado.nextInt();
    b = teclado.nextInt();

    if (a > b){
      if ( a % b == 0){
        System.out.println("Sao Multiplos");
      } else {
        System.out.println("Nao sao Multiplos");
      }
    } else {
      if (b % a == 0){
        System.out.println("Sao Multiplos");
      } else {
        System.out.println("Nao sao Multiplos");
      }
    }

  }
}*/