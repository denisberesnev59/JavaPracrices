package Part2.Practice7.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number_input;
        number_input = scanner.nextLine();

        number_input= number_input.replace("+", "");
        number_input= number_input.replace("-", "");
        number_input= number_input.replace("(", "");
        number_input= number_input.replace(")", "");
        number_input= number_input.replace(" ", "");
        String[] number_arr = number_input.split("");
        List<String> number_list = new ArrayList<String>(Arrays.asList(number_arr));

        if(number_arr.length==11){
            case_11(number_list);
        }else if(number_arr.length == 10){
            case_10(number_list);
        }else System.out.println("Неверный формат номера");
    }

    static void case_11(List<String> list){
        if(list.get(0).equals("7")){
            System.out.println();
            list.remove("7");
            System.out.println(format_number(list));
        }else if(list.get(0).equals("8")){
            list.remove("8");
            System.out.println(format_number(list));
        }else{
            System.out.println("Неверный формат номера");
        }
    }

    static void case_10(List<String> list){
        System.out.println(format_number(list));
    }

    static String format_number(List<String> list){
        String phone_number = "+7 (";
        int i=0;
        int count =0;

        while (i<10){

            if (count==3){
                phone_number += ") ";
            }
            if (count==6){
                phone_number += "-";
            }
            if (count==8){
                phone_number += "-";
            }
            phone_number += list.get(i);
            count+=1;
            i+=1;
        }

        return phone_number;
    }

}
