package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox txtSequenza;

    @FXML
    private Button btnStatistica;

    @FXML
    private Button btnAnagrammi;

    @FXML
    private TextArea txtResult;

    @FXML
    void initialize() {
        assert txtSequenza != null : "fx:id=\"txtSequenza\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnStatistica != null : "fx:id=\"btnStatistica\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnAnagrammi != null : "fx:id=\"btnAnagrammi\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
