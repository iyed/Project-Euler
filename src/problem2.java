
public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=1;
		int secondNum=2;
		int intNum=0;
		int sum=0;
		while (secondNum <= 4000000)
		{
			if (secondNum%2==0)
				sum=sum+secondNum;
			intNum=secondNum;
			secondNum=firstNum+secondNum;
			firstNum=intNum;
		}
		System.out.println(sum);
	}

}
