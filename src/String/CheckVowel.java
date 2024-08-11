package String;

public class CheckVowel 
{
	
	public static void IsVowel(String str)
	
	{
		str=str.toLowerCase();
		for(int i=0; i<=str.length()-1; i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.print(ch+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		String str= "Aahul";
		IsVowel(str);
	}
	
	

}
