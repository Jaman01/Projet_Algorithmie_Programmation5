
public class Appartement extends Bien {
	//attributs
	
	private boolean meuble_Appartement;
	private int nombre_chambres_Appartement;
	private int numero_etage_Appartement;
	private boolean balcon_Appartement;
	private String description_Appartement;
	
	
	
	
	
	//constructeur
	Appartement(int reference_Bien, double surface_totale_Bien, boolean en_location_Bien, String date_debut_location_Bien, double loyer_Bien, boolean meuble_Appartement, int nombre_chambres_Appartement, int numero_etage_Appartement,  boolean balcon_Appartement,  String description_Appartement){
		
		
		super(reference_Bien, surface_totale_Bien, en_location_Bien, date_debut_location_Bien, loyer_Bien);
		this.meuble_Appartement = meuble_Appartement;
		this.nombre_chambres_Appartement = nombre_chambres_Appartement;
		this.numero_etage_Appartement = numero_etage_Appartement;
		this.balcon_Appartement = balcon_Appartement;
		this.description_Appartement = description_Appartement;
	}




	public boolean getMeuble_Appartement() {
		return meuble_Appartement;
	}

	public void setMeuble_Appartement(boolean meuble_Appartement) {
		this.meuble_Appartement = meuble_Appartement;
	}

	
	public int getNombre_chambres_Appartement() {
		return nombre_chambres_Appartement;
	}

	public void setNombre_chambres_Appartement(int nombre_chambres_Appartement) {
		this.nombre_chambres_Appartement = nombre_chambres_Appartement;
	}

	public int getNumero_etage_Appartement() {
		return numero_etage_Appartement;
	}

	public void setNumero_etage_Appartement(int numero_etage_Appartement) {
		this.numero_etage_Appartement = numero_etage_Appartement;
	}
	
	public boolean getBalcon_Appartement() {
		return balcon_Appartement;
	}

	public void setBalcon_Appartement(boolean balcon_Appartement) {
		this.balcon_Appartement = balcon_Appartement;
	}

	public String getDescription_Appartement() {
		return description_Appartement;
	}

	public void setDescription_Appartement(String description_Appartement) {
		this.description_Appartement = description_Appartement;
	}
	

	
	

	
}
