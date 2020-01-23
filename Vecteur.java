class Vecteur
{
	private float x, y, z;

	public Vecteur()
	{
	}
	
	public Vecteur(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vecteur(Vecteur v)
	{
		x = v.x;
		y = v.y;
		z = v.z;	
	
	}
	

	public Vecteur sommeVecteur(Vecteur v)
	{
		Vecteur v3 = new Vecteur(this.x+v.x, this.y+v.y, this.z+v.z);
		return v3;
	}
	
	public Vecteur produit1(float a)
	{
		Vecteur v3 = new Vecteur(a*this.x, a*this.y, a*this.z);
		return v3;
	}
	
	public float produit2(Vecteur v2)
	{
		return this.x*v2.x + this.y*v2.y + this.z*v2.z;
	}
	
	public void affiche()
	{
		System.out.println("X= "+x+"\n"+"Y= "+y+"\n"+"Z= "+z); 
	}
	
	public static void main(String[] arg)
	{
		Vecteur v1 = new Vecteur(10,15,20);
		v1.affiche();
		
		Vecteur v2 = new Vecteur(12,13,14);
		v2.affiche();
		
		Vecteur v3 = v1.sommeVecteur(v2);
		v3.affiche();
		
		Vecteur v4 = v1.produit1(20);
		v4.affiche();
		
		System.out.println("Le produit scalaire de v1 par v2 est égal à:"+v1.produit2(v2));
		
	
	}
	

}

















public static void main(String[] arg)
	{
		Vecteur v1 = new Vecteur(0,0,0);
		Vecteur v2 = new Vecteur(1,1,1);
		Vecteur v3 = new Vecteur (2,2,2);
		
		Vecteur v4 = new Vecteur(v3);
		v4.affiche();
		
		Vecteur v5= v3.mult(2);
		v5.affiche();
		
		System.out.println("produit scalaire entre v1 et v2");
		System.out.println(v1.scal(v2));
	}
}
		
