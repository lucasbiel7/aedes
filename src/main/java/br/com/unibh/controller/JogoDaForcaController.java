/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unibh.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.ArcType;

/**
 * FXML Controller class
 *
 * @author lucas
 */
public class JogoDaForcaController implements Initializable {

    @FXML
    private AnchorPane apPrincipal;
    @FXML
    private Canvas cForca;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void onTentativa(ActionEvent e) {
        desenhar(6);
    }

    public static final int INICIO_X = 15;
    public static final int INICIO_Y = 15;

    public void desenhar(int falhas) {
        GraphicsContext graphicsContext = cForca.getGraphicsContext2D();
        switch (falhas) {
            case 1:
                desenharCabeca(graphicsContext);
                break;
            case 2:
                desenharCabeca(graphicsContext);
                desenharCorpo(graphicsContext);
                break;
            case 3:
                desenharCabeca(graphicsContext);
                desenharCorpo(graphicsContext);
                desenharBracoDireito(graphicsContext);
            case 4:
                desenharCabeca(graphicsContext);
                desenharCorpo(graphicsContext);
                desenharBracoDireito(graphicsContext);
                desenharBracoEsquerdo(graphicsContext);
                break;
            case 5:
                desenharCabeca(graphicsContext);
                desenharCorpo(graphicsContext);
                desenharBracoDireito(graphicsContext);
                desenharBracoEsquerdo(graphicsContext);
                desenharPernaDireita(graphicsContext);
                break;
            case 6:
                desenharCabeca(graphicsContext);
                desenharCorpo(graphicsContext);
                desenharBracoDireito(graphicsContext);
                desenharBracoEsquerdo(graphicsContext);
                desenharPernaDireita(graphicsContext);
                desenharPernaEsquerda(graphicsContext);
                break;
        }

    }

    private void desenharCabeca(GraphicsContext graphicsContext) {
        graphicsContext.fillOval(INICIO_X, INICIO_Y, 50, 50);
    }

    private void desenharCorpo(GraphicsContext graphicsContext) {
        graphicsContext.fillRect(INICIO_X + (50 / 2), INICIO_Y + 50, 3, 80);
    }

    private void desenharBracoDireito(GraphicsContext graphicsContext) {
        graphicsContext.fillRect(INICIO_X + (50 / 2), INICIO_Y + 65, 50, 3);
    }

    private void desenharBracoEsquerdo(GraphicsContext graphicsContext) {
        graphicsContext.fillRect(INICIO_X + (50 / 2) - 50, INICIO_Y + 65, 50, 3);
    }

    private void desenharPernaDireita(GraphicsContext graphicsContext) {
        graphicsContext.fillRect(INICIO_X + (50 / 2), INICIO_Y + 50 + 80, 50, 3);
    }

    private void desenharPernaEsquerda(GraphicsContext graphicsContext) {
        graphicsContext.fillRect(INICIO_X + (50 / 2) - 50, INICIO_Y + 50 + 80, 50, 3);
    }
}
