package Labs;

public class Multiplier {
    /*
Multiples of 3 or 5

   Problem 1
   If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6, and 9. The sum of these multiples is 23.
   Find the sum of all the multiples of 3 or 5 below 1000.
 */
    public static void main(String[] args) {
        printMultiples();
    }

    public static int multiples(int num1){
        int sum = 0;
        for(int i = 0; i < num1; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void printMultiples(){
        System.out.println(multiples(10));
        System.out.println(multiples(1000));
    }
}
