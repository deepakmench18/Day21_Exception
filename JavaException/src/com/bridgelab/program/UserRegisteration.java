package com.bridgelab.program;



import java.util.Scanner;

public class UserRegisteration {
	
	
	public static boolean firstNameValidation(String FirstName) throws CustomException
	{
		try
		{
		return FirstName.matches("^?[A-Z][a-z]*{3,}$");
		}catch(Exception e)
		{
			throw new CustomException("First Name is Invalid");
		}
	}
    public static boolean lastNameValidation(String LastName) throws CustomException
 	{
    	try
    	{
 		return LastName.matches("^?[A-Z][a-z]{1,3}$");
 	}catch(Exception e)
	{
		throw new CustomException("Last Name is Invalid");
	}
 	}
    public static boolean emailValidation(String Email) throws CustomException
    {
    	try {
    	 return Email.matches("^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@$"+ "[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$");
    }catch(Exception e)
	{
		throw new CustomException("Email is Invalid");
	}
    }
    public static boolean phonenumberValidation(String Number) throws CustomException
    {
    	try { 
    	return Number.matches("(0|91)?[7-9][0-9]{9}");
    }catch(Exception e)
	{
		throw new CustomException("Phone Number is Invalid");
	}
    }
    public static boolean passwordValidation1(String Password1) throws CustomException
    {
    	try {
    	return Password1.matches("^*[A-Za-z0-9]{8}"); //at least 8 char
    }catch(Exception e)
	{
		throw new CustomException("Password is Invalid");
	}
    }
    public static boolean passwordValidation2(String Password2) throws CustomException
    {
    	try {
    
    	return Password2.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8}$"); // at least one number and 8 char
    }catch(Exception e)
	{
		throw new CustomException("Password is Invalid");
	}
    }
    public static boolean passwordValidation3(String Password3) throws CustomException
    {
    	try {
    	return Password3.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$^&]).{8}$");
    }catch(Exception e){
		throw new CustomException("Password is Invalid");
	}  // at least one number and one special char
    }
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Name");
		String FirstName = sc.next();
		System.out.println("Enter Your Last Name");
		String LastName = sc.next();
        System.out.println("Enter Email ID");
        String Email = sc.next();
        System.out.println("Enter Phone Number");
        String Number = sc.next();
        System.out.println("Enter Your Password");
        String Password1 = sc.next();
        System.out.println("Enter Your Password");
        String Password2 = sc.next();
        System.out.println("Enter Your Password");
        String Password3 = sc.next();
		//System.out.println(firstNameValidation(FirstName));
		//System.out.println(firstNameValidation(LastName));
		//System.out.println(emailValidation(Email));
		//System.out.println(phonenumberValidation(Number)); 
		//System.out.println(passwordValidation1(Password1));
		//System.out.println(passwordValidation2(Password2));
		//System.out.println(passwordValidation3(Password3));
		 * 
		 */
	}
}
