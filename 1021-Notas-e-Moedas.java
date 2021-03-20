/*import java.util.Scanner;

class Main{
  public static void main(String[]args){

    int notas, moedas, cem, cinquenta, vinte, dez, cinco, dois, um, c50, c25, c10, c5;
    String n;
    String[] dinheiro = new String[2]; //criar um array para receber o valor digitado separado em inteiros e centavos

    Scanner teclado = new Scanner(System.in); //inicializar teclado
    n = teclado.next(); //atribuir valor digitado a variavel n
    
    dinheiro = n.split("\\."); //atribuir o valor de n a dinheiro separado em inteiro e centavos
    notas = Integer.parseInt(dinheiro[0]); //colocar o valor array 0 na variavel notas
    moedas = Integer.parseInt(dinheiro[1]); //colocar o valor array 1 na variavel moedas

    cem = notas / 100;
    notas = notas % 100;
    cinquenta = notas / 50;
    notas = notas % 50;
    vinte = notas / 20;
    notas = notas % 20;
    dez = notas / 10;
    notas = notas % 10;
    cinco = notas / 5;
    notas = notas % 5;
    dois = notas / 2;
    notas = notas % 2;
    um = notas / 1;
    notas = notas % 1;

    c50 = moedas / 50;
    moedas = moedas % 50;
    c25 = moedas / 25;
    moedas = moedas % 25;
    c10 = moedas / 10;
    moedas = moedas % 10;
    c5 = moedas / 5;
    moedas = moedas % 5;
    moedas = moedas / 1;

    System.out.printf("NOTAS:\n");
    System.out.printf("%d nota(s) de R$ 100.00\n", cem);
    System.out.printf("%d nota(s) de R$ 50.00\n", cinquenta);
    System.out.printf("%d nota(s) de R$ 20.00\n", vinte);
    System.out.printf("%d nota(s) de R$ 10.00\n", dez);
    System.out.printf("%d nota(s) de R$ 5.00\n", cinco);
    System.out.printf("%d nota(s) de R$ 2.00\n", dois);
    System.out.printf("MOEDAS:\n");
    System.out.printf("%d moeda(s) de R$ 1.00\n", um);
    System.out.printf("%d moeda(s) de R$ 0.50\n", c50);
    System.out.printf("%d moeda(s) de R$ 0.25\n", c25);
    System.out.printf("%d moeda(s) de R$ 0.10\n", c10);
    System.out.printf("%d moeda(s) de R$ 0.05\n", c5);
    System.out.printf("%d moeda(s) de R$ 0.01\n", moedas);
  }
}*/