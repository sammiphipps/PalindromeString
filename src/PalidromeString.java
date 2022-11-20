
import java.util.Scanner; 

public class PalidromeString {
	private String reverseString(String word) {
		String reverse = new String(); 
		
		for(int i = word.length(); i > 0; i--) {
			reverse = reverse + word.charAt(i - 1); 
		}
		
		return reverse; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		PalidromeString ps = new PalidromeString(); 
		
		System.out.print("Please enter a word you would like to check: ");
		String word = sc.next(); 
		
		sc.close();

		String reverseWord = ps.reverseString(word); 
		
		if (word.equalsIgnoreCase(reverseWord)) {
			System.out.print("This is a palidrome.");
		} else {
			System.out.print("This is not a palidrome.");
		}
		
	}

}
