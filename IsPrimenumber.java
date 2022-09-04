package week1.day1;

public class IsPrimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 13;
		int flag = 0; 
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag = 1;
				System.out.println("The given number is not a prime number");
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("The given number is a prime number");
		}
		
		
	}

}
