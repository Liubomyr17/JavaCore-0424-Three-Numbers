package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*Три числа
//        Ввод с клавиатуры, сравнение чисел и вывод на экран — у студентов 4 уровня секретного центра JavaRush эти навыки оттачиваются до автоматизма.
//        Давайте напишем программу, в которой пользователь вводит три числа с клавиатуры.
//        Затем происходит сравнение, и если мы находим число, которое отличается от двух других,
//        выводим на экран его порядковый номер.
//
//        Требования:
//        1. Программа должна считывать числа c клавиатуры.
//        2. Программа должна использовать команды System.out.println() или System.out.print().
//        3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
//        4. Если все числа разные, ничего не выводить.*/


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int a = Integer.parseInt(n1);
        String n2 = reader.readLine();
        int b = Integer.parseInt(n2);
        String n3 = reader.readLine();
        int c = Integer.parseInt(n3);
        if (a != b && a != c && b != c);
        else {
            if (a == b && (a != c && b != c))

                System.out.println(3);

            else {

                if (a == c && (a != b && c!= b))
                    System.out.println(2);
                else {
                    if (b == c && (b != a && c != a))
                        System.out.println(1);
                }}}
    }
}