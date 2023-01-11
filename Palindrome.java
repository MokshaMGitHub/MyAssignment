package assignment.week1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = "Nitin";
		strName = strName.toLowerCase();
		String strRev = "";
		char[] chNameArr = strName.toCharArray();
		for (int i = chNameArr.length-1; i >= 0 ; i--) {
			strRev += chNameArr[i];
		}
		if(strRev.equals(strName)) {
			System.out.println("Its a Palindrome");
		}

	}

}
