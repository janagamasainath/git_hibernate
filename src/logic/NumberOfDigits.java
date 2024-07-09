package logic;

public class NumberOfDigits {
    public static void main(String[] args) {
        int a = 6789;
        int count = 0;
        
        while (a != 0) {
            a /= 10;
            count++;
        }
        
        System.out.println("Number of digits: " + count);
    }
}