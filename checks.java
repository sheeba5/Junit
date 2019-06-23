package testing;

public class CheckingTest {

	public String checks(String s) {
		StringBuilder str=new StringBuilder(st);
		if(s.charAt(0)=='A' && s.charAt(1)=='A')
		{
			str.delete(0,1);
			
		}
		if(s.charAt(0)=='A')
		{
			str.deleteCharAt(0);
		}
		else {
			if(s.charAt(1)=='A')
			{
				str.deleteCharAt(1);
			}
		}
		return str.toString();
	}
	

}
