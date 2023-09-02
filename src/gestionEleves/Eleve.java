package gestionEleves;

import java.util.ArrayList;
import java.util.List;

public class Eleve {
	public static int numOrdre=0;
	private String nom;
	private double moyenne ;
	private int sommeMoyenne,nbNotes;
	
	List <Integer> listeNotes=new ArrayList<Integer>();
	public Eleve(String nomEleve){
		this.nom=nomEleve;
	}
public double getMoyenne() {
	moyenne=(double)sommeMoyenne/nbNotes;
	return moyenne;
}
public  String getNom() {
	return nom;
}
public List<Integer> getListeNotes() {
	return listeNotes;
}
public void ajouterNote(int note) {
	if(note <0)
		listeNotes.add(null);
	else if(note >20)
	  listeNotes.add(20);
	else 
		listeNotes.add(note);
	nbNotes+=1;
	sommeMoyenne+=note;
}
public  String toString() {
	return ("Eleve [nom=" + nom + ", moyenne="  + getMoyenne() + "]");
}






}
