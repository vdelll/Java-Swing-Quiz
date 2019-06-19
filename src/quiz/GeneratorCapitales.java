package quiz;

import java.util.ArrayList;
import java.util.Random;

public class GeneratorCapitales extends Generator {

	private int index;
	private ArrayList<Integer> indexesTaken = new ArrayList<>();
	private String[] tPays = { "Allemagne", "France", "Angleterre", "Espagne", "Italie" };
	private String[] tCapitales = { "Berlin", "Paris", "Londre", "Madrid", "Rome" };
	private Random random = new Random();

	public GeneratorCapitales(int nbQuestion) {
		super(nbQuestion);
	}

	/**
	 * Génere le pays aléatoirement
	 * 
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
	@Override
	public void theQuestion() {
		setQuestion("Quelle est la capitale de ce pays : " + this.generePaysAleatoire() + " ?");
	}


}
