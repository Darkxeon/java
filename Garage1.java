class Garage1
{
	private String nomGarage;
	private Voiture[] tab1;
	
	public Garage1(String nomGarage, Voiture v1, Voiture v2, Voiture v3)
	{
		this.nomGarage = nomGarage;
		tab1 = new Voiture[3];
		tab1[0] = new Voiture(v1);
		tab1[1] = new Voiture (v2);
		tab1[2] = new Voiture (v3);	
	
	}
	
	public void affiche()
	{
		System.out.println("Nom du garage = "+nomGarage);
		
		for(int i=0;i<3;i++)
			tab1[i].affiche(); 
	}
	
	public static void main(Strin[] arg)
	{
		Voiture v1 = new Voiture("Renault", "Clio", 7000, 2005);
		Voiture v2 = new Voiture("Renault", "Clio", 9000, 2008);
		Voiture v3 = new Voiture("Renault", "Megane", 10000, 2011);
		v1.affiche();
		v2.affiche();
		v3.affiche();
		Garage1 g1 = new Garage1("MnGarage", v1, v2, v3);
		g1.affiche();
		
	}
	
	
}
