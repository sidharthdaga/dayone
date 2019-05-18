package dayOne;

public class Question {
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;

	public Question(String question, String answer1, String answer2, String answer3) {
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer(int answer) {
		if(answer == 1) {
			return answer1;
		}
		if(answer == 2) {
			return answer2;
		}
		if(answer == 3) {
			return answer3;
		}
		return answer1;
	}
}
