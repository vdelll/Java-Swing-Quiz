package quiz;

public class QuizDriver {

	/*
	 * Sorry pour le franglais.
	 */
	
	public static void main(String[] args) {
		Quiz quiz = new GUIQuiz(new GeneratorMath(3));
		quiz.start();
	}
	
}
