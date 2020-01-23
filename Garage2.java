import java.util.*;

class Garage2
{
	private String nom;
	private LinkedList<Voiture> listeVoiture;
	
	public Garage2(String nom)
	{
		this.nom = nom;
		listeVoiture = new LinkedList();
	}
	
	public void ajouter(Voiture v)
	{
		listeVoiture.add(v);
	}
	
	public void affiche()
	{
		System.out.println("Nom garage ="+nom);
		for(int i=0; i<listeVoiture.size(); i++)
		{
			Voiture v = listeVoiture.get(i);
			v.affiche();
		}
	}
	
	public int rechercher(Voiture v1)
	{
		int indice = -1;
		boolean trouve = false;
		for(int i=0; (trouve==false)&&(i<listeVoiture.size()); i++)
		{
			Voiture v = listeVoiture.get(i);
			if ( (v1.getPrix()==v.getPrix()) && (v1.getAnnee()==v.getAnnee()) && ( (v1.getModel()).equals(v.getModel()) ) &&( (v1.getNomConstructeur()).equals(v.getNomConstructeur()) ) )
			{
				indice = i;
				trouve = true;
			}
		}
		
		return indice;
	}
	
	public void supprimer(Voiture v1)
	{
		if (this.rechercher(v1)!=-1)
		{
			listeVoiture.remove(this.rechercher(v1));
		}
	}
	
