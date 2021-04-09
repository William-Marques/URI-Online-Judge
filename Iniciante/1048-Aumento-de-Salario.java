/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:


Salário	Percentual de Reajuste
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.
*/

/*
import java.util.Scanner;

class Main{
  public static void main (String[] args){
    double salario, novoSalario;

    Scanner teclado = new Scanner(System.in);
    salario = teclado.nextDouble();

    if (salario >= 0 && salario <= 400.00){
      novoSalario = salario * 1.15;
      System.out.printf("Novo salario: %.2f\n", novoSalario);
      System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario);
      System.out.println("Em percentual: 15 %");
    } else if (salario >= 400.01 && salario <= 800.00){
      novoSalario = salario * 1.12;
      System.out.printf("Novo salario: %.2f\n", novoSalario);
      System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario);
      System.out.println("Em percentual: 12 %");
    } else if (salario >= 800.01 && salario <= 1200.00){
      novoSalario = salario * 1.10;
      System.out.printf("Novo salario: %.2f\n", novoSalario);
      System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario);
      System.out.println("Em percentual: 10 %");
      } else if (salario >= 1200.01 && salario <= 2000.00){
      novoSalario = salario * 1.07;
      System.out.printf("Novo salario: %.2f\n", novoSalario);
      System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario);
      System.out.println("Em percentual: 7 %");
      } else {
      novoSalario = salario * 1.04;
      System.out.printf("Novo salario: %.2f\n", novoSalario);
      System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario);
      System.out.println("Em percentual: 4 %");
      }

  }
}
*/