package com.bridgelab.program;

public class MoodAnalyzer {
	String message;
	public MoodAnalyzer(String message)
	{
		this.message = message;
	}
	
	
	public String analyzerMoode() throws CustomException
	{
		try
		{
		 if(message.contains("Happy"))
		{
			return "Happy";
		}
		if(message == "")
			 throw new CustomException("message is Empty");
		return "Sad";
		}
		catch(Exception e)
		{
			throw new CustomException("message is Null");
		}
	}
}
