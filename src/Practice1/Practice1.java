package Practice1;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {

    int Sum_for(int nums[], int n){
        int count=0;

        for(int i=0; i<n; ++i){

            count += nums[i];

        }

        return count;
    }

    int Sum_while(int nums[], int n){
        int count=0;
        int i=0;

        while(i<n){
            count += nums[i];
            ++i;
        }

        return count;
    }

    int Sum_do(int nums[], int n){
        int count=0;
        int i=0;

        do{
            count += nums[i];
            ++i;
        } while (i<n);

        return count;
    }

    void Paragraph3and4(){
        System.out.println("Введите размер массива:\n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i=0; i< nums.length; ++i){
            nums[i] = (int)((Math.random() * 201) - 100);
            System.out.print(nums[i]+" ");
        }

        System.out.println("\nParagraph3:");
        System.out.println("for: " + Sum_for(nums, n));
        System.out.println("while: " + Sum_while(nums, n));
        System.out.println("do: " + Sum_do(nums, n));



        System.out.println("\nParagraph4:");
        int count=0;

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("count = "+ count + ", nums[" + i +"] = " + nums[i]);
            count += nums[i];
            System.out.println("count + " + "nums["+i+"] = "+count);
        }

    }


    void Paragraph5(){
        System.out.println("\nParagraph5:");
        float element;

        for(float i=1; i<115; ++i){
            element=1/i;
            System.out.print(element + " ");
        }

        System.out.println();
    }

    void Paragraph6(){
        System.out.println("\nParagraph6:");
        Random r = new Random();

        int arr1[]= new int[10];
        int arr2[]= new int[10];

        for (int i=0; i< arr1.length; ++i){
            arr1[i] = (int)((Math.random() * 201) - 100);
            System.out.print(arr1[i]+" ");
        }

        System.out.println();
        for(int i = arr1.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
                if( arr1[j] > arr1[j+1] ){
                    int t = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = t;
                }
            }
        }

        for (int i=0; i< arr1.length; ++i){
            System.out.print(arr1[i]+" ");
        }

        System.out.println("\n");



        for (int i=0; i< arr2.length; ++i){
            arr2[i] = r.nextInt(201) -100;
            System.out.print(arr2[i]+" ");
        }

        System.out.println();

        for(int i = arr2.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
                if( arr2[j] > arr2[j+1] ){
                    int t = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = t;
                }
            }
        }

        for (int i=0; i< arr2.length; ++i){
            System.out.print(arr2[i]+" ");
        }

        System.out.println();
    }



    int Paragraph7(){
        System.out.println("\nParagraph7\n");
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result=1;

        for (int i = 1; i <=num; i ++){
            result = result*i;
        }

        return result;
    }
}


class App{
    public static void main(String[] args) {
        Practice1 prc1 = new Practice1();

        prc1.Paragraph3and4();
        prc1.Paragraph5();
        prc1.Paragraph6();
        System.out.println(prc1.Paragraph7());
    }
}