/*

Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 

Saída
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.



import java.util.Scanner;

class Main{

  public static void main(String[] args){

    int N, X, in = 0, out = 0;

    Scanner teclado = new Scanner(System.in);

    N = teclado.nextInt();
    if (N < 10000){
    for (int i = 0; i < N; i++){
      X = teclado.nextInt();
      if (X >= -10000000 && X <= 10000000){
        if (X >= 10 && X <= 20){
          in++;
        } else {
          out++;
        }
      }
    }
    }
    System.out.printf("%d in\n", in);
    System.out.printf("%d out\n", out);
  }
}

*/