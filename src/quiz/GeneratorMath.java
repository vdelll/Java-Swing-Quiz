package quiz;

import java.util.Random;

public class GeneratorMath extends Generator {

	public GeneratorMath(int nbQuestion) {
		super(nbQuestion);
	}

	/**
	 * Génere le pays aléatoirement
	 * 
	 * @return
	 */
	private String genereCalculAleatoire() {

		Random random1 = new Random();
		int rd1 = random1.nextInt(10);
		Random random2 = new Random();
		int rd2 = random2.nextInt(10);
		int resultat = rd1 + rd2;

		setReponse(String.valueOf(resultat));

		return rd1 + " + " + rd2;
	}

	/**
	 * @return the question
	 */
	public void theQuestion() {
		setQuestion(this.genereCalculAleatoire() + " ?");
	}


}
