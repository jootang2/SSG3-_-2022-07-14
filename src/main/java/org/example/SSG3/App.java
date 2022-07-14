package org.example.SSG3;

import java.util.Scanner;

public class App {

    public static void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===명언 SSG===");
        System.out.print("명령) ");
        String cmd = sc.nextLine();


        outer:
        switch (cmd){
            case "종료" :
                break outer;
        }

    }
}
