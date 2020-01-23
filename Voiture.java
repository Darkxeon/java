class Voiture
{
	private String nomConstructeur;
	private String model;
	private float prix;
	private int annee;
	
	public Voiture(String nomConstructeur, String model, float prix, int annee)
	{
		this.nomConstructeur = nomConstructeur;
		this.model = model;
		this.prix = prix;
		this.annee = annee;
	}
	
	public Voiture(Voiture v)
	{
		this.nomConstructeur = v.nomConstructeur;
		this.model = v.model;
		this.prix = v.prix;
		this.annee = v.annee;
	}
	
	public String getNomConstructeur()
	{
		return nomConstructeur;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public float getPrix()
	{
		return prix;
	}
	
	public int getAnnee()
	{
		return anneee;
	}
	
	
	public void affiche()
	{
		System.out.println("nom constructeur ="+nomConstructeur);
		System.out.println("modèle ="+model);
		System.out.println("année ="+annee);
		System.out.println("prix ="+prix);
		
	}
}