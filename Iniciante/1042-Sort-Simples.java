/*Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.

import java.util.Scanner;

class Main{
  public static void main(String[]args){
   int ent1, ent2, ent3, primeiro = 0, segundo = 0, terceiro = 0;

   Scanner teclado = new Scanner(System.in);

   ent1 = teclado.nextInt();
   ent2 = teclado.nextInt();
   ent3 = teclado.nextInt();

   if (ent1 < ent2 && ent1 < ent3){
     primeiro = ent1;
     if (ent2 < ent3){
       segundo = ent2;
       terceiro = ent3;
     } else {
       segundo = ent3;
       terceiro = ent2;
       }
   } else if (ent2 < ent1 && ent2 < ent3){
     primeiro = ent2;
     if (ent1 < ent3){
       segundo = ent1;
       terceiro = ent3;
     } else {
       segundo = ent3;
       terceiro = ent1;
       }
   } else if (ent3 < ent1 && ent3 < ent2){
     primeiro = ent3;
     if (ent1 < ent2){
       segundo = ent1;
       terceiro = ent2;
     } else {
       segundo = ent2;
       terceiro = ent1;
       }
   }

   System.out.println(primeiro);
   System.out.println(segundo);
   System.out.println(terceiro);
   System.out.println("");
   System.out.println(ent1);
   System.out.println(ent2);
   System.out.println(ent3); 
  }
}*/