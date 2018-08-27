/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unibh.model;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author lucas
 */
public class GerenciadorDeJanela {

    public static final String PACOTE_VIEW = GerenciadorDeJanela.class.getPackage().getName().replace("model", "view").replace(".", "/");
    private Scene scene;

    private static GerenciadorDeJanela gerenciadorDeJanela;

    public static GerenciadorDeJanela getInstance() {
        if (gerenciadorDeJanela == null) {
            gerenciadorDeJanela = new GerenciadorDeJanela();
        }
        return gerenciadorDeJanela;
    }

    private GerenciadorDeJanela() {
    }

    private GerenciadorDeJanela(Scene scene) {
        this.scene = scene;
    }

    public Stage mostrarJanela(Stage primaryStage, Parent parent, String title) {
        primaryStage.setTitle(title);
        scene = new Scene(parent);
        primaryStage.setScene(scene);
        return primaryStage;
    }

    public void trocarCena(Parent parent) {
        scene.setRoot(parent);
    }

    public Parent carregarComponente(String tela) {
        try {
            return FXMLLoader.load(getClass().getResource("/" + PACOTE_VIEW + "/" + tela + ".fxml"));
        } catch (IOException e) {
            return null;
        }
    }

    public Parent carregarComponente(String tela, Object object) {
        Parent parent = carregarComponente(tela);
        if (parent != null) {
            parent.setUserData(object);
        }
        return parent;
    }
}
