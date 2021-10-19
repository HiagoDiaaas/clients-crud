package com.hiagodias.clientscrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiagodias.clientscrud.entities.Client;
import com.hiagodias.clientscrud.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
		
	public List<Client> findAll() {
		return repository.findAll();
		
	}
}
