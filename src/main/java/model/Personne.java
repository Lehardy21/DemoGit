package model;

public class Personne {

	private String nom;
	private int age;
	private String prenom;

	
	
	public Personne(String nom, int age, String prenom) {
		super();
		this.nom = nom;
		this.age=age;
		this.prenom=prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
		
		
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", age=" + age + ", prenom=" + prenom + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 
	
	
}
