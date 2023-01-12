package assignment.week1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String strName = "I am a software tester tester";
		String strName = "We learn java basics as part of java sessions in java week1";
		String[] strArrayName = new String[strName.length()];
		String[] strNewArrayName = new String[strName.length()];

		String strTemp = "java";

	//	String[] strNewArray = new String[strName.length()];
		strArrayName = strName.split(" ");

		for (int i = 0; i <= strArrayName.length-1; i++) {
			if(strArrayName[i].equals(strTemp)) {
				//count +=1;
				strNewArrayName[i]=strArrayName[i].replace(strTemp, "");
			}
			else {
				strNewArrayName[i] = strArrayName[i];
			}
			System.out.print(strNewArrayName[i] + " ");
			}
		

	}

}
