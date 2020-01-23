import java.util.*;

class Bibliotheque
{
	protected String nom;
	protected LinkedList<Ouvrage> liste;
	
	public Bibliotheque(String nom)
	{
		this.nom = nom;
		liste = new LinkedList();
	}
	
	public void ajouter(Ouvrage o)
	{
		liste.addLast(o);
	}
	
	public void affiche()
	{
		System.out.println("Nom bibliothèque = "+ nom);
		for(int i=0; i<liste.size(); i++)
		{
			Ouvrage o = liste.get(i);
			o.affiche();
		}
		
	}
	
	public int rechercher(int _cote)
	{
		int valeur = -1;
		boolean trouve = false;
		
		for(int i=0; (trouve==false)&&(i<liste.size()); i++)
		{
			Ouvrage o = liste.get(i);
			if (o.getCote()==_cote)
			{
				valeur = i;
				trouve = true;
			}
		
		}
		return valeur;
	}
	
	public void supprimer(int _cote)
	{
		if(rechercher(_cote)!=-1)
			liste.remove(rechercher(_cote));
	}
}
