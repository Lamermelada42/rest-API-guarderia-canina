package com.example.demo;

import com.example.demo.database.Addition;
import com.example.demo.database.Creation;
import com.example.demo.database.Connection;
import com.example.demo.database.Search;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Connection.connect();
		Creation.createNewDatabase("Dogcare.db");
		Creation.createNewTable();
		Search application = new Search();
		application.selectClient();
		application.selectReserve();
	}

}