package quiz;

public abstract class Generator {

	private int nbQuestion;
	private String reponse;
	private String question;

	/**
	 * Constructeur.
	 * 
	 * @param nbQuestion
	 */
	public Generator(int nbQuestion) {
		this.nbQuestion = nbQuestion;
	}

	/**
	 * @return the nbQuestion
	 */
	public int getNbQuestion() {
		return nbQuestion;
	}
	
	/**
	 * @return the reponse
	 */
	public String getReponse() {
		return reponse;
	}

	/**
	 * @param reponse the reponse to set
	 */
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	
	/**
	 * @return the question
	 */
	public String getQuestion() {
		theQuestion();
		return question;
	}
	
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the question
	 */
	public abstract void theQuestion();

}
