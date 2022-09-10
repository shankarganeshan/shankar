package week1.day2;

public class FIndInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {3,2,11,4,6,7};
		int length1 = array1.length;
		
		int[] array2 = {1,2,8,4,9,7};
		int length2 = array2.length;
		System.out.println("Intersection between two arrays is:");
		for (int i = 0; i < array1.length; i++) 
		{
			for (int j = 0; j < array2.length; j++) {
				
				if (array1[i]==array2[j]) {
					
					System.out.println(array1[j]);
					
				}
			}
		}

	}

}
