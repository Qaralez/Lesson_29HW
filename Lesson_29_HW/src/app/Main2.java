package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        List<String> Product=new ArrayList<>();
        Product.add("Milk");
        Product.add("Bred");
        Product.add("Orange");
        Product.add("Apple");
        System.out.println(Product);

        double[] ints = { 1.45, 0.45, 2.30,4.10};
        int sum = 0;
        for (double num : ints){
            sum+=num;
        }
        System.out.println(sum);





    }
}
