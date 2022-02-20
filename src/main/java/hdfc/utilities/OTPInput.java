package hdfc.utilities;

import java.util.Scanner;

public class OTPInput {

	String otp;
	Scanner sc;
	
	public String otpInput()
	{
		sc = new Scanner(System.in);
		
		System.out.println("Please enter your OTP here : ");
		otp = sc.next();
		
		return otp;
	}
	
}
