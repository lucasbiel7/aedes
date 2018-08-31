/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unibh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author 11724814
 */
public class Forca {
    
    private String palavra;
    private int falhas;

    private final List<String> palavrasPossiveis;
    private List<String> tentativas;

    public Forca() {
        palavrasPossiveis=new ArrayList<>();
        tentativas = new ArrayList<>();
        palavrasPossiveis.add("Banana");
        palavrasPossiveis.add("Paralelepípedo");
        palavrasPossiveis.add("Panela");
        palavrasPossiveis.add("Despedida");
        palavrasPossiveis.add("Necessidade");
        palavrasPossiveis.add("Ortodoxas");
        palavrasPossiveis.add("Lucas");
    }
    
    
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getFalhas() {
        return falhas;
    }

    public void setFalhas(int falhas) {
        this.falhas = falhas;
    }

    public List<String> getTentativas() {
        return tentativas;
    }

    public void setTentativas(List<String> tentativas) {
        this.tentativas = tentativas;
    }

    public void gerarPalavra(){
        this.palavra  = palavrasPossiveis.get(new Random().nextInt(palavrasPossiveis.size()-1));
    }

    public void iniciar() {
        gerarPalavra();
        falhas = 0;
        tentativas.clear();
        
    }
    
}
