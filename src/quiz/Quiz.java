package quiz;

public abstract class Quiz {

	private Generator generator;
	private int nbBonneRep;
	private long startTime, endTime, timeElapsed;

	/**
	 * constructeur
	 * 
	 * @param generator
	 */
	public Quiz(Generator generator) {
		this.generator = generator;
	}

	/**
	 * démarre le programme
	 */
	public void start() {
		startTime = System.currentTimeMillis();
		this.afficheQuestion();
	}

	/**
	 * donne le résultat
	 */
	public void displayResults() {
		endTime = System.currentTimeMillis();
		timeElapsed = (endTime - startTime) / 1000;
	}

	public String resultat() {
		endTime = System.currentTimeMillis();
		timeElapsed = (endTime - startTime) / 1000;
		return "Votre score est : " + nbBonneRep + "/" + generator.getNbQuestion() + "\nVous avez mis " + timeElapsed
				+ "s pour répondre aux questions.";
	}

	/**
	 * @param nbBonneRep the nbBonneRep to set
	 */
	public void setNbBonneRep(int nbBonneRep) {
		this.nbBonneRep = nbBonneRep;
	}

	/**
	 * @return the generator
	 */
	public Generator getGenerator() {
		return generator;
	}

	/**
	 * vérification si la réponse est bonne
	 * 
	 * @param reponse
	 */
	public String verifReponse(String reponse) {
		if (reponse.toLowerCase().equals(generator.getReponse().toLowerCase())) {
			nbBonneRep++;
			return "Bonne Réponse";
		} else {
			return "Mauvaise réponse. La réponse était " + generator.getReponse();
		}
	}

	/**
	 * Méthode à redéfinir pour afficher la réponse en mode console ou graphique
	 */
	public abstract void afficheQuestion();

}
