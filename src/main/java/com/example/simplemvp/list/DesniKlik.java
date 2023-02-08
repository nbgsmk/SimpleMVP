package com.example.simplemvp.list;

import com.example.simplemvp.model.DataModel;
import com.example.simplemvp.model.Person;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

import java.util.List;

public class DesniKlik {
	
	private volatile MenuItem item;
	
	public DesniKlik(DataModel model, Person person) {
		
		ContextMenu contextMenu = new ContextMenu();
		
		item  = new MenuItem("obrisi");
		item.setOnAction((event -> {
			System.out.println("Person " + person + " clicked - deleted");
			model.getPersonList().remove(person);
		}));
		contextMenu.getItems().add(item);
		
		item  = new MenuItem("napisi");
		item.setOnAction((event -> {
			System.out.println("Person " + person + " clicked");
			// model.getPersonList().remove(person);
		}));
		contextMenu.getItems().add(item);
	}
	

	
}
