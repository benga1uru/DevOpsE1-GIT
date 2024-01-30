public class ThreeSort{
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		/*
		int num1 = 99;
		int num2 = 999;
		int num3 = -99;
		*/
		
		//Smallest of three using Math.min()
		int firstNum = Math.min(num1, num2);
		firstNum = Math.min(firstNum, num3);
		
		//Largest of three using Math.max()
		int thirdNum = Math.max(num1, num2);
		thirdNum = Math.max(thirdNum, num3);
		
		//Second Number using comparison
		int secondNum = num1+num2+num3-firstNum-thirdNum;
		
		System.out.println(firstNum +","+ secondNum +","+ thirdNum);
		













	



		
	}
}

