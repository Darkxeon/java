public class Matrice
{
	protected Vecteur Vx;
	protected Vecteur Vy;
	protected Vecteur Vz;
	
	public Matrice()
	{
	}
	
	public Matrice(Vecteur Vx, Vecteur Vy, Vecteur Vz)
	{
		this.Vx = new Vecteur(Vx);
		this.Vy = new Vecteur(Vy);
		this.Vz = new Vecteur(Vz);
	}
	
	public Matrice(Matrice m)
	{
		this(m.Vx, m.Vy, m.Vz);
	}
	
	public Vecteur getVx()
	{
		return new Vecteur(Vx);
	}
	
	public void setVx(Vecteur v )
	{
		Vx = new Vecteur(v);
	}
	
	public Vecteur getVy()
	{
		return new Vecteur(Vy);
	}
	
	public Vecteur getVz()
	{
		return new Vecteur(Vz);
	}
	
	public Matrice sommeMatrice(Matrice m)
	{
		Matrice m2 = new Matrice(Vx.sommeVecteur(m.Vx), Vy.sommeVecteur(m.Vy), Vz.sommeVecteur(m.Vz));
		return m2;
	}
	
	public void afficheMatrice()
	{
		System.out.println("Voici les valeurs du premier vecteur de la matrice");
		this.Vx.affiche();
		
		System.out.println("Voici les valeurs du deuxième vecteur de la matrice");
		this.Vy.affiche(); 
		
		System.out.println("Voici les valeurs du troisième vecteur de la matrice");
		this.Vz.affiche();
	}
		
	
	
	public static void main(String[] arg)
	{
		Vecteur V1 = new Vecteur(0,0,0);
		Vecteur V2 = new Vecteur(1,1,1);
		Vecteur V3 = new Vecteur(2,2,2);
		Matrice M1 = new Matrice(V1, V2, V3);
		
		Vecteur V4 = new Vecteur(3,3,3);
		Vecteur V5 = new Vecteur(4,4,4);
		Vecteur V6 = new Vecteur(5,5,5);
		Matrice M2 = new Matrice(V4, V5, V6);
		
		Matrice M3 = new Matrice(M2);
		M3.afficheMatrice();
		
		Matrice M4 = M1.sommeMatrice(M2);
		M4.afficheMatrice();
	}
	
		
}
