package day3435Lambda;

import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda9 {

	public static void main(String[] args) {
        System.out.println(sum1(20));//210
        System.out.println(sum2(20));//210
        System.out.println(sum3(20));//210
        System.out.println(sum4(7, 13));//30
        System.out.println(sum5());//2500
        System.out.println(sum6());//2500
        System.out.println(powerOf3(4));
        System.out.println(AnyPowOfAnyNum(3, -6));//-216
        System.out.println(AnyPowOfAnyNum1(-3, 5));//0.008
        System.out.println(factorial1(12));//If you create the method by using integer, you can calculate 12! at most
        System.out.println(factorial2(50));//30414093201713378043612608166064768844377641568960512000000000000
        
	}
    //                                  5 Minutes
    //Create a method to find the sum of integers from 1 to x by using "structured programming"
    public static int sum1(int x){
        int sum = 0;
        for(int i=1; i<=x; i++){
            sum = sum + i;
        }
        return sum;
    }

    //Create a method to find the sum of integers from 1 to x by using "functional programming"
    //1.Way:
    public static int sum2(int x){
        return IntStream.range(1,x+1).sum();
    }
    //2.Way:
    public static int sum3(int x){
        return IntStream.rangeClosed(1,x).sum();
    }
    //Create a method to find the sum of even integers from x to y by using "functional programming"
    public static int sum4(int x, int y){
        return IntStream.rangeClosed(x, y).filter(t->t%2==0).sum();
    }

    //Create a method to find the sum of first 50 odd positive integers by using "functional programming"
    //1.Way: Not recommended
    public static int sum5() {
        return IntStream.rangeClosed(1,99).filter(t->t%2!=0).sum();
    }
    //2.Way: Recommended
    public static int sum6(){
        return IntStream.iterate(1,t->t+2).limit(50).sum();
    }
    //Create a method to find the any power of 3 by using "functional programming" (Ex: 4th power of 3 is 3*3*3*3)
    public static OptionalInt powerOf3(int numOfPow){
       return IntStream.iterate(3, t->t*3).limit(numOfPow).reduce((x,y)->y);
    }
    //Create a method to find the any power of any integer by using "functional programming" (Ex: 4th power of 2 is 2*2*2*2)
    public static OptionalInt AnyPowOfAnyNum(int pow, int num){
        return IntStream.iterate(num, t->t*num).limit(pow).reduce((x,y)->y);
    }
    //Create a method to find the any power(negative or positive) of any integer by using "functional programming" (Ex: 4th power of 2 is 2*2*2*2)
    public static double AnyPowOfAnyNum1(int x, int y){
        int result = IntStream.iterate(y, t->t*y).limit(Math.abs(x)).reduce(Integer.MIN_VALUE, (a,b)-> a>b ? a : b);
        return 1.0/result;
    }
    //Create a method to calculate the factorial of any number (5!=1x2x3x4x5)
    //1.Way:First way works until 12!
    public static OptionalInt factorial1(int x){
        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact);
    }
    //2.Way: Second way works for all number
    public static BigInteger factorial2(int x){
        return IntStream.rangeClosed(1, x).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply);
    }
}

