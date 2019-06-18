package quiz;

import javax.swing.JOptionPane;

public class GUIQuiz extends Quiz {

	public GUIQuiz(Generator generator) {
		super(generator);
	}

	@Override
	public void afficheQuestion() {
		setNbBonneRep(0);
		for (int i = 0; i < getGenerator().getNbQuestion(); i++) {
			String reponse = JOptionPane.showInputDialog(null, getGenerator().getQuestion());
			JOptionPane.showMessageDialog(null, verifReponse(reponse));
		}
		JOptionPane.showMessageDialog(null, resultat());
	}

}
