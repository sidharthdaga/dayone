package dayOne;

import java.util.*;
import java.io.*;

public class Test {
	
	private List<Question> questions;
	private File f;
	private Scanner input;
	
	public Test() {
		input = new Scanner(System.in);
		questions = new ArrayList<Question>();
	}
	
	public void test() {
		for(int i = 0; i < questions.size(); i++) {
			System.out.println(questions.get(i));
		}
	}
	
	public void create(String question, String answer1, String answer2, String answer3) {
		questions.add(new Question(question, answer1, answer2, answer3));
	}
}
