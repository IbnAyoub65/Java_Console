package com.example.dao;

import com.example.models.Client;

public interface IClientDao extends IDao<Client,Long>{
   Client findByEmail(String email);

}
