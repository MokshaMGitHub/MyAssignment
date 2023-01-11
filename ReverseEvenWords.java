package assignment.week1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = "I am a software tester";
		String[] strArrayName = new String[strName.length()];
		String strEven = "";
		String strTemp = "";
		String strOdd = "";
		String[] strNewArray = new String[strName.length()];
		strArrayName = strName.split(" ");

		for (int i = 0; i <= strArrayName.length-1; i++) {
		//	System.out.println(strArrayName[i]);
			if(i%2!=0)
			{
				strEven = strArrayName[i];
				for(int j = strEven.length()-1; j>=0;j--) {
				strTemp += strEven.charAt(j);
				
				}
				strNewArray[i] = strTemp + " ";
				strTemp = "";

			}
			else {
				strOdd = strArrayName[i];
					
					strNewArray[i] = strOdd + " ";
					strOdd = "";
				}
			System.out.print(strNewArray[i]);
				 
		}
		//System.out.print(strNewArray);

	}
	}

