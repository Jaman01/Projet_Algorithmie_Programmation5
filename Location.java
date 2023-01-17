
public class Location {
	static int cpt = 0;
	private int ref_Location;
	private int id_Client_Location;
	private int id_Maison_Location;
	private String nomClient_Location;
	private String prenomClient_Location;


	
	
	Location(int ref_Location, int id_Client_Location, int id_Maison_Location, String nomClient_Location, String prenomClient_Location){
		cpt++;
		this.ref_Location = cpt;
		this.id_Client_Location = id_Client_Location;
		this.id_Maison_Location = id_Maison_Location;
		this.nomClient_Location = nomClient_Location;
		this.prenomClient_Location = prenomClient_Location;
	}
	
	
	Location(){
		
	}


	public int getRef_Location() {
		return ref_Location;
	}


	public void setRef_Location(int ref_Location) {
		this.ref_Location = ref_Location;
	}


	public int getId_Client_Location() {
		return id_Client_Location;
	}


	public void setId_Client_Location(int id_Client_Location) {
		this.id_Client_Location = id_Client_Location;
	}


	public int getId_Maison_Location() {
		return id_Maison_Location;
	}


	public void setId_Maison_Location(int id_Maison_Location) {
		this.id_Maison_Location = id_Maison_Location;
	}


	public String getNomClient_Location() {
		return nomClient_Location;
	}


	public void setNomClient_Location(String nomClient_Location) {
		this.nomClient_Location = nomClient_Location;
	}


	public String getPrenomClient_Location() {
		return prenomClient_Location;
	}


	public void setPrenomClient_Location(String prenomClient_Location) {
		this.prenomClient_Location = prenomClient_Location;
	}
	
	
	
	
	
	
	
	
	
}
	
	