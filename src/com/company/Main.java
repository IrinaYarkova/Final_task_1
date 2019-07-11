package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr;
        int num = 0;

        System.out.println("Введите число:");
        inStr = in.nextLine();
        int size = inStr.length();
        int str = Integer.parseInt(inStr);

        //Представление числа в виде массива в обратном порядке
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = str % 10;
            str = str / 10;
        }

        //Перевод из двоичной системы в десятичную
        for(int i = 0;i<size;i++){
            double x = Math.pow(2, i);
            num = num + ((int)x*arr[i]);
        }

        System.out.println(inStr + " = " + num);
        in.close();
    }
}