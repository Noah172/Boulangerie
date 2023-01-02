package fournisseurs;

public class FournisseursFarine extends Fournisseurs {

	public FournisseursFarine(String nom, String ingredients, int prixparkilo) {
		super(nom, ingredients, prixparkilo);

	}

	@Override
	public String passage() {
		return "1 fois par semaine";
	}

}
