package exoGetJava;

public class PersonneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne1=new Personne("toto",10);
		System.out.println(personne1.getNom()+" a "+personne1.getAge()+" ans");
		System.out.println("Quelques annees plus tard");
		while(personne1.getAge()<21) {
			System.out.print(".");
			personne1.feterAnniv();
		}
		personne1.setNom("toto-mariage");
		
		System.out.println("\n A "+personne1.getAge()+" ans il se marie");
		System.out.println("Nouveau nom: " +personne1.getNom());
		System.out.println("cinq annees plus tard");
		
		while(personne1.getAge()<26) {
			System.out.print(".");
			personne1.feterAnniv();
		}
		System.out.println("\n"+personne1.getNom()+" a maintenant "+personne1.getAge()+" ans");
		}

}
