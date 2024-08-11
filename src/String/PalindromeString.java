package String;

public class PalindromeString 
{
	public static void main(String[] args) {
		String str="Racecar";
		String rev="";
		
;		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
		
		
	}

}
