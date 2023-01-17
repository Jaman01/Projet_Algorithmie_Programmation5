
public class Garage extends Bien {

	private String description_Garage;
	

	
	
	//constructeurs
	
	Garage(int reference_Bien, double surface_totale_Bien, boolean en_location_Bien, String date_debut_location_Bien, double loyer_Bien, String description_Garage) {
		super(reference_Bien, surface_totale_Bien, en_location_Bien, date_debut_location_Bien, loyer_Bien);
		this.description_Garage = description_Garage;
	}

	//Getters et Setters

	public String getDescription_Garage() {
		return description_Garage;
	}

	public void setDescription_Garage(String description_Garage) {
		this.description_Garage = description_Garage;
	}
	




	
	

}
