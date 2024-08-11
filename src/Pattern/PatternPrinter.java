package Pattern;


	

	import java.util.Scanner;

	public class PatternPrinter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        printPattern(n);
	    }

	    public static void printPattern(int n) {
	        // First half of the pattern
	        for (int i = 0; i < (n + 1) / 2; i++) {
	            for (int j = n - (n % 2 == 0 ? 1 : 0); j >= 1 + i * 2; j -= 2) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Second half of the pattern
	        for (int i = 0; i < (n + 1) / 2; i++) {
	            for (int j = n; j >= n - i * 2; j -= 2) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	}