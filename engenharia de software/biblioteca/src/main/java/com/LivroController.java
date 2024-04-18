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

public class LivroController {
    @FXML
    private TextField nomeLivroField;
    @FXML
    private TextField autorLivroField;
    @FXML
    private TextField generoLivroField;

    ObservableList<String> listaDeLivros = FXCollections.observableArrayList();

    public void sendNomeLivro(){
        String nome = nomeLivroField.getText();
        String autor = autorLivroField.getText();
        String genero = generoLivroField.getText();

        listaDeLivros.addAll(nome, autor, genero);
    }

    public void viewListaLivros(String nomeLivro, String autorLivro, String generoLivro){
        Stage stage = new Stage();
        stage.setTitle("Dados");

        Label label = new Label("Nome: " + nomeLivro + ", Idade: " + autorLivro + ", Documento: " + generoLivro);
        VBox vbox = new VBox(label);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(vbox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }  
}