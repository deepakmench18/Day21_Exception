package com.bridgelab.test;
import com.bridgelab.program.*;
import com.bridgelab.program.MoodAnalyzer;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	void analyserMoodTest() {
	
		MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Happy Mood");
		try
		{
			assertEquals("Happy",moodanalyzer.analyzerMoode());
		}catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	@Test
	void analyserMoodTest1() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer("I am in Sad Mood");
		     try
		     {
			assertEquals("Sad",moodanalyzer.analyzerMoode());
		     }catch (CustomException e) {} 
				
	}
	
	@Test
	void analyserMoodTest2() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer(null);
			try {
				assertEquals("Happy",moodanalyzer.analyzerMoode());
			} catch (CustomException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	}  
	@Test
	void analyserMoodTest3() {
		MoodAnalyzer moodanalyzer = new MoodAnalyzer("");
		try
		{
			assertEquals("Sad",moodanalyzer.analyzerMoode());
		}catch(CustomException e)
		{
			System.out.println(e.getMessage());
		}
	}  

}
