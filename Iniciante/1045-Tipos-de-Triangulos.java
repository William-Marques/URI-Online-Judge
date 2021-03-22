/*Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.

import java.util.Scanner;

class Main{
  public static void main(String[]args){
    double a, b, c, aux;

Scanner teclado = new Scanner(System.in);
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
				
		if (b > a && b > c) {
			aux = a;
			a = b;
			b = aux;
		} else if (c > a) {
			aux = a;
			a = c;
			c = aux;
		}
		
		if (a >= (b + c)) { 
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (a*a == (b*b) + (c*c)) System.out.println("TRIANGULO RETANGULO");
			if (a*a > (b*b) + (c*c)) System.out.println("TRIANGULO OBTUSANGULO");
			if (a*a < (b*b) + (c*c)) System.out.println("TRIANGULO ACUTANGULO");
			if (a == b && a == c) System.out.println("TRIANGULO EQUILATERO");
			if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) System.out.println("TRIANGULO ISOSCELES");
		}
	}	
}*/