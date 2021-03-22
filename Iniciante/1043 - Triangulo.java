/*Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:


Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem


Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.

import java.util.Scanner;

class Main{
  public static void main(String[]args){
    double a, b, c;

    Scanner teclado = new Scanner(System.in);
    a = teclado.nextDouble();
    b = teclado.nextDouble();
    c = teclado.nextDouble();

    if (a < b + c && b < a + c && c < a + b){
      System.out.printf("Perimetro = %.1f\n", a + b + c);
    } else {
      System.out.printf("Area = %.1f\n", ((a + b) * c)/2);
    }    
  }
}*/