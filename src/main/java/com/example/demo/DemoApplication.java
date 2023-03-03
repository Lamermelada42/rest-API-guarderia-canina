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
		Addition app = new Addition();
		app.insert("German", "11004455","Negro Arroyo","Milo");
		app.insert("Robert", "66440022","Rio Frio","Ali");
		app.insert("Jerry", "11220055","Caracas","Chepe");
		Addition add = new Addition();
		app.reserve("99004411", "German","10/21");
		app.reserve("66773322", "Chepe","02/04");
		app.reserve("33112244", "Juni","05/10");
		Search application = new Search();
		application.selectClient();
		application.selectReserve();
	}

}