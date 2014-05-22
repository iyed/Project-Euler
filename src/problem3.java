
public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long aNum=600851475143L; 
		for (long i=((aNum+1)/2); i >0;i--)
		{
			if (isPrime(i)&& aNum%i==0)
			{
			System.out.println("The largest prime factor is "+i);
			break;
			}
		}
	}
	public static boolean isPrime(long a){
		boolean test =true;
		if (a%2==0)
		{
			for (long j=2;j<=(a/2);j++)
			{
				if (a%j==0)
					return false;
			}
		}
		else
		{
			for (long j=2;j<=((a+1)/2);j++)
			{
				if (a%j==0)
					return false;
			}
		}
		return test;
	}

}
