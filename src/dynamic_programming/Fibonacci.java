package dynamic_programming;

public class Fibonacci {
    public void main(String[] args) {
        int i = 9;
        int result = printFibonacci(i);
        System.out.println(result);
    }






































    private static int printFibonacci(int number){
        int[] fibonacci = new int[number + 2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i <= number; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci[number];
    }
}
