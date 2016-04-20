import java.util.Scanner;

public class S2Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Voter Eligibility testing App");
		
		Scanner ec=new Scanner(System.in);
		Integer age;
		
		System.out.println("What is your Age");
		
		age=ec.nextInt();
		
		if(age >=18)
			System.out.println("You are Eligible for Voting");
		else 
			System.out.println("You are not eligible for Voting");

	}

}
