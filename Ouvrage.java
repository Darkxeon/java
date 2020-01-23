import java.util.*;
class Ouvrage
{
	protected GregorianCalendar dateCreation;
	protected int cote;
	protected static int nombreOuvrage=0;
	protected String titre;
	
	/**Le constructeur d'Ouvrage permet d'initialiser le nombre d'ouvrage, la cote,
	 la date et le nom de l'auteur*/
	
	public Ouvrage(String titre)
	{
		dateCreation = new GregorianCalendar();
		nombreOuvrage++;
		cote = nombreOuvrage;
		this.titre = titre;
	}
	
	public void affiche()
	{
		int mois = dateCreation.get(Calendar.MONTH)+1;
		System.out.println("La côte est: "+ cote);
		System.out.println("Le nombre d'ouvrages est: "+ nombreOuvrage);
		System.out.println("L'année de création est: "+dateCreation.get(Calendar.YEAR));
		System.out.println("Le mois de création est: "+mois);
		System.out.println("Le jour de création est: "+dateCreation.get(Calendar.DATE));
		System.out.println(" ");
		Syste.out.println("Titre = "+ titre);
			
	}
	
	public static void main(String[] arg)
	{
		Ouvrage o = new Ouvrage("titre1");
		o.affiche();
	}
	
}
