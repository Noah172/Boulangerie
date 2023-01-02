package stocks;

public abstract class Ingrédients extends Recette {
	private String name;
	int quantite;

	public Ingrédients(String name, int quantite) {
		super();
		this.name = name;
		this.quantite = quantite;
	}


	public String getName() {
		return name;
	}


	public int getNombre() {
		return quantite;
	}
	public void annoncequantite(Ingrédients ingredient) {
		System.out.println("Il reste "+ingredient.quantite+" grammes de "+ingredient.name+".");
	}
	public abstract double prixpargramme();




	
}
