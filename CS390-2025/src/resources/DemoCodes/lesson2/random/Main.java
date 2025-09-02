package io.github.jiangdequan;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Please type your name: ");
          String name = sc.nextLine();
          System.out.println("you wrote: " + name);

          int sum = 0;

          for (int i = 0; i < name.length(); i++) {

               if (name.charAt(i) == 'e') {
                    sum++;
               }
          }
          sc.close();
          System.out.println(sum);
     }
}