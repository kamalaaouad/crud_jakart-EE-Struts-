package struts_projects.model;

public class Recette {
	
	@Override
	public String toString() {
		return "Recette [id=" + id + ", nom=" + nom + ", ingredients=" + ingredients + "]";
	}


	private int id;
	private String nom;
	private String ingredients;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getIngredients() {
		return ingredients;
	}


	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	

	public Recette(int id, String nom, String ingredients) {
		super();
		this.id = id;
		this.nom = nom;
		this.ingredients = ingredients;
	}


	public Recette() {
		
	}
	

}
