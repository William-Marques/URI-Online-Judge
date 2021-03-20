import java.util.Scanner;

class Main{
  public static void main(String[]args){
    int n, anos, meses;

    Scanner teclado = new Scanner(System.in);

    n = teclado.nextInt();
    anos = n / 365;
    n = n % 365;
    meses = n / 30;
    n = n % 30;

    System.out.printf("%d ano(s)\n", anos);
    System.out.printf("%d mes(es)\n", meses);
    System.out.printf("%d dia(s)\n", n);
  }
}