class Livre extends Ouvrage
{
	private String auteur;
	private String editeur;
	
	public Livre(String titre, String auteur, String editeur)
	{
		super(titre);
		this.auteur = auteur;
		this.editeur = editeur;
	}
	
	public void affiche()
	{
		super.affiche();
		System.out.println("Auteur = "+ auteur);
		System.out.println("Editeur = "+ editeur);
	}
}

class Periodique extends Ouvrage
{
	private int periodicite;
	
	public Periodique(String titre, int periodicite)
	{
		super(titre);
		this.periodicite = periodicite;
	}
	
	public void affiche()
	{
		super.affiche();
		System.out.println("Periodicité = "+ periodicite);
		
	}
}