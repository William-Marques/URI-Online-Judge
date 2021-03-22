/*Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

Saída
Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a descrição do problema. Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".

import java.util.Scanner;
import java.text.DecimalFormat;

class Main{
  public static void main(String[]args){
    double n1, n2, n3, n4, media, exame, mediaexame;

    Scanner teclado = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0");


    n1 = teclado.nextDouble();
    n2 = teclado.nextDouble();
    n3 = teclado.nextDouble();
    n4 = teclado.nextDouble();

    media = ((2 * n1)+(3 * n2)+(4 * n3)+(1 * n4))/(2+3+4+1);

    System.out.println("Media: "+ df.format(media));

    if (media >= 7.0){
      System.out.printf("Aluno aprovado.\n");      
    } else if (media >= 5.0 && media <= 6.9) {
      System.out.printf("Aluno em exame.\n");
      exame = teclado.nextDouble();
      System.out.println("Nota do exame: "+ df.format(exame));
      mediaexame = (exame + media)/2;
        if (mediaexame >= 5.0){
          System.out.printf("Aluno aprovado.\n");
         System.out.println("Media final: "+ df.format(mediaexame));
        } else {
          System.out.printf("Aluno reprovado.\n");
          System.out.println("Media final: "+ df.format(mediaexame));
        };
    } else {
      System.out.printf("Aluno reprovado.\n");
    }
  }
}*/