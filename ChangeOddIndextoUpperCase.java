package assignment.week1;

public class ChangeOddIndextoUpperCase {

	public static void main(String[] args) {
		String strName = "My name is Moksha";
				char[] strToUpper  =  new char[strName.length()] ;
						
				char [] charArrayName = strName.toCharArray();
		for (int i = 0; i < charArrayName.length; i++) {
			if(i%2 != 0)
			{
				strToUpper[i] = Character.toUpperCase(charArrayName[i]);
				
			}
			else {
				strToUpper[i] = charArrayName[i];
		}
	}
System.out.print(strToUpper);
	}	

}
