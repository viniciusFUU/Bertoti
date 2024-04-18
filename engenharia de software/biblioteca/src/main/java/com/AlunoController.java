package com;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlunoController {
    @FXML
    private TextField nomeField;
    @FXML
    private TextField idadeField;
    @FXML
    private TextField documentoField;

    private ObservableList<String> listaAlunos = FXCollections.observableArrayList();

    @FXML
    public void sendAluno(){
        String nome = nomeField.getText();
        String idade = idadeField.getText();        
        String documento = documentoField.getText();

        listaAlunos.addAll("Nome: " + nome + ", Idade: " + idade + ", Documento: " + documento);

        nomeField.clear();
        idadeField.clear();
        documentoField.clear();
    }

    public void viewListaAlunos(String nome, String idade, String documento){
        Stage stage = new Stage();
        stage.setTitle("Dados");

        Label label = new Label("Nome: " + nome + ", Idade: " + idade + ", Documento: " + documento);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }    
}
