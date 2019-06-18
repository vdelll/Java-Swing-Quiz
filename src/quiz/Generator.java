package quiz;

public abstract class Generator {
	
	private int nbQuestion;

	/**
	 * Constructeur.
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
	 * @return the question
	 */
	public abstract String getQuestion();
	
	public abstract String getReponse();
	
}
