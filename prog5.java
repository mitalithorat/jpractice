import java.util.*;
class prog5
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=new String();
		String str=new String();
		System.out.println("enter string:");
		str1=sc.nextLine();
		StringBuffer str2=new StringBuffer(str1);
		if(str1.length()%2!=0)
		{
			str2.append(" ");
		}
		String str3=new String(str2);
		for(int i=0;i<str3.length();i++)
		{
			if(i%2==0)
			{
				str=str+str3.charAt(i+1);		
			}
			else
			{
				str=str+str3.charAt(i-1);
			}
	
		}
		StringBuffer str4=new StringBuffer(str);
		str4.reverse();
		System.out.println("result:"+str4);
	}
}