package exercice5;

import java.util.Scanner;

public class factorielNbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrer =new Scanner(System.in);
		System.out.println("Entrer le nombre a mettre sous Factoriel ");
		int nbrfac=entrer.nextInt();
		if(nbrfac<0 || nbrfac>20) {
			
System.out.println("exit...");
			System.exit(0);
	 }else {
		 Factorieln nfac=new Factorieln(nbrfac);
			int	factorin=nfac.calfac();
			nfac.affichageFac(factorin);
	 }
	 }
	
}
 class Factorieln {
	
	private int a;

	public Factorieln (int b) {
	this.a=b;
	}
	int calfac() {
	int	nbrfacw=1;	
	for(int i=1;i<=a;i++) {
		
		   nbrfacw*=i;
			}
		return nbrfacw;
		}
	  void affichageFac(int b) {
			System.out.println("le Factoriel est de "+b);
		}
}
