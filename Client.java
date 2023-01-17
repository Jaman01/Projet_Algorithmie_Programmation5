

public class Client {
	//attributs

		static int cpt = 0;
		private int id_Client;
		private String nom_Client; 
		private String prenom_Client;
		private String date_naissance_Client;
		private int telephone_Client;
		private String email_Client;

		

		//constructeur
		Client(int id_Client, String nom_Client, String prenom_Client, String date_naissance_Client, int telephone_Client, String email_Client){
			cpt++;
			this.id_Client = cpt;
			this.nom_Client = nom_Client;
			this.prenom_Client = prenom_Client;
			this.date_naissance_Client = date_naissance_Client;
			this.telephone_Client = telephone_Client;
			this.email_Client = email_Client;
		}
		
		Client(){
			
		}

		public int getId_Client() {
			return id_Client;
		}

		public void setId_Client(int id_Client) {
			this.id_Client = id_Client;
		}

		public String getNom_Client() {
			return nom_Client;
		}

		public void setNom_Client(String nom_Client) {
			this.nom_Client = nom_Client;
		}

		public String getPrenom_Client() {
			return prenom_Client;
		}

		public void setPrenom_Client(String prenom_Client) {
			this.prenom_Client = prenom_Client;
		}

		public String getDate_naissance_Client() {
			return date_naissance_Client;
		}

		public void setDate_naissance_Client(String date_naissance_Client) {
			this.date_naissance_Client = date_naissance_Client;
		}

		public int getTelephone_Client() {
			return telephone_Client;
		}

		public void setTelephone_Client(int telephone_Client) {
			this.telephone_Client = telephone_Client;
		}

		public String getEmail_Client() {
			return email_Client;
		}

		public void setEmail_Client(String email_Client) {
			this.email_Client = email_Client;
		}

		
		
		
	
		
		
		
		
		
		
		
		
		
}
