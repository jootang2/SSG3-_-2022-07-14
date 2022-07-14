package org.example.SSG3;

import java.util.Scanner;

public class App {

    public static void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===명언 SSG===");


        outer:
        while(true){

            System.out.print("명령) ");
            String cmd = sc.nextLine().trim();

            switch (cmd){
                case "등록" :
                    System.out.print("명언 : ");
                    String content = sc.nextLine().trim();
                    System.out.print("작가 : ");
                    String author = sc.nextLine().trim();
                    break;

                case "종료" :
                    break outer;
            }
        }

    }
}
