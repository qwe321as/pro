
public class QuizProtocol {

	private static final int WAITING = 0;
	private static final int PROBLEM = 1;
	private static final int ANSWER = 2;
	private static final int NUMPROBLEM = 3;
	
	private int state = WAITING;
	private int currentProblem = 0;
	
	private String[] problems = {
									"��Ʈ��ũ ó�� ��Ű����?",
									"������ ���� Ŭ������?",
									"���ͳݿ��� ��ǻ�͸� �ĺ��ϴ� �ּҴ�?"
								};
	
	private String[] answers = {"java.net","ServerSocket","IP �ּ�"};
	
	public String process(String input) {
		
		String output = null;
		
		if(state == WAITING) {
			output = "��� �����մϴ�.";
			state = PROBLEM;
		}
		else if(state == PROBLEM) {
			if(input.equalsIgnoreCase("y")) {
				output = problems[currentProblem];
				state = ANSWER;
			}
			else {
				state = WAITING;
				output="quit";
			}
		}
		else if(state == ANSWER) {
			if(input.equalsIgnoreCase(answers[currentProblem])) {
				output="�����Դϴ�. ����Ͻðڽ��ϱ�?(y/n):";
				state= PROBLEM;
			}
			else {
				output="�����Դϴ�. ����Ͻðڽ��ϱ�?(y/n):";
				state= PROBLEM;
			}
			currentProblem = (currentProblem+1) % NUMPROBLEM;
		}
		return output;
	}
	
}







