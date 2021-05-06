/*

Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.



import java.util.Scanner;

public class Main{
  
  public static void main(String[] Args){

    int x, i = 0;

    Scanner teclado = new Scanner(System.in);

    x = teclado.nextInt();
  

    while (i < 6){
      if (x % 2 == 1){
      System.out.println(x);
      i++;
      }
      x++;
    }
  }
}

*/