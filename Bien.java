
public class Bien {
	//attributs
	static int cpt = 0;
	protected int reference_Bien;
	protected double surface_totale_Bien;
	protected boolean en_location_Bien;
	protected String date_debut_location_Bien;
	protected double loyer_Bien;
	
	
	//constructeur
	Bien(int reference_Bien, double surface_totale_Bien, boolean en_location_Bien, String date_debut_location_Bien, double loyer_Bien) {
		cpt++;
		this.reference_Bien = cpt;
		this.surface_totale_Bien = surface_totale_Bien;
		this.en_location_Bien = en_location_Bien;
		this.date_debut_location_Bien = date_debut_location_Bien;
		this.loyer_Bien = loyer_Bien;
	}

	


	//Getters et Setters
	public int getReference_Bien() {
		return reference_Bien;
	}


	public void setReference_Bien(int reference_Bien) {
		this.reference_Bien = reference_Bien;
	}


	
	public double getSurface_totale_Bien() {
		return surface_totale_Bien;
	}
	
	
	public void setSurface_totale_Bien(double surface_totale_Bien) {
		this.surface_totale_Bien = surface_totale_Bien;
	}
	
	public boolean getEn_location_Bien() {
		return en_location_Bien;
	}
	
	
	public void setEn_location_Bien(boolean en_location_Bien) {
		this.en_location_Bien = en_location_Bien;
	}
	
	public String getDate_debut_location_Bien() {
		return date_debut_location_Bien;
	}
	
	
	public void setDate_debut_location_Bien(String date_debut_location_Bien) {
		this.date_debut_location_Bien = date_debut_location_Bien;
	}
	
	public double getLoyer_Bien() {
		return loyer_Bien;
	}
	
	public void setLoyer_Bien(double loyer_Bien) {
		this.loyer_Bien = loyer_Bien;
	}










	
	
	

}
