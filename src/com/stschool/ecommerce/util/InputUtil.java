package com.stschool.ecommerce.util;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner sc = new Scanner(System.in);


    public static int getIntInput(String message){
        System.out.println(message);
        return sc.nextInt();
    }

    public static float getFloatInput(String message){
        System.out.println(message);
        return sc.nextFloat();
    }

    public static double getDoubleInput(String message){
        System.out.println(message);
        return sc.nextDouble();
    }

    public static String getStringInput(String message){
        System.out.println(message);
        return sc.nextLine();

    }

    public static void closeScanner(){
        sc.close();
    }
}
