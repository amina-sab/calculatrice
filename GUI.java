import java.awt.*;

import javax.swing.*;

public class GUI extends JFrame {

	// attributs de object Graphique

	// JTextField

	// 16 boutton de commande (JButton

	JPanel contenuFenêtre;// conteneur d 'element muni d'un gestionnaire d'emplacement des composantq

	JTextField champAffichage;// zone d'edition de texte

	JButton bouton0;// cree un bouton

	JButton bouton1;

	JButton bouton2;

	JButton bouton3;

	JButton bouton4;

	JButton bouton5;

	JButton bouton6;

	JButton bouton7;

	JButton bouton8;

	JButton bouton9;

	JButton boutonVirgule;

	JButton boutonEgale;

	JButton plus;

	JButton moins;

	JButton fois;

	JButton div;

	public GUI()

	{
		this.setTitle("Calculatrice");// titre de la classe
		contenuFenêtre = new JPanel();
		this.getContentPane().add(contenuFenêtre);// inserer un elemnt dans la fenetre
		contenuFenêtre.setLayout(new BorderLayout());// appliquer le gestionnaire de placement borderLayout
        champAffichage = new JTextField("0");//initialisation de l'obj
		contenuFenêtre.add(BorderLayout.NORTH, champAffichage);// mettre l'obj champAffichage dans le nord d ela fenetre (contenu fenetre)
		bouton0 = new JButton("0");//initiliser les boutons
		bouton1 = new JButton("1");
		bouton2 = new JButton("2");
		bouton3 = new JButton("3");
		bouton4 = new JButton("4");
		bouton5 = new JButton("5");
		bouton6 = new JButton("6");
		bouton7 = new JButton("7");
		bouton8 = new JButton("8");
		bouton9 = new JButton("9");
		boutonVirgule = new JButton(",");
		boutonEgale = new JButton("=");

		JPanel panneauChiffres = new JPanel(); //crer un autre contenu de fenetre
        GridLayout disposition2 = new GridLayout(4, 3);//placement des 4 ligne 3 colonnes

		panneauChiffres.setLayout(disposition2);//modifier la strategie de  placement panneau  

		panneauChiffres.add(bouton1);
		panneauChiffres.add(bouton2);
		panneauChiffres.add(bouton3);
		panneauChiffres.add(bouton4);
		panneauChiffres.add(bouton5);
		panneauChiffres.add(bouton6);
		panneauChiffres.add(bouton7);
		panneauChiffres.add(bouton8);
		panneauChiffres.add(bouton9);
		panneauChiffres.add(bouton0);
		panneauChiffres.add(boutonVirgule);
		panneauChiffres.add(boutonEgale);

		contenuFenêtre.add(BorderLayout.CENTER, panneauChiffres);

		JPanel op = new JPanel();
		GridLayout disposition3 = new GridLayout(4, 1);

		op.setLayout(disposition3);

		plus = new JButton("+");
		moins = new JButton("-");
		fois = new JButton("*");
		div = new JButton("/");

		op.add(plus);
		op.add(moins);
		op.add(fois);
		op.add(div);

	contenuFenêtre.add(BorderLayout.EAST, op);

		this.setVisible(true);

		this.pack();

	}

	public static void main(String[] args)

	{
		new GUI();

	}

}