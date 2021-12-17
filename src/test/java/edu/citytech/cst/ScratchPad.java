package edu.citytech.cst;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ScratchPad {

    public static int[] numbers = IntStream.rangeClosed(1,12).toArray();

    static Predicate<Integer> isEven = e -> e % 2 ==0;
    static Predicate<Integer> fIsMultipleOf5 = e -> e % 5 ==0;
    static Predicate<Integer> fIsMultipleOf11 = e -> e % 11 ==0;

    public static void main(String[] args) {
        //e1();e2();e3();
        //e4();
        e5(5, 7,9);
        System.out.println("-------------------------------");
        e6(5, 7,9);
    }
    public static void  e1(){
        var total =0;
        for (int i:numbers) {
            total+=i;
        }
        System.out.println("total: "+total);
    }

    public static void  e2(){
       var total = Arrays.stream(numbers).reduce(0,(a,b) -> a + b);
        System.out.println("F total: "+total);
    }

    public static void  e3(){
        for (int i : numbers) {
            boolean status = isEven.test(i);
            boolean isMultipleOf5 = fIsMultipleOf5.test(i);
            boolean isMultipleOf11 = fIsMultipleOf11.test(i);
            System.out.format("isEven: %s   isMultipleOf5: %s   isMultipleOf11: %s   number: %s \n",
                    status, isMultipleOf5, isMultipleOf11, i);
        }
    }
    public static void  e4(){
        Predicate<Integer> pTotal = e -> false;

        pTotal =isEven.or(fIsMultipleOf11).or(fIsMultipleOf5);
        for (int i : numbers) {
            boolean isEligible = pTotal.test(i);
            System.out.format("number: %s   isEligible: %s \n", i, isEligible);
        }
    }

    public static void  e5(int... inputNumbers){
        Predicate<Integer> pTotal = e -> false;
        for (int i : inputNumbers) {
            pTotal = pTotal.or(e -> e % i == 0);
        }
        for (int i : numbers) {
            boolean isEligible = pTotal.test(i);
            System.out.format("number: %s   isEligible: %s \n", i, isEligible);
        }
    }

    public static void  e6(int... inputNumbers){
        Predicate<Integer> predicate = e -> false;
       var fIsEligible = Arrays.stream(inputNumbers)
               .mapToObj(m -> predicate.or(e -> e % m ==0))
               .reduce((a,b) -> a.or(b))
               .get();

        for (int i : numbers) {
            boolean isEligible = fIsEligible.test(i);
            System.out.format("number: %s   isEligible: %s \n", i, isEligible);
        }
    }
}
