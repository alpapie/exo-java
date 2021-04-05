package exoGetJava;

public class Personne {
	private String nom="inconue";
	private int age=0;
	Personne(String newNom,int newAge){
		this.nom=newNom;
		this.age=newAge;
	}
	String getNom(){
		return nom;
	}
	int getAge(){
		return age;
	}
	void setNom( String nom){
		this.nom=nom;
	}
	void feterAnniv() {
		this.age+=1;
	}
}
