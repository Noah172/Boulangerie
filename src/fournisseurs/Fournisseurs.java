package fournisseurs;

public abstract class Fournisseurs {
	private String nom;
	private String ingredients;
	private int prixparkilo;
	
	
	
	public String getNom() {
		return nom;
	}

	public String getIngredients() {
		return ingredients;
	}

	public int getPrixparkilo() {
		return prixparkilo;
	}



	public Fournisseurs(String nom, String ingredients, int prixparkilo) {
		super();
		this.nom = nom;
		this.ingredients = ingredients;
		this.prixparkilo = prixparkilo;
	}
	
	public abstract String passage();
}
