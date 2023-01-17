
public class Maison extends Bien{
	//attributs
	
	

	private int nombre_detages_Maison;
	private boolean jardin_Maison;	
	private String description_Maison;
	
	
	
	
	//constructeur
	Maison(int reference_Bien, double surface_totale_Bien, boolean en_location_Bien, String date_debut_location_Bien, double loyer_Bien,  int nombre_detages_Maison, boolean jardin_Maison, String description_Maison){
		super(reference_Bien, surface_totale_Bien, en_location_Bien, date_debut_location_Bien, loyer_Bien);
		this.nombre_detages_Maison = nombre_detages_Maison;
		this.jardin_Maison = jardin_Maison;
		this.description_Maison = description_Maison;
		
		}

	
	//Getters et Setters

	public int getNombre_detages_Maison() {
		return nombre_detages_Maison;
	}


	public void setNombre_detages_Maison(int nombre_detages_Maison) {
		this.nombre_detages_Maison = nombre_detages_Maison;
	}


	
	public boolean getJardin_Maison() {
		return jardin_Maison;
	}


	public void setJardin_Maison(boolean jardin_Maison) {
		this.jardin_Maison = jardin_Maison;
	}

	
	public String getDescription_Maison() {
		return description_Maison;
	}
	
	
	public void setDescription_Maison(String description_Maison) {
		this.description_Maison = description_Maison;
	}
	
	

	
	
	
	

	
	
}
