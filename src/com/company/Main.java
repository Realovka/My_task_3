package com.company;
// задача №1 из Шилдта. Задачи для проверки глава3. стр.137
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
       char x,y;
       int i;
       i=0;
        do {
            System.out.println("Введите символ");
            x=(char) System.in.read();
            y=(char) System.in.read();
            i++;
        }
        while ((x!='.') & (y=='\n'));
        System.out.println("Цикл выполнился "+i+" раз");

    }
}
