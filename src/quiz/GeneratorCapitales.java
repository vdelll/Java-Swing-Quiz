package quiz;

import java.util.ArrayList;
import java.util.Random;

public class GeneratorCapitales extends Generator {

	private int index;
	private ArrayList<Integer> indexesTaken = new ArrayList<>();
	private String[] tPays = { "Allemagne", "France", "Angleterre", "Espagne", "Italie" };
	private String[] tCapitales = { "Berlin", "Paris", "Londre", "Madrid", "Rome" };
	private Random random = new Random(); 
	private String question;
	private String reponse;
	
	public GeneratorCapitales(int nbQuestion) {
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
	private String generePaysAleatoire() {
		
		do {
			index = random.nextInt(tPays.length);

		} while (indexesTaken.contains(index));

		indexesTaken.add(index);
		
		setReponse(tCapitales[index]);
		
		return this.tPays[index];
	}
	
	/**
	 * @return the question
	 */
	public String getQuestion() {
		setQuestion("Quelle est la capitale de ce pays : "+this.generePaysAleatoire()+" ?");
		return this.question;
	}
	
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

}
