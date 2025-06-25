package app;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer> numbers= new ArrayList<>();
        int sum=0;

        System.out.println("Введите целые числа и '0' для завершения ");

        while (true){
            int input = scanner.nextInt();
            if (input==0){
                break;
            }
            numbers.add(input);
            sum+=input;
        }
        System.out.println("Введены слудующие числа: ");
        for (int num: numbers) {
            System.out.print(num+" ");


        }
        System.out.println("Сумма введенных чисел:  " +sum);

    }
}
