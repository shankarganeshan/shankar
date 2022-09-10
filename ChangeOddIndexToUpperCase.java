package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String name = "Javacore";  //Javacore
	
		char[] charArray = name.toCharArray();
		int length = charArray.length;
		
		
		for (int i = 0; i < length; i++) {
			if (i%2!=0) {
				
				charArray[i]= Character.toUpperCase(charArray[i]);
				
				
				
			}
			System.out.print(charArray[i]);
			
			
			
		}
	}

}
