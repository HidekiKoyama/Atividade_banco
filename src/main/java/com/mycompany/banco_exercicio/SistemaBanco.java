package com.mycompany.banco_exercicio;
import java.util.Scanner;

public class SistemaBanco {
    Scanner ler = new Scanner(System.in);
    Pessoa pessoa = new Pessoa("", 0);
    
    private int numeroc;
    private int tipo;
    private float saldo;
    private String dono;
    private boolean status;
    
    public SistemaBanco(float saldo, int tipo){
        
        System.out.println("" +
                "Digite o tipo de conta sendo: "+
                "\n 1 : Conta Corrente " +
                "\n 2 : Conta Poupança");
        
        pessoa.setConta(ler.nextInt());
        tipo = pessoa.getConta();
        
        while(tipo != 2 && tipo != 1){
            System.out.println("Por favor, escolha uma opção válida: ");
            tipo = ler.nextInt();
        }
        switch (tipo) {
            case 1:
                System.out.println("Por optar pela Conta corrente você ganhou R$ 20,00 para começar bem!");
                this.saldo = saldo + 20;
            case 2:
                System.out.println("Por optar pela Conta corrente você ganhou R$ 30,00 para começar bem!");
                this.saldo = saldo + 30;
        }      
        this.status = true;
    }
// métodos setters

    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    public void depositar(float valor){
        this.saldo = this.saldo + valor;
        
//tirando valor do bolso do cliente e colocando na conta
        while (valor > pessoa.getDinheiro()){
            System.out.println("Por favor, digite um valor que tenha em sua carteira!"
                    +"\n O a quantia que tem atualmente em sua carteira é: " + pessoa.getDinheiro()
                    +"\n Digite um novo valor: ");
            valor = ler.nextFloat();
        }
        pessoa.setDinheiro(pessoa.getDinheiro() - valor);
    }
    
    public void setDono(String nome){
        this.dono = pessoa.getNome();
    }
    
    public void setNumeroc(int numeroconta){
        this.numeroc = numeroconta;
    }
    
    public void setStatus (boolean status){
        this.status = status;
    }

// métodos getters
    
    
    public float getSaldo(){
        return saldo;
    }
    public int getTipo(){
        return tipo;
    }
    public boolean getStatus(){
        return status;
    }
}
