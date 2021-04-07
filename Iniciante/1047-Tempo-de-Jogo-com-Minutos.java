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