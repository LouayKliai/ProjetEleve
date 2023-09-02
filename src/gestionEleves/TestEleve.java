package gestionEleves;

public class TestEleve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Eleve e1=new Eleve("Ahmed");
        e1.ajouterNote(15);
        e1.ajouterNote(-12);
        e1.ajouterNote(22);
        System.out.println("Affichage sans methode toString()");
       System.out.println(e1);
       System.out.println("Affichage avec methode toString()");
       System.out.println(e1.toString());
	}

}
