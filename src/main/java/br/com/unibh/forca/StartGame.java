/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unibh.forca;

import br.com.unibh.model.GerenciadorDeJanela;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author lucas
 */
public class StartGame extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GerenciadorDeJanela gerenciadorDeJanela = GerenciadorDeJanela.getInstance();
        gerenciadorDeJanela.mostrarJanela(primaryStage, gerenciadorDeJanela.carregarComponente("JogoDaForca"), "Jogo da força").show();
    }

}
