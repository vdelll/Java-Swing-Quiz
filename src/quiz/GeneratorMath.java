package quiz;

import java.util.Random;

public class GeneratorMath extends Generator {
	
	private String question;
	private String reponse;

	public GeneratorMath(int nbQuestion) {
		super(nbQuestion);
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
	 * Génere le pays aléatoirement
	 * @return
	 */
	private String genereCalculAleatoire() {
		
		Random random1 = new Random();
		int rd1 = random1.nextInt(10);
		Random random2 = new Random();
		int rd2 = random2.nextInt(10);
		int resultat =  rd1 + rd2;
		
		setReponse(String.valueOf(resultat));
		
		return rd1+ " + "+rd2;
	}
	
	/**
	 * @return the question
	 */
	public String getQuestion() {
		setQuestion(this.genereCalculAleatoire()+" ?");
		return this.question;
	}
	
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

}
