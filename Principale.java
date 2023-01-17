import java.awt.Menu;
import java.util.*;

public class Principale {

	public static void main(String[] args) {
		

//********************************************************Collection Clients**********************************************************************************

		List<Client>liste_Clients = new ArrayList<Client>();

		
		
		liste_Clients.add(new Client(0, "Aman", "Jean-Jacques", "decembre", 0101, "univlyon2.fr"));
		liste_Clients.add(new Client(0, "Demaison", "Arthur", "novembre", 0102, "univlyon2.fr"));
		liste_Clients.add(new Client(0, "Banksy", "Mathieu", "janvier", 0104, "outlook.fr"));
		liste_Clients.add(new Client(0, "Simon", "Benoit", "fevrier", 0304, "outlook.fr"));


//********************************************************Listes des Biens**********************************************************************************
	
		
//********************************************************Collection Appartement**********************************************************************************
		
		List<Appartement>liste_Appartements = new ArrayList<Appartement>();

		
		liste_Appartements.add(new Appartement(0, 200, false, " ", 600, true, 2, 2, true, "voisinnage tres calme"));
		liste_Appartements.add(new Appartement(0, 500, false, " ", 800, true, 3, 6, true,   "excellent"));
		liste_Appartements.add(new Appartement(0, 150, false, " ", 450, false, 2, 2, false, "vraiment pas mal"));
		liste_Appartements.add(new Appartement(0, 800, false, " ", 550, true, 2, 1, false, "vous allez vous y plaire"));

		

//********************************************************Collection Maison**********************************************************************************
		
		
		List<Maison>liste_Maisons = new ArrayList<Maison>();

		liste_Maisons.add(new Maison(0, 700, false, " ", 1500, 2, true, "en plein centre-ville"));
		liste_Maisons.add(new Maison(0, 2000, false, " ", 3000, 2, true, "a la campagne"));
		liste_Maisons.add(new Maison(0, 200, false, " ", 700, 2, false, "bien situe"));

						

//********************************************************Collection Garage**********************************************************************************

		List<Garage>liste_Garages = new ArrayList<Garage>();
						
		liste_Garages.add(new Garage(0, 50, false, " ", 100, "endroit calme"));
		liste_Garages.add(new Garage(0, 70, false, " ", 150, "pas trop mal"));
		liste_Garages.add(new Garage(0, 100, false, " ", 400, "bien eclaire"));

		
		
//********************************************************Collection Location**********************************************************************************
		
		
		List<Location>liste_Locations = new ArrayList<Location>();
		
		
		liste_Locations.add(new Location(0, 4, 3, "Simon", "Benoit"));

		
	

		
		
//********************************************************Debut du programme**********************************************************************************
		
		
		

				Scanner sc = new Scanner(System.in);
				
				int choixMenu; 								//Le menu est compose des elements tels que "Ajouter un client", "Modifier un client", "supprimer un client", "Ajouter un Appartement"...etc.
				int choixSousMenu;							//Le sous-menu est compose des elements tels que "choisir les informations à modifier", "les clients a supprimer"...etc
				do {  //ouverture du premier do
					choixMenu = menu();
					switch (choixMenu) {
						
					
//********************************************************Debut de "Ajouter un client"**********************************************************************************

					
					case 1 : 														
							System.out.println("Ajouter un client");
							System.out.println("nom client");
							String nomAddClient = sc.nextLine();
							
							System.out.println("prenom client");
							String prenomAddClient = sc.nextLine();
							
							System.out.println("date client");
							String dateAddClient = sc.nextLine();
							
							System.out.println("tel client");
							int telAddClient = sc.nextInt();
							
							sc.nextLine();		
							System.out.println("mail client");
							String mailAddClient = sc.nextLine();
							
							liste_Clients.add(new Client(0, nomAddClient, prenomAddClient, dateAddClient, telAddClient, mailAddClient));
							
							for (int i = 0; i < liste_Clients.size(); i++) {
								System.out.println(liste_Clients.get(i).getId_Client());
							}
							
							System.out.println(liste_Clients.size());
							
							break;
							
//********************************************************Fin de "Ajouter un client"**********************************************************************************
							
							
//********************************************************Debut de "Modifier un client"**********************************************************************************
				
							
						case 2 :														
							Client id_Client = null;
							int id_Client_A_Verifier;					//variable qui sert a verifier si le client existe
							
							do {			//ouverture du do
								
								for (int i = 0; i < liste_Clients.size(); i++) {//premier for					affichage des clients
									System.out.println(liste_Clients.get(i).getId_Client() + " " + liste_Clients.get(i).getNom_Client()+ " "+liste_Clients.get(i).getPrenom_Client()+ " "+liste_Clients.get(i).getDate_naissance_Client()+" "+liste_Clients.get(i).getTelephone_Client()+" "+liste_Clients.get(i).getEmail_Client());	
								}//fermeture du premier for
								
								
								System.out.print("Quel est le nom du client ont vous souhaitez modifier les informations ? ");
								String nom = sc.nextLine();
								System.out.print("Quel est le prenom de ce client ? ");
								String prenom = sc.nextLine();
								
								for (int i = 0; i < liste_Clients.size(); i++) {		//ouverture de la deuxieme boucle for

								if(liste_Clients.get(i).getNom_Client().equalsIgnoreCase(nom) && liste_Clients.get(i).getPrenom_Client().equalsIgnoreCase(prenom)){			//pouverture du premier if		Ici, on verifie si les cleint existe (nom et prenom)
									 id_Client = liste_Clients.get(i);
									 id_Client_A_Verifier = id_Client.getId_Client();
									 
									 System.out.println("Tapez 1 pour modifier le nom\nTapez 2 pour modifier le prenom\nTapez 3 pour modifier la date de naissance\nTapez 4 pour modifier le numero de telephone\nTapez 5 pour modifier l'email\n");
									 choixSousMenu = sc.nextInt();
									 
									 sc.nextLine();
									 
									 switch(choixSousMenu) {						//Le client existe alors on demande a l'utilisateur quelles sont les informations qu'il souhaite modifier
									 case 1 :
										 System.out.println("Veuiller modifier le nom :");
										 String nomModif = sc.nextLine();
										 id_Client.setNom_Client(nomModif);
										 System.out.println("Information(s) modifiee(s) avec succes !");
										 System.out.println();
										 System.out.println(id_Client.getNom_Client() + " " + id_Client.getPrenom_Client() +  " " + id_Client.getDate_naissance_Client() + " " + id_Client.getTelephone_Client() + " " + id_Client.getEmail_Client());
										 
										 break;
										 
									 case 2 :
										 System.out.println("Veuiller modifier le prenom :");
										 String prenomModif = sc.nextLine();
										 id_Client.setPrenom_Client(prenomModif);
										 System.out.println("Information(s) modifiee(s) avec succes !");
										 System.out.println();
										 System.out.println(id_Client.getNom_Client() + " " + id_Client.getPrenom_Client() +  " " + id_Client.getDate_naissance_Client() + " " + id_Client.getTelephone_Client() + " " + id_Client.getEmail_Client());
										 
										 break;
										 
									 case 3 :
										 System.out.println("Veuiller modifier la date de naissance :");
										 String dateModif = sc.nextLine();
										 id_Client.setDate_naissance_Client(dateModif);
										 System.out.println("Information(s) modifiee(s) avec succes !");
										 System.out.println();
										 System.out.println(id_Client.getNom_Client() + " " + id_Client.getPrenom_Client() +  " " + id_Client.getDate_naissance_Client() + " " + id_Client.getTelephone_Client() + " " + id_Client.getEmail_Client());
										 
										 break;
										 
									 case 4 :
										 System.out.println("Veuiller modifier le numero de telephone :");
										 int telModif = sc.nextInt();
										 sc.nextLine();
										 id_Client.setTelephone_Client(telModif);
										 System.out.println("Information(s) modifiee(s) avec succes !");
										 System.out.println();
										 System.out.println(id_Client.getNom_Client() + " " + id_Client.getPrenom_Client() +  " " + id_Client.getDate_naissance_Client() + " " + id_Client.getTelephone_Client() + " " + id_Client.getEmail_Client());
										 
										 break;
										 
									 case 5 :
										 System.out.println("Veuiller modifier l'email :");
										 String mailModif = sc.nextLine();
										 id_Client.setEmail_Client(mailModif);
										 System.out.println("Information(s) modifiee(s) avec succes !");
										 System.out.println();
										 System.out.println(id_Client.getNom_Client() + " " + id_Client.getPrenom_Client() +  " " + id_Client.getDate_naissance_Client() + " " + id_Client.getTelephone_Client() + " " + id_Client.getEmail_Client());
										 
										 break;
										 
										 default : 
											 System.out.println("Je n'ai pas compris ! Veuillez réessayer svp !");	
									 }	//fermeture du switch					 

									}	//fermeture du premier if			
							}		//fermeture de la deuxieme boucle for
							}		//fermeture du do
								while (id_Client == null);						//tant que le le client n'est pas reconnu par le programme
							
							break;
			
//********************************************************Fin de "Modifier un client"**********************************************************************************
						
					
//********************************************************Debut de "Supprimer un client"**********************************************************************************
						
							
						case 3 :

									
							id_Client = null;
							id_Client_A_Verifier = 0;			//variable de verification de l'existence du client
							choixSousMenu = 0;
							do {				//ouverture du do
								
								for (int i = 0; i < liste_Clients.size(); i++) {//premier for		affichage des clients
									System.out.println(liste_Clients.get(i).getId_Client() + " " + liste_Clients.get(i).getNom_Client()+ " "+liste_Clients.get(i).getPrenom_Client());	
								}//fermeture du premier for
								
								
								
								System.out.print("Quel est le nom du client que vous souhaitez supprimer ? ");
								String nom = sc.nextLine();
								System.out.print("Quel est le prenom du client ? ");
								String prenom = sc.nextLine();
											
								for (int i = 0; i < liste_Clients.size(); i++) {					//ouverture de la boucle for

								if(liste_Clients.get(i).getNom_Client().equalsIgnoreCase(nom) && liste_Clients.get(i).getPrenom_Client().equalsIgnoreCase(prenom)){			//premier if       on verifie que le client existe bien (Nom, prenom)
									 id_Client = liste_Clients.get(i);
									 id_Client_A_Verifier = id_Client.getId_Client();
												 
							   		System.out.println("Etes-vous sur de vouloir supprimer le client suivant ? :\n " +  id_Client_A_Verifier + "\t" + id_Client.getNom_Client() + "\t" + id_Client.getPrenom_Client() );
							   		System.out.println();
							   		System.out.println("Taper 1 pour supprimer\tTaper 2 pour annuler");
							   		choixSousMenu = sc.nextInt();
												
									sc.nextLine();
												
									if(choixSousMenu == 1) {				//deuxieme if
										System.out.println("Le client " +id_Client.getNom_Client() + " " + id_Client.getPrenom_Client() + " a bien ete supprime" );
										liste_Clients.remove(id_Client_A_Verifier);
										System.out.println(liste_Clients.size()); 
									} else {
										System.out.println("Opération annulée");
									}			//fermeture du deuxieme if
												
									}		//fermeture du premier if
												
									}		//fermeture de la boucle for
							}	//fermeture du do									
								while (id_Client == null);
				
							break;

							
//********************************************************Fin de "Supprimer un client"**********************************************************************************
					
						


							
							
							
		
//********************************************************Debut de "Ajouter un Bien"**********************************************************************************

						
						case 4:
							System.out.println("Quel type de bien souhaitez-vous ajouter ?");
							
							do {			//Ouverture du do								Ici on oblige l'utilisateur a chsoisir le type de bien à ajouter : Appartement, Maison ou Garage
							
								System.out.println("Taper 1 pour Appartement\tTaper 2 pour Maison\tTaper 3 pour Garage");
							
								choixSousMenu = sc.nextInt();
							
//********************************************************Ajout d'un Appartement"**********************************************************************************

								if (choixSousMenu == 1) { //ouverture du premier if
													
									System.out.println("Quelle est la surface de l'appartement ? ");
									double surfaceAppart = sc.nextDouble();
									
									System.out.println("L'appartement est-il en location ?\t Repondre par true or false");
									boolean enLocationAppart = sc.nextBoolean();
									
									
									System.out.println("Quelle est la date de location ?\texemple janv, fev...");
									String dateLocationAppart = sc.nextLine();
									sc.nextLine();
									
									System.out.println("Indiquer le loyer de L'appartement ?");
									double loyerAppart = sc.nextDouble();
									
									
									System.out.println("L'appartement est-il meublé ?\t Repondre par true or false");
									boolean meubleAppart = sc.nextBoolean();
									
									System.out.println("Combien de chambre(s) possede l'appartement ? ");
									int nbrChambreAppart = sc.nextInt();
									sc.nextLine();

									System.out.println("Quel est le numero d'étage de l'appartement ? ");
									int numEtageAppart = sc.nextInt();
									sc.nextLine();
									
									System.out.println("L'appartement possede-t-il un balcon ?\t Repondre par true or false");
									boolean balconAppart = sc.nextBoolean();

									System.out.println("Donnez une petite description de L'appartement ?");
									String descriptionAppart = sc.nextLine();
									sc.nextLine();
									
									
									liste_Appartements.add(new Appartement(0, surfaceAppart,  enLocationAppart, dateLocationAppart, loyerAppart, meubleAppart, nbrChambreAppart, numEtageAppart, balconAppart, descriptionAppart ));
														
									System.out.println("taille = " + liste_Appartements.size());
								
								
								
								}  //fermeture du premier if
							
							
//********************************************************Ajout d'une Maison"**********************************************************************************

								if(choixSousMenu == 2) { //ouverture du deuxieme if

							
									System.out.println("Quelle est la surface de la maison ? ");
									double surfaceMaison = sc.nextDouble();
									
									System.out.print("La maison est-elle en location ?\t Repondre par true or false");
									boolean enlocationMaison = sc.nextBoolean();
									
									System.out.println("Quelle est la date de debut de location\texemple : janv, fev...");
									String dateDebutLocationMaison = sc.nextLine();
									sc.nextLine();
									
									System.out.print("Indiquer le loyers de la maison ?");
									double loyerMaison = sc.nextDouble();
									
									
									System.out.println("Combien d'étage(s) possède la maison ? ");
									int nbrEtageMaison = sc.nextInt();
									sc.nextLine();

									System.out.print("La maison possède-t-elle un jardin ?\t Repondre par true or false");
									boolean jardinMaison = sc.nextBoolean();
									
									System.out.println("Donnez une description de la Maison?");
									String descriptionMaison = sc.nextLine();
									sc.nextLine();
									
									sc.nextLine();
									
									liste_Maisons.add(new Maison(0, surfaceMaison, enlocationMaison, dateDebutLocationMaison, loyerMaison, nbrEtageMaison, jardinMaison, descriptionMaison ));
									
									
									System.out.println("taille = " + liste_Maisons.size());

									
									
								
								} //fermeture du deuxieme if

								
//********************************************************Ajout d'un Garage"**********************************************************************************

								if (choixSousMenu == 3){	//ouverture du troisieme if
									
									
									
							
									
									System.out.println("Quelle est la surface du garage ?");
									double surfaceGarage = sc.nextDouble();
									

									System.out.print("Le garage est-il en location ?\t Repondre par true or false");
									boolean enlocationGarage = sc.nextBoolean();
									
									System.out.println("Quelle est la date de debut de location\nexemple janv, fev...");
									String dateDebutLocationGarage = sc.nextLine();
									sc.nextLine();
									
									System.out.println("Donnez une description du garage");
									String descriptionGarage = sc.nextLine();
									
									sc.nextLine();

									System.out.print("Quel est le loyer du garage ?");
									int loyerGarage = sc.nextInt();
									
									sc.nextLine();
									
									
									liste_Garages.add(new Garage(0, surfaceGarage, enlocationGarage, dateDebutLocationGarage, loyerGarage, descriptionGarage));
									
									System.out.println("taille = " + liste_Garages.size());

								}	//fermeture du troisieme if
			
							
							} while((choixSousMenu!=1) || (choixSousMenu!=2) || (choixSousMenu!=3));		//fermeture du do 			qui incite l'utilisateur a choisir le type de bien a Ajouter
							
							
							
						break;
						
//********************************************************Fin de "Ajouter un Bien"**********************************************************************************
			
						
						
						
						
						
						
						
						
						
//********************************************************Debut de "Modifier un Bien"**********************************************************************************

						
						case 5:
							System.out.println("Quel type de bien souhaitez-vous ajouter ?");
							
							do {			//Ouverture du do								Ici on oblige l'utilisateur a chsoisir le type de bien à ajouter : Appartement, Maison ou Garage
							
								System.out.println("Taper 1 pour Appartement\tTaper 2 pour Maison\tTaper 3 pour Garage");
							
								choixSousMenu = sc.nextInt();
		
								
//********************************************************Modification d'un Appartement"**********************************************************************************

								if (choixSousMenu == 1) {    //debut du premier if						Appartement
									
									
							
									Appartement id_Appartement = null;
									int id_Appartement_A_Verifier =0;			//variable qui  verifie si l'appartement existe
									
									
									choixSousMenu = 0;

									do {		//ouverture du do
										System.out.print("Quel est l'ID de l'appartement dont vous souhaitez modifier les informations ? ");
										
										for (int i = 0; i < liste_Appartements.size(); i++) {//premier for
											System.out.println(liste_Appartements.get(i).getReference_Bien() + " " + liste_Appartements.get(i).getSurface_totale_Bien()+ " "+liste_Appartements.get(i).getEn_location_Bien()+ " "+liste_Appartements.get(i).getDescription_Appartement());	
										}//fermeture du premier for
										
										
										id_Appartement_A_Verifier = sc.nextInt();
										

										sc.nextLine();
										
										for (int i = 0; i < liste_Appartements.size(); i++) { //premiere boucle for
											

										if(liste_Appartements.get(i).getReference_Bien() == id_Appartement_A_Verifier){   //ouverture du if
											id_Appartement = liste_Appartements.get(i);
											 id_Appartement_A_Verifier = id_Appartement.getReference_Bien();
											 
											 System.out.println("1 surface de l'appartement\n2 Surface de l'appartement\n3 Le'appartement est-il en location ?\4 date de debut de location\n5 Montant du loyer de l'appartement\n6 L'appartement est-il meuble ?\n7 nombre de chambre de l'appartement\n8 numero d'etage de l'appartement\n9 balcon de l'appartement\n10 Description de l'appartement\n 7 ");

											 
											 choixSousMenu = sc.nextInt();
								

											 
											 
											 sc.nextLine();
											 
											 switch(choixSousMenu) {		//Ouverture du Switch			l'appartement existe alors on demande a l'utilisateur de choisir les informations qu'il souhaiterait modifier
											 
											 case 1 :
												 System.out.println("Quelle est la nouvelle surfarce de l'appartement ? ");
												 double surfaceBienModif = sc.nextDouble();
												 id_Appartement.setSurface_totale_Bien(surfaceBienModif); 
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("L'appartement " + id_Appartement.getReference_Bien() + " possede une surface de " + id_Appartement.getReference_Bien());
												 
												 
												 break;
									
													
											 case 2 :
												 System.out.println("L'appartement est-il meuble  ? ");
												 boolean meubleAppartModif = sc.nextBoolean();
												 id_Appartement.setMeuble_Appartement(meubleAppartModif);;
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("Il est " + id_Appartement.getMeuble_Appartement() + " que l'appartement est meuble.");
												 
												 break;
												 
											 case 3 :
												 System.out.println("Quel est le nouveau nombre de chambre de l'appartement ? ");
												 int nbrChambreAppartModif = sc.nextInt();
												 id_Appartement.setNombre_chambres_Appartement(nbrChambreAppartModif);;
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("L'appartement " + id_Appartement.getReference_Bien() + " possede " + id_Appartement.getNombre_chambres_Appartement());
												 
												 
												 break;
												 
								
											 case 4 :
												 System.out.println("Quel est le nouveau numero d'etage de l'appartement ? ");
												 int numEtageApartModif = sc.nextInt();
												 sc.nextLine();							 
												 id_Appartement.setNumero_etage_Appartement(numEtageApartModif);
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("Le numero d'etage de l'appartement " + id_Appartement.getReference_Bien() + " est : " + id_Appartement.getNumero_etage_Appartement());

												 break;
												 
								 
											 case 5 :
												 System.out.println("il y a-t-il un balcon dans l'appartement ? ");
												 boolean balconAppartModif = sc.nextBoolean();
												 id_Appartement.setBalcon_Appartement(balconAppartModif);
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("Il est " + id_Appartement.getBalcon_Appartement() + " que l'appartement " + id_Appartement.getReference_Bien() + " possede un balcon.");
												 
												 
												 break;
												 
											 case 6 :
												 System.out.println("Quelle est la nouvelle description de l'appartement ?");
												 String descriptionAppartModif = sc.nextLine();
												 id_Appartement.setDescription_Appartement(descriptionAppartModif);
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("La description de l'appartement " + id_Appartement.getReference_Bien() + " est la suivante : " + id_Appartement.getDescription_Appartement());
												 
												 break;
												 
											
												 
											 case 7 :
												 System.out.println("Quelle est le nouveau loyer de l'appartement ?");
												 double loyerAppartModif = sc.nextDouble();
																			 
												 id_Appartement.setLoyer_Bien(loyerAppartModif);
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("Le loyer de l'appartement " + id_Appartement.getReference_Bien() + " est : " + id_Appartement.getLoyer_Bien());

												 break;

												 
												 default : 
													 System.out.println("Je n'ai pas compris ! Veuillez réessayer svp !");	
													 
											 }	// Fermeture du Switch	
											 
											 
									    } // Fermerture du  if
										
									}		//fermeture de la premiere boucle for
										
									} while (id_Appartement == null);  // Pour fermer le do

									
									
								
								}		//fin du premier if
							
							
								
								
//********************************************************Modification d'une Maison"**********************************************************************************

								if(choixSousMenu == 2) { //debut du deuxieme If
									
						
									
									
									Maison id_Maison = null;
									int id_Maison_A_Verifier =0;
									
									
									choixSousMenu = 0;

									do {
										System.out.print("Quel est l'ID de la maison dont vous souhaitez modifier les informations ? ");
										
										for (int i = 0; i < liste_Maisons.size(); i++) {//premier for
											System.out.println(liste_Maisons.get(i).getReference_Bien() + " " + liste_Maisons.get(i).getSurface_totale_Bien()+ " "+liste_Maisons.get(i).getEn_location_Bien()+ " "+liste_Maisons.get(i).getDescription_Maison());	
										}//fermeture du premier for
										
										
										
										id_Maison_A_Verifier = sc.nextInt();
										

										sc.nextLine();
										
										for (int i = 0; i < liste_Maisons.size(); i++) {

										if(liste_Maisons.get(i).getReference_Bien() == id_Maison_A_Verifier){
											 id_Maison = liste_Maisons.get(i);
											 id_Maison_A_Verifier = id_Maison.getReference_Bien();
											 
											 System.out.println("1 surface de la Maison\n2 nombre d'etage de la Maison\n3 jardin de la Maison\n4 description de la Maison\n5 loyer de la Maison");
											 choixSousMenu = sc.nextInt();
								
										
											 
											 sc.nextLine();
											 
											 switch(choixSousMenu) {
											 
											 case 1 :
												 System.out.println("Quelle est la nouvelle surfarce de la maison ? ");
												 double surfaceMaisonModif = sc.nextDouble();
												 id_Maison.setSurface_totale_Bien(surfaceMaisonModif); 
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("La maison " + id_Maison.getReference_Bien() + " possede une surface de " + id_Maison.getSurface_totale_Bien());
												 
												 
												 break;
												 
												 
												 
											 case 2 :
												 System.out.println("Quel est le nouveau nombre d'etage(s) de la Maison ? ");
												 int nbrEtageModif = sc.nextInt();
												 sc.nextLine();							 
												 id_Maison.setNombre_detages_Maison(nbrEtageModif);
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("La maison " + id_Maison.getReference_Bien() + " possede un nombre d'etage(s) de " + id_Maison.getSurface_totale_Bien());

												 break;
												 
												 
												 
											 case 3 :
												 System.out.println("il y a-t-il un jardin dans la Maison ? ");
												 boolean jardinMaisonModif = sc.nextBoolean();
												 id_Maison.setJardin_Maison(jardinMaisonModif);;
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("Il est " + id_Maison.getJardin_Maison() + " que la Maison possede un jardin.");
												 
												 
												 break;
												 
												 
											 case 4 :
												 System.out.println("Quelle est la nouvelle description de la Maison ?");
												 String descriptionMaisonModif = sc.nextLine();
												 id_Maison.setDescription_Maison(descriptionMaisonModif);
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("La description de la maison " + id_Maison.getReference_Bien() + " est la suivante : " + id_Maison.getDescription_Maison());
												 
												 break;
												 
											
												 
											 case 5 :
												 System.out.println("Quelle est le nouveau loyer de la Maison ?");
												 double loyerMaisonModif = sc.nextDouble();
																			 
												 id_Maison.setLoyer_Bien(loyerMaisonModif);
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("Le loyer de la maison " + id_Maison.getReference_Bien() + " est de : " + id_Maison.getLoyer_Bien());

												 break;

												 
												 default : 
													 System.out.println("Je n'ai pas compris ! Veuillez réessayer svp !");	
													 
											 }	// fermeture du Switch					 
									    } // Fermer if
										
									}} while (id_Maison == null);  // Pour fermer le do
									
									

									
								
								} //fermeture du deuxieme if

							
								
								
//********************************************************Modification d'un Garage"**********************************************************************************

								if (choixSousMenu == 3){ //debut du troisieme if
									
									
									
									Garage id_Garage = null;
									int id_Garage_A_Verifier =0;
									
									
									choixSousMenu = 0;

									do {
										System.out.print("Quel est l'ID du garage dont vous souhaitez modifier les informations ? ");
										
										for (int i = 0; i < liste_Garages.size(); i++) {//premier for
											System.out.println(liste_Garages.get(i).getReference_Bien() + " " + liste_Garages.get(i).getSurface_totale_Bien()+ " "+liste_Garages.get(i).getEn_location_Bien()+ " "+liste_Garages.get(i).getDescription_Garage());	
										}//fermeture du premier for
										
										
										id_Garage_A_Verifier = sc.nextInt();
										

										sc.nextLine();
										
										for (int i = 0; i < liste_Garages.size(); i++) {

										if(liste_Garages.get(i).getReference_Bien() == id_Garage_A_Verifier){
											 id_Garage = liste_Garages.get(i);
											 id_Garage_A_Verifier = id_Garage.getReference_Bien();
											 
											 System.out.println("1 surface du garage\n2 description du garage\n3 loyer du garage");
											 choixSousMenu = sc.nextInt();
								
											 
											 
											 sc.nextLine();
											 
											 switch(choixSousMenu) {
											 
											 case 1 :
												 System.out.println("Quelle est la nouvelle surfarce du garage ? ");
												 double surfaceGarageModif = sc.nextDouble();
												 id_Garage.setSurface_totale_Bien(surfaceGarageModif); 
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("Le garage " + id_Garage.getReference_Bien() + " possede une surface de " + id_Garage.getSurface_totale_Bien());
												 
												 
												 break;
											 
											 
											 case 2 :
												 System.out.println("Quelle est la nouvelle description de la Maison ?");
												 String descriptionGarageModif = sc.nextLine();
												 id_Garage.setDescription_Garage(descriptionGarageModif);
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("La description de la maison " + id_Garage.getReference_Bien() + " est la suivante : " + id_Garage.getDescription_Garage());
												 
												 break;
												 
												
											 case 3 :
												 System.out.println("Quelle est le nouveau loyer du garage ?");
												 double loyerGarageModif = sc.nextDouble();
																			 
												 id_Garage.setLoyer_Bien(loyerGarageModif);
												 System.out.println("Information(s) modifiee(s) avec succes !");
												 System.out.println();
												 System.out.println("Le loyer du garage " + id_Garage.getReference_Bien() + " est de : " + id_Garage.getLoyer_Bien());

												 break;

												 
												 default : 
													 System.out.println("Je n'ai pas compris ! Veuillez réessayer svp !");	
													 
											 }	// fermeture du Switch					 
									    } // Fermerture du  if
										
									}
										
									} while (id_Garage == null);  // Pour fermer le do

	
									
							
								}  //fermeture du troisieme If
							
							
							
							
							} while((choixSousMenu!=1) || (choixSousMenu!=2) || (choixSousMenu!=3));		//fermeture du do
							
							
							
						break;
						
//********************************************************Fin de "Modifier un Bien"**********************************************************************************
	
						
						
						
						
						
						
						
						
						
						
//********************************************************Debut de "Supprimer un Bien"**********************************************************************************

						
						case 6:
							System.out.println("Quel type de bien souhaitez-vous ajouter ?");
							
							do {			//Ouverture du premier do								Ici on oblige l'utilisateur a chsoisir le type de bien à ajouter : Appartement, Maison ou Garage
							
								System.out.println("Taper 1 pour Appartement\tTaper 2 pour Maison\tTaper 3 pour Garage");
							
								choixSousMenu = sc.nextInt();
							
//********************************************************Suppression d'un Appartement"**********************************************************************************

								if (choixSousMenu == 1) {  //ouverture premier if
									
									
									
									Appartement id_Appart = null;
									int id_Appart_A_Supprimer;
									choixSousMenu = 0;
									do {		//ouverture deuxieme do
										System.out.print("Quel est l'ID de l'appartement que vous souhaitez supprimer ? ");
										
										for (int i = 0; i < liste_Appartements.size(); i++) {//premier for
											System.out.println(liste_Appartements.get(i).getReference_Bien() + " " + liste_Appartements.get(i).getSurface_totale_Bien()+ " "+liste_Appartements.get(i).getEn_location_Bien()+ " "+liste_Appartements.get(i).getDescription_Appartement());	
										}//fermeture du premier for
										
										
										id_Appart_A_Supprimer = sc.nextInt();
										
										sc.nextLine();
										
										for (int i = 0; i < liste_Appartements.size(); i++) {  //deuxieme for

											if(liste_Appartements.get(i).getReference_Bien() == id_Appart_A_Supprimer){  //ouverture deucieme if
											 id_Appart = liste_Appartements.get(i);
											 id_Appart_A_Supprimer = id_Appart.getReference_Bien();
											 
											System.out.println("Etes-vous sur de vouloir supprimer l-appartement suivant ? :\n " +  id_Appart_A_Supprimer + "\t" + id_Appart.getDescription_Appartement() + "\t");
											System.out.println();
											System.out.println("Taper 1 pour supprimer\tTaper 2 pour annuler");
											choixSousMenu = sc.nextInt();
											
											sc.nextLine();
											
											if(choixSousMenu == 1) {	//ouverture troisieme if
												System.out.println("L'appartement " +id_Appart_A_Supprimer + " a bien ete supprime" );
												liste_Appartements.remove(id_Appart_A_Supprimer);
												System.out.println(liste_Appartements.size()); 
											} else {
												System.out.println("Opération annulée");
											} //fermeture troisieme if
											
											} //fermeture deuxieme if
											
									} //fermeture deuxieme for
									}		//fermeture deuxieme do
										while (id_Appart == null);

									System.out.println("Taille = " + liste_Appartements.size());
								
								
								}
							
								
								
							
//********************************************************Suppression d'une Maison"**********************************************************************************

								if(choixSousMenu == 2) {
									
									
									 Maison id_Maison = null;
									 int id_Maison_A_Supprimer =  0;
									choixSousMenu = 0;
									do {
										System.out.print("Quel est l'ID de la maison que vous souhaitez supprimer ? ");
										
										for (int i = 0; i < liste_Maisons.size(); i++) {//premier for
											System.out.println(liste_Maisons.get(i).getReference_Bien() + " " + liste_Maisons.get(i).getSurface_totale_Bien()+ " "+liste_Maisons.get(i).getEn_location_Bien()+ " "+liste_Maisons.get(i).getDescription_Maison());	
										}//fermeture du premier for
										
										
										
										id_Maison_A_Supprimer = sc.nextInt();
												
										sc.nextLine();
												
										for (int i = 0; i < liste_Maisons.size(); i++) {

											if(liste_Maisons.get(i).getReference_Bien() == id_Maison_A_Supprimer){
												id_Maison = liste_Maisons.get(i);
												id_Maison_A_Supprimer = id_Maison.getReference_Bien();
													 
											System.out.println("Etes-vous sur de vouloir supprimer la maison suivante ? :\n " +  id_Maison_A_Supprimer + "\t" + id_Maison.getDescription_Maison() + "\t");
											System.out.println();
											System.out.println("Taper 1 pour supprimer\tTaper 2 pour annuler");
											choixSousMenu = sc.nextInt();
													
											sc.nextLine();
													
											if(choixSousMenu == 1) {
													System.out.println("La maison " +id_Maison_A_Supprimer + " a bien ete supprimee" );
													liste_Maisons.remove(id_Maison_A_Supprimer);
													System.out.println(liste_Maisons.size()); 
												} else {
														System.out.println("Opération annulée");
												}
													
												}
													
											}
											}
												while (id_Maison == null);
									
											System.out.println("Taille = " + liste_Maisons.size());

					
								
								}

								
//********************************************************Suppression d'un Garage"**********************************************************************************

								if (choixSousMenu == 3){
									
									
									
									System.out.println("Supprimer un garage");
									
									Garage id_Garage = null;
									int id_Garage_A_Supprimer;
									choixSousMenu = 0;
									do {
										System.out.print("Quel est l'ID du garage que vous souhaitez supprimer ? ");
										
										System.out.println("Voici la liste des garages enregistres : ");
										
										for (int i = 0; i < liste_Garages.size(); i++) {//premier for
											System.out.println(liste_Garages.get(i).getReference_Bien() + " " + liste_Garages.get(i).getSurface_totale_Bien()+ " "+liste_Garages.get(i).getEn_location_Bien()+ " "+liste_Garages.get(i).getDescription_Garage());	
										}//fermeture du premier for
										

										
										id_Garage_A_Supprimer = sc.nextInt();
										
										sc.nextLine();
										
										for (int i = 0; i < liste_Garages.size(); i++) {

											if(liste_Garages.get(i).getReference_Bien() == id_Garage_A_Supprimer){
											 id_Garage = liste_Garages.get(i);
											 id_Garage_A_Supprimer = id_Garage.getReference_Bien();
											 
											System.out.println("Etes-vous sur de vouloir supprimer l-appartement suivant ? :\n " +  id_Garage_A_Supprimer + "\t" + id_Garage.getDescription_Garage() + "\t");
											System.out.println();
											System.out.println("Taper 1 pour supprimer\tTaper 2 pour annuler");
											choixSousMenu = sc.nextInt();
											
											sc.nextLine();
											
											if(choixSousMenu == 1) {
												System.out.println("Le garage " +id_Garage_A_Supprimer + " a bien ete supprime" );
												liste_Garages.remove(id_Garage_A_Supprimer);
												System.out.println(liste_Garages.size()); 
											} else {
												System.out.println("Opération annulée");
											}
											
											}
											
									}
									}
										while (id_Garage == null);
							
									System.out.println("Taille = " + liste_Garages.size());

									
									
									
									
									
									
									
							
								}
							
							
							
							
							} while((choixSousMenu!=1) || (choixSousMenu!=2) || (choixSousMenu!=3));		//fermeture du premier do
							
							
							
						break;
						
//********************************************************Fin de "Supprimer un Bien"**********************************************************************************
	
							
		
						
						
						
//********************************************************Début de "Ajouter une Location"**********************************************************************************

						
						case 7:
						
							
						id_Client = null;
						id_Client_A_Verifier = 0;
						
						Appartement id_Appartement = null;
						int id_Appartement_A_Verifier =0;
						
						do {//premier do
							System.out.print("Quel est le nom du client ? ");
							String nom = sc.nextLine();
							System.out.print("Quel est le prenom du client ? ");
							String prenom = sc.nextLine();
							
							for (int i = 0; i < liste_Clients.size(); i++) {//premier for

							if(liste_Clients.get(i).getNom_Client().equalsIgnoreCase(nom) && liste_Clients.get(i).getPrenom_Client().equalsIgnoreCase(prenom)){//premier if
								 id_Client = liste_Clients.get(i);
								 id_Client_A_Verifier = id_Client.getId_Client();
								 
								 
								
								 do {//deuxieme do
										System.out.print("Quel est l'ID de l'appartement que vous souhaitez mettre en location ? ");
										id_Appartement_A_Verifier = sc.nextInt();
										

										sc.nextLine();
										
										for (int j = 0; j < liste_Appartements.size(); j++) {//deuxieme for

										if(liste_Appartements.get(j).getReference_Bien() == id_Appartement_A_Verifier){//deuxieme if
											id_Appartement = liste_Appartements.get(j);
											 id_Appartement_A_Verifier = id_Appartement.getReference_Bien();
											 
											 id_Appartement.setEn_location_Bien(true);
								
								
											 System.out.println("Le client " +id_Client.getNom_Client() + " " + id_Client.getPrenom_Client() + " a loue l'appartement " + id_Appartement.getReference_Bien() + " dont la description est " + id_Appartement.getDescription_Appartement());
												
											 liste_Locations.add(new Location(0, id_Client_A_Verifier, id_Appartement_A_Verifier, id_Client.getNom_Client(), id_Client.getPrenom_Client()));
												
												System.out.println(liste_Locations.size()); 
											 
												
									
												
												
										}//fermeture du deuxieme if
										
										}//fermeture du deuxieme for
							
								 }//fermeture du deuxieme do	
								while (id_Appartement == null);
							
							}//fermeture du premier if				 
							}//fermeture du premier for
											 
						} //fermeture du premier do
							while (id_Client == null) ;
						
						
						
						
						break;

						
						
				
						

							
//********************************************************Fin de "Ajouter une Location""**********************************************************************************
							
							

						
						
						
						
						
						
						
//********************************************************Début de "Faire une recherche pour trouver un bien par rapport à sa surface totale""**********************************************************************************
						
						
						case 8:
						
							System.out.println("Quel type de bien souhaitez-vous rechercher ?");
							
							do {			//Ouverture du do								Ici on oblige l'utilisateur a chsoisir le type de bien à rechercher / surface : Appartement, Maison ou Garage
							
								System.out.println("Taper 1 pour Appartement\tTaper 2 pour Maison\tTaper 3 pour Garage");
							
								choixSousMenu = sc.nextInt();
								
								
//********************************************************Recherche par rapport a la surface pour un Appartement"**********************************************************************************

								if (choixSousMenu == 1) {    //debut du premier if						Appartement

							
									
									
									
									Appartement AppartementSurface = null;
								
									System.out.println("Surface minimum : ");
									double surfacemin = sc.nextDouble();
									System.out.println("Surface maximum : ");
									double surfacemax = sc.nextDouble();
									
									for (int i = 0; i < liste_Appartements.size(); i++) { //ouverture du deuxieme if
										
										if((liste_Appartements.get(i).getSurface_totale_Bien() >= surfacemin) && (liste_Appartements.get(i).getSurface_totale_Bien() <= surfacemax )){   //ouverture du troisieme if
											
											AppartementSurface = liste_Appartements.get(i);
											
											System.out.println("Nous avons trouve le(s) bien(s) : " +AppartementSurface.getReference_Bien()); 
											
											
					
									}//fermeture du troisieme if 
										else { System.out.println("Malheureusement, il n'existe pas d'appartement correspondant aux criteres de recherche"); //affiche quand meme cette phrase quand la surface est trouve
											}
										
										} //fermeture du deuxieme if
									} //fermeture du premier if
								
								
		
								
//********************************************************Recherche par rapport a la surface pour une Maison"**********************************************************************************

								
								if (choixSousMenu == 2) {    //debut du deuxieme if						Maison

									Maison MaisonSurface = null;
									
									System.out.println("Surface minimum : ");
									double surfacemin = sc.nextDouble();
									System.out.println("Surface maximum : ");
									double surfacemax = sc.nextDouble();
									
									for (int i = 0; i < liste_Maisons.size(); i++) { 
										
										if((liste_Maisons.get(i).getSurface_totale_Bien() >= surfacemin) && (liste_Maisons.get(i).getSurface_totale_Bien() <= surfacemax )){   //ouverture du troisieme if
											
											MaisonSurface = liste_Maisons.get(i);
											
											System.out.println("Nous avons trouve le(s) bien(s) : " +MaisonSurface.getReference_Bien()); 
											
											
					
									} 
										else { System.out.println("Malheureusement, il n'existe pas d'appartement correspondant aux criteres de recherche"); //affiche quand meme cette phrase quand la surface est trouve
											}
										
										} 
									
									
									
								} //fin du deuxieme if
								
								
//********************************************************Recherche par rapport a la surface pour un Garage"**********************************************************************************

								
								
								if (choixSousMenu == 3) {    //debut du troisieme if						Garage

									
									Garage GarageSurface = null;
									
									System.out.println("Surface minimum : ");
									double surfacemin = sc.nextDouble();
									System.out.println("Surface maximum : ");
									double surfacemax = sc.nextDouble();
									
									for (int i = 0; i < liste_Garages.size(); i++) { 
										
										if((liste_Garages.get(i).getSurface_totale_Bien() >= surfacemin) && (liste_Garages.get(i).getSurface_totale_Bien() <= surfacemax )){   //ouverture du troisieme if
											
											GarageSurface = liste_Garages.get(i);
											
											System.out.println("Nous avons trouve le(s) bien(s) : " +GarageSurface.getReference_Bien()); 
											
											
					
									} 
										else { System.out.println("Malheureusement, il n'existe pas d'appartement correspondant aux criteres de recherche"); //affiche quand meme cette phrase quand la surface est trouve
											}
										
										} 
									
									
										
										
								 
									
									
									
								} //fin du troisieme if
								menu();
								
				
							} while((choixSousMenu!=1) || (choixSousMenu!=2) || (choixSousMenu!=3));		//fermeture du do

							
						break;
						
							
						
//********************************************************Fin de "Faire une recherche pour trouver un bien par rapport à sa surface totale""**********************************************************************************


						
						
						
						
						
						
						
						
						
						
						
//********************************************************Début de "Afficher tous les clients par ordre alphabetique"""**********************************************************************************
						

						case 9:

							int x = liste_Clients.size();
							String y;
							String name [] = new String[x];
							
							
							for(int i = 0; i < liste_Clients.size(); i++){
								name[i] = liste_Clients.get(i).getNom_Client();
							}
							
							for(int i = 0; i < x; i++){
								
								for(int j = i+1; j < x; j++){
									
									if(name[i].compareTo(name[j]) > 0)
										{
											y = name[i];
											name[i] = name[j];
											name[j] = y;
											}
								}
							}
							
							for (int i = 0; i < x; i++) {
								System.out.println(name[i] +"\n");
							}

							
							
							//TriAlphabétique(liste_Clients);
							
							
						break;

						
//********************************************************Fin de "Afficher tous les clients par ordre alphabetique"""**********************************************************************************


						
						
						
						
						
						
						
						
						
						
//********************************************************Début de "Afficher tous les biens loues avec leur date de debut de location" ""**********************************************************************************
						

						case 10:
							
							
							
							for(int i = 0; i < liste_Appartements.size(); i++){
								
								System.out.println(liste_Appartements.get(i).getReference_Bien() + "\tdate de debut de location : " + liste_Appartements.get(i).getDate_debut_location_Bien()+ "\tdescription : " + liste_Appartements.get(i).getDescription_Appartement());	
								
							}
							
							for(int i = 0; i < liste_Maisons.size(); i++){
								
								System.out.println(liste_Maisons.get(i).getReference_Bien() + "\tdate de debut de location : " + liste_Maisons.get(i).getDate_debut_location_Bien()+ "\tdescription : " + liste_Maisons.get(i).getDescription_Maison());	
								
							}
							
							for(int i = 0; i < liste_Garages.size(); i++){
								
								System.out.println(liste_Garages.get(i).getReference_Bien() + "\tdate de debut de location : " + liste_Garages.get(i).getDate_debut_location_Bien()+ "\tdescription : " + liste_Garages.get(i).getDescription_Garage());	
								
							}
					
							
							
						break;
							
						
						
//********************************************************Fin de "Afficher tous les biens loues avec leur date de debut de location" "**********************************************************************************


						
						
						
						
						
						
						
						
						
						
						
				
//********************************************************Début de "Afficher les biens non loues" "**********************************************************************************
						
						

						case 11:
							
							//id_Appartement = null;
							
							for(int i = 0; i < liste_Appartements.size(); i++){
								
								if(liste_Appartements.get(i).getEn_location_Bien() == false){   
									id_Appartement = liste_Appartements.get(i);
								
									System.out.println(liste_Appartements.get(i).getReference_Bien() + "\tstatut de location : " + liste_Appartements.get(i).getEn_location_Bien()+ "\tdescription : " + liste_Appartements.get(i).getDescription_Appartement());	
								
							}
								
								}
							
							//Maison idMaison = null;
							
							for(int i = 0; i < liste_Maisons.size(); i++){
								
								if(liste_Maisons.get(i).getEn_location_Bien() == false){   
									//idMaison = liste_Maisons.get(i);
								
									System.out.println(liste_Maisons.get(i).getReference_Bien() + "\tstatut de location : " + liste_Maisons.get(i).getEn_location_Bien()+ "\tdescription : " + liste_Maisons.get(i).getDescription_Maison());	
								
							}
								
								}
							
						//	Garage idGarage = null;
							
							for(int i = 0; i < liste_Garages.size(); i++){
								
								if(liste_Garages.get(i).getEn_location_Bien() == false){   
								//	idGarage = liste_Garages.get(i);
								
									System.out.println(liste_Garages.get(i).getReference_Bien() + "\tstatut de location : " + liste_Garages.get(i).getEn_location_Bien()+ "\tdescription : " + liste_Garages.get(i).getDescription_Garage());	
								
							}
								
								}
						
							
						break;
							
						
						
						
//********************************************************Fin de "Afficher les biens non loues""**********************************************************************************

						
						
						
						
						
						
						
						
						
						
						
						
						

//********************************************************Début de "Supprimer une Location""**********************************************************************************
						
						

						case 12:
							
							
							
							
							System.out.println("Supprimer une location");
							
							
							Location ref_location = null;
							int ref_Location_A_Verifier;

							choixSousMenu = 0;

							System.out.println("Suppression d'une location");
							
							System.out.println("Voici la liste des locations en cours : ");
							
							for (int i = 0; i < liste_Locations.size(); i++) {//premier for
								System.out.println(liste_Locations.get(i).getRef_Location() + " " + liste_Locations.get(i).getNomClient_Location()+ " "+liste_Locations.get(i).getPrenomClient_Location());	
							}//fermeture du premier for
							System.out.println("Veuillez entre l'Id de la location que vous souhaitez supprimer");
							
							do {//premier do
								int idlocationASupprimer = sc.nextInt();
								sc.nextLine();
								
								for (int i = 0; i < liste_Locations.size(); i++) {//deuxieme for

								if(liste_Locations.get(i).getRef_Location() == idlocationASupprimer){//premier if
									ref_location = liste_Locations.get(i);
									ref_Location_A_Verifier = ref_location.getRef_Location();
									 
									
									
									 System.out.println("Etes-vous sur de vouloir supprimer la location suivante ? :\nAppartement n° " +   ref_location.getRef_Location() + "\tloue par " + ref_location.getNomClient_Location()+ "\t" + ref_location.getPrenomClient_Location());
								
									 System.out.println();
										System.out.println("Taper 1 pour supprimer\tTaper 2 pour annuler");
										choixSousMenu = sc.nextInt();
										
										sc.nextLine();
										
										if(choixSousMenu == 1) {//deuxieme if
											System.out.println("La location " +ref_location.getRef_Location() +  " a bien ete supprime" );
											liste_Locations.remove(ref_Location_A_Verifier);
											
										} else {
											System.out.println("Opération annulée");
										}//fermeture du deuxieme if
									 
									 
								}//fermeture du premier if 
								}//fermeture du deuxieme for
												 
							} //fermeture du premier do
								while (ref_location == null) ;

							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
						break;
								
						
//********************************************************Fin de "Supprimer une Location""**********************************************************************************


						
						
						
						
						
						case 13:
							quitter();
							
							
					}
				} while (choixMenu < 13);		//fermeture du premier do
				
				sc.close();
		
		
				
		
		
		
		
		
		
		
		
		

		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		


			
			
//			
//			
//			
//			
//			
////********************************************************Supprimer une location**********************************************************************************
//		
//			
//			
//			
//			
			
//			
//				
//				
//				
//				
//				
//				
				
				
				
	
				
	
				
			

				

				

	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		}
	
	
	
	
////********************************************************Menu general**********************************************************************************
	
		public static int menu(){
				Scanner sc = new Scanner(System.in);
				int choix = 0;
				System.out.println();
				System.out.println("1 : Ajouter un client");
				System.out.println("2 : Modifier un client");
				System.out.println("3 : Supprimer un client");
				System.out.println();
				System.out.println("4 : Ajouter un bien");
				System.out.println("5 : Modifier un bien");
				System.out.println("6 : Supprimer un bien");
				System.out.println();
				System.out.println("7 : Ajouter une location");
				System.out.println();
				System.out.println("8 : Faire une recherche pour trouver un bien par rapport à sa surface totale");
				System.out.println();
				System.out.println("9 : Afficher tous les clients par ordre alphabetique");
				System.out.println();
				System.out.println("10 : Afficher tous les biens loues avec leur date de debut de location");
				System.out.println();
				System.out.println("11 : Afficher les biens non loues");
				System.out.println();
				System.out.println("12 : Supprimer une location");

				System.out.println("13 : Quitter");
				while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4) &&(choix != 5) && (choix != 6) && (choix != 7) && (choix != 8) && (choix != 9) && (choix != 10) && (choix != 11) && (choix != 12)) {
				choix = sc.nextInt();
				}
				sc.close();
				return choix;
		
		}
		
		
		
		
//********************************************************methode quitter**********************************************************************************
		public static void quitter(){
			System.out.print("Fin de l'application!");
			System.exit(0);
		}
	

		
		public static void RechercheParSurface(List<Bien> liste_Biens){
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Surface minimum du bien recherche ? ");
		int SurfaceMin = sc.nextInt();
		System.out.print("Surface maximum du bien recherche ");
		int SurfaceMax = sc.nextInt();
		for (int i = 0; i < liste_Biens.size(); i++) {

			if(SurfaceMin < liste_Biens.get(i).getSurface_totale_Bien() && (liste_Biens.get(i).getSurface_totale_Bien() < SurfaceMax)){
				int ref = liste_Biens.get(i).getReference_Bien();
				System.out.println(ref);
		}else {
			System.out.println("Nous n'avons pas trouve de bien(s) correspondant a vos recherches");
		}
	 }
		
		sc.close();


}


		
		
		
		
		
		
		
/*

private static void afficher(List<Client> liste_Clients) {
	System.out.println("---------------------------les clients avec prénom et nom---------------------------");
	for(int i = 0; i < liste_Clients.size(); i++) {
		System.out.println(liste_Clients.get(i).getId_client() + "\\t\\t\\t" + liste_Clients.get(i).getNom_client() + "\\t\\t\\t" + liste_Clients.get(i).getPrenom_client());
	}
}*/



////creer une liste de biens contenant d'autres biens (appart, maison, garage) ?
//
//	private static void afficherbien(List<Bien> liste_Biens) {
//		System.out.println("---------------------------les clients avec prénom et nom---------------------------");
//		for(int i = 0; i < liste_Biens.size(); i++) {
//			System.out.println(liste_Biens.get(i).getReference_bien() + "\\t\\t\\t" + liste_Biens.get(i).getSurface_total_bien() + "\\t\\t\\t" + liste_Biens.get(i).getTarif_mensuel_bien()+ "\\t\\t\\t" + liste_Biens.get(i).isLocation_bien()
//					+ "\\t\\t\\t" + liste_Biens.get(i).getLoueur_id_client());
//		}
//
//}
	
	
	
//	
//	//affichage des biens loues
//	
//	private static void afficherbienLoué(List<Bien> liste_Biens) {
//		System.out.println("---------------------------les clients avec prénom et nom---------------------------");
//		for(int i = 0; i < liste_Biens.size(); i++) {
//			if(liste_Biens.get(i).getEn_location_Bien() == true) {
//			System.out.println(liste_Biens.get(i).getReference_Bien() + "\\t\\t\\t" + liste_Biens.get(i).getDate_debut_location_Bien()
//					+ "\\t\\t\\t" + liste_Biens.get(i).getLoueur_id_client());
//			}
//		}
//
//}
	
	
	
	
	
	//affichage des biens non loues
//	
//	private static void afficherbienNonLoué(List<Bien> liste_Biens,List<Client> liste_Clients) {
//		System.out.println("---------------------------les clients avec prénom et nom---------------------------");
//		for(int i = 0; i < liste_Biens.size(); i++) {
//			if(liste_Biens.get(i).isLocation_bien() == false) {
//			System.out.println(liste_Biens.get(i).getReference_bien()
//					+ "\\t\\t\\t" + liste_Biens.get(i).getLoueur_id_client() + "\\t\\t\\t" + liste_Clients.get(liste_Biens.get(i).getProp_id_client()-1).getNom_client());
//			}
//		}
//
//}
//	
//	
//	
//	
//	
//	//Trier client par ordre alphabetique
//	
//	private static List<Client> TriAlphabétique(List<Client> liste_Clients) {
//		int i1, j, min;
//		Client Alpha_Client;
//		for(i1 = 0; i1 < liste_Clients.size(); i1++)
//		{
//			min = i1;
//			for(j = i1; j < liste_Clients.size(); j++)
//			{
//				if(liste_Clients.get(min).getNom_Client().compareTo(liste_Clients.get(j).getNom_Client()) > 0)
//				{
//					min = j;
//				}
//			}
//			Alpha_Client = liste_Clients.get(i1);
//			liste_Clients.set(i1, liste_Clients.get(min));
//			liste_Clients.set(min, Alpha_Client);
//		}
//		return liste_Clients;
//
//	}
//
//		
//		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		}
									
	