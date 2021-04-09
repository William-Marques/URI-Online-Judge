/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
*/

/*
import java.util.Scanner;

class Main{
  public static void main(String[]args){
    int horainicial, minutoinicial, horafinal, minutofinal, hora, minuto;
    
    Scanner teclado = new Scanner(System.in);
    horainicial = teclado.nextInt();
    minutoinicial = teclado.nextInt();
    horafinal = teclado.nextInt();
    minutofinal = teclado.nextInt();
    hora = horafinal - horainicial;
    minuto = minutofinal - minutoinicial;

    if (hora < 0){
      hora = 24 + (horafinal - horainicial);
    }

    if (minuto < 0 && hora > 0){
      minuto = 60 + (minutofinal - minutoinicial);
      hora--;
    } else if (minuto < 0 && hora == 0){
      minuto = 60 + (minutofinal - minutoinicial);
      hora=23;
      }

    if (horainicial == horafinal && minutoinicial == minutofinal){
      System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
    } else {
      System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");
    }    
}
}
*/