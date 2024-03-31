//Write a Java program that will accept an integer and convert it into a binary representation. 
//Now count the number of bits equal to zero in this representation.
import java.util.*;

public class CountZeroBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int zeroCount = 0;
        String binary = Integer.toBinaryString(number);
        
        for (char bit : binary.toCharArray()) {
            if (bit == '0') {
                zeroCount++;
            }
        }
        
        System.out.println("Number of zero bits: " + zeroCount);
    }
}
