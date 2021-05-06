/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.
*/

/*
import java.util.Scanner;

class Main{
  public static void main(String[] args){
    double numeros[] = new double[6];
    int positivos = 0;
    double media = 0;

    Scanner teclado = new Scanner(System.in);

    for (int t = 0; t < numeros.length; t++){
      numeros[t] = teclado.nextDouble();
    }

    for (int i = 0; i < numeros.length ; i++){
      if (numeros[i] > 0){
        positivos++;
        media = media + numeros[i];
      }
    }
  System.out.printf("%d valores positivos\n", positivos);
  System.out.printf("%.1f\n", media / positivos);
  }
}
*/