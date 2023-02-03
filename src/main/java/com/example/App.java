package com.example;

import java.util.List;
import java.util.Scanner;

import com.example.dao.PersistenceDao;
import com.example.models.Adresse;
import com.example.models.Client;
import com.example.services.ClientService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersistenceDao.createTable();

        Scanner scanner = new Scanner(System.in);
       Adresse adresse = new Adresse();
       Client client = new Client();
       System.out.println("saisir le nom du client");
       client.setNom(scanner.nextLine());
       System.out.println("saisir le prenom");
       client.setPrenom(scanner.nextLine());
       System.out.println("saisir l'email");
       client.setEmail(scanner.nextLine());
       System.out.println("saisir le password");
       client.setPassword(scanner.nextLine());
       System.out.println("saisir le numero de telephone");
       client.setNumTel(scanner.nextLine());
       System.out.println("saisir l'adresse");
       System.out.println("saisir la ville");
       adresse.setVille(scanner.nextLine()); 
       System.out.println("saisir le quartier");  
       adresse.setQuartier(scanner.nextLine());
       System.out.println("saisir le numero de telephone");  
       adresse.setTel(scanner.nextLine());  
       client.setAdresse(adresse);
       
       ClientService clientService = new ClientService();
       boolean result = clientService.ajoutClient(client);
        if (result) {
          System.out.println("operation effectué avec succés");  
        }else{
            System.out.println("echec de l'operation");  

        }
        ////liste Client////
        List <Client> clients = clientService.findAllClient();
        for(Client c : clients){

            System.out.println("Id : "+c.getId() );
            System.out.println("Nom : "+c.getNom() );
            System.out.println("Prenom : "+c.getPrenom() );
            System.out.println("Email : "+c.getEmail() );
            System.out.println("Ville : "+c.getAdresse().getVille());
            System.out.println("Quartier : "+c.getAdresse().getQuartier());
        }

    }



}
