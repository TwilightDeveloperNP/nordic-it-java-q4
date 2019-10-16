package FactorialIT;

import java.util.Scanner;

public class Fakt {

  public static void main(String[] args) {
    System.out.println("Введите команду 1 = 'moove' or 2 = 'stop', что бы продолжить или остановиться");
    var scanner = new Scanner(System.in);
    var j = scanner.nextInt();

    while (j != 2) {
      System.out.println("Введите число,чтобы узнать его факториал ");
      var n = scanner.nextInt();
      var faktorial = 1;
      for (int i = 1; i <= n; i++) {
        faktorial *= i;
      }
      System.out.println("Факториал числа равен:" + faktorial);
      System.out.println("Введите команду 1 = 'moove' or 2 = 'stop', что бы продолжить или остановиться");
      j = scanner.nextInt();
    }


  }


}

