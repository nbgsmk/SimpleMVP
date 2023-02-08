module com.example.simplemvp {
	requires javafx.controls;
	requires javafx.fxml;
	
	
	opens com.example.simplemvp to javafx.fxml;
	exports com.example.simplemvp;
	
	opens com.example.simplemvp.application to javafx.fxml;
	exports com.example.simplemvp.application;
	
	opens com.example.simplemvp.editor to javafx.fxml;
	exports com.example.simplemvp.editor;
	
	opens com.example.simplemvp.list to javafx.fxml;
	exports com.example.simplemvp.list;
	
	opens com.example.simplemvp.menu to javafx.fxml;
	exports com.example.simplemvp.menu;
	
	opens com.example.simplemvp.model to javafx.fxml;
	exports com.example.simplemvp.model;
	
}