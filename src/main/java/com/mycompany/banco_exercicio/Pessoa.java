package com.mycompany.banco_exercicio;
import java.util.Scanner;

public class Pessoa {
    Scanner ler = new Scanner(System.in);
    
    private String nome;
    private float dinheiro;
    private int tipoc;
    private boolean optante;
    
    public Pessoa (String nome, float dinheiro){
        this.nome = nome;  
        this.dinheiro = dinheiro;        
    }
    
    
    
// métodos setters
    
    public void setConta(int tipoc){
        this.tipoc = tipoc;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDinheiro(float dinheiro){
        while (dinheiro < 1 || dinheiro > 9999){
            System.out.println("Por favor, digite um valor verdadeiro");
            dinheiro = ler.nextFloat();
        }
        this.dinheiro = dinheiro;
    }
    
 // status da conta
 
    public void abrirConta(boolean optante){
        this.optante = true;
    }
    
    public void fecharConta(boolean optante){
        this.optante = false;
    }
    
// métodos getters
    
    public String getNome(){
        return nome;  
       }
    public int getConta(){
        return tipoc;
    }
    public boolean getStatus(){
        return optante;
    }
}
