package com.example.services;

import java.util.List;

import com.example.dao.ClientDaoImp;
import com.example.dao.IClientDao;
import com.example.models.Client;

public class ClientService {
    private IClientDao iClientDao;
    public ClientService(){
    iClientDao = new ClientDaoImp();
    }
 
public boolean ajoutClient(Client client){

    return iClientDao.save(client);
  }  
  public Client findClientByid(Long id){
    return iClientDao.findById(id);
  }
  public Client findClientByemail(String email){
    return iClientDao.findByEmail(email);
  }
  public List<Client> findAllClient(){
    return iClientDao.findAll();
  } 
}
