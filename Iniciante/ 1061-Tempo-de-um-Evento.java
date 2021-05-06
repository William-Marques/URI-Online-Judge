/*
Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.
Entrada

Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.
Saída

Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
*/

/*
import java.util.*;

public class Main {

  public static void main(String[] args) {
   
   
    Scanner teclado = new Scanner(System.in);
   
    String dia_1 = teclado.nextLine();
    String dia_1_horario = teclado.nextLine();
   
    String[] dia_1_split = dia_1.split(" ");
    String[] dia_1_horario_split = dia_1_horario.split(" : ");

    String dia_2 = teclado.nextLine();
    String dia_2_horario = teclado.nextLine();
   
    String[] dia_2_split = dia_2.split(" ");
    String[] dia_2_horario_split = dia_2_horario.split(" : ");

    int dia_1_dia = Integer.parseInt(dia_1_split[1]);
   
    int dia_1_hora = Integer.parseInt(dia_1_horario_split[0]);
    int dia_1_minutos = Integer.parseInt(dia_1_horario_split[1]);
    int dia_1_segundos = Integer.parseInt(dia_1_horario_split[2]);
 
    int dia_2_dia = Integer.parseInt(dia_2_split[1]);
 
    int dia_2_hora = Integer.parseInt(dia_2_horario_split[0]);
    int dia_2_minutos = Integer.parseInt(dia_2_horario_split[1]);
    int dia_2_segundos = Integer.parseInt(dia_2_horario_split[2]);
   
    dia_1_segundos = (dia_1_dia * 24 * 60 * 60) + (dia_1_hora * 60 * 60) + (dia_1_minutos * 60) + (dia_1_segundos);
   
    dia_2_segundos = (dia_2_dia * 24 * 60 * 60) + (dia_2_hora * 60 * 60) + (dia_2_minutos * 60) + (dia_2_segundos);
   
    int  diferenca_segundos = dia_2_segundos - dia_1_segundos;
   
    int diferenca_segundos_atual = diferenca_segundos;
   
    int dias = diferenca_segundos_atual / (24 * 60 * 60);
    diferenca_segundos_atual -= dias * 24 * 60 * 60;
   
    int horas = diferenca_segundos_atual / (60 * 60);
    diferenca_segundos_atual -= horas * 60 * 60;
 
    int minutos = diferenca_segundos_atual / (60);
    diferenca_segundos_atual -= minutos * 60;
   
    int segundos = diferenca_segundos_atual;
   
    System.out.printf("%s dia(s)\n", dias);
    System.out.printf("%s hora(s)\n", horas);
    System.out.printf("%s minuto(s)\n", minutos);
    System.out.printf("%s segundo(s)\n", segundos);
  }
}
*/