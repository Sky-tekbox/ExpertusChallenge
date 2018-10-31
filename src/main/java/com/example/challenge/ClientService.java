package com.example.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public void getForm(String name){
        Client client=new Client();
        //System.out.println("str="+name);
        clientRepository.save(client);
    }
}
