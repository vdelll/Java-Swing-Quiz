package quiz;

import java.util.Scanner;

public class ConsoleQuiz extends Quiz {

	public ConsoleQuiz(Generator generator) {
		super(generator);
	}

	@Override
	public void afficheQuestion() {
		Scanner clavier = new Scanner(System.in);
		setNbBonneRep(0);
		for (int i = 0; i < getGenerator().getNbQuestion(); i++) {
			System.out.println(getGenerator().getQuestion());
			String reponse = clavier.nextLine();
			System.out.println(verifReponse(reponse));
		}
		clavier.close();
		System.out.println(resultat());
	}
}
