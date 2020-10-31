package Part2.Practice7.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        if (words.length==3){
            with_father_name(words);
        }else if(words.length ==2){
            without_father_name(words);
        }else System.out.println("Введенная строка не является ФИО или ФИ");

    }

    static void with_father_name(String[] words){
        System.out.println("Фамилия: " +words[0] +"\n"+ "Имя: "+words[1]+"\n"+"Отчество: "+words[2]);
    }

    static void without_father_name(String[] words){
        System.out.println("Фамилия: " +words[0] +"\n"+ "Имя: "+words[1]);
    }
}
