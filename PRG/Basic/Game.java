package com.mattkx4.cgamedev.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("This is the start.");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter \"NEXT\" to continue.");
        String in = s.nextLine();

        if(in.equalsIgnoreCase("NEXT")) {
            middle();
            s.close();
            System.exit(0);
        }else{
            System.out.println("Please input \"NEXT\".");
            start();
        }
    }

    public static void middle() {
        System.out.println("This is the middle.");
        System.out.println("Let's move on to the end.");
        end();
    }

    public static void end() {
       