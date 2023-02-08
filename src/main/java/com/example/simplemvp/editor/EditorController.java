package com.example.simplemvp.editor;

import com.example.simplemvp.model.DataModel;
import com.example.simplemvp.model.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EditorController {
	
	@FXML
    private TextField firstNameField ;
    @FXML
    private TextField lastNameField ;
    @FXML
    private TextField emailField ;
	@FXML
	public Button b_dodaj;

    private DataModel model ;

    public void initModel(DataModel model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model ;
        model.currentPersonProperty().addListener((obs, oldPerson, newPerson) -> {
            if (oldPerson != null) {
                firstNameField.textProperty().unbindBidirectional(oldPerson.firstNameProperty());
                lastNameField.textProperty().unbindBidirectional(oldPerson.lastNameProperty());
                emailField.textProperty().unbindBidirectional(oldPerson.emailProperty());
            }
            if (newPerson == null) {
                firstNameField.setText("");
                lastNameField.setText("");
                emailField.setText("");
            } else {
                firstNameField.textProperty().bindBidirectional(newPerson.firstNameProperty());
                lastNameField.textProperty().bindBidirectional(newPerson.lastNameProperty());
                emailField.textProperty().bindBidirectional(newPerson.emailProperty());
            }
        });
    }
	
	public void bdodaj(ActionEvent actionEvent) {
		model.getPersonList().add(new Person(firstNameField.getText(), lastNameField.getText(), emailField.getText()));
	}
}