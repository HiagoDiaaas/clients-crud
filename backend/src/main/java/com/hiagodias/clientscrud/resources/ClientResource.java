package com.hiagodias.clientscrud.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiagodias.clientscrud.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Hiago", "444.444.444", 25.0, null, 0));
		list.add(new Client(1L, "Nati", "23.23.23.23", 25.0, null, 0));
		return ResponseEntity.ok().body(list);
		
	}

}
