package com.mycompany.banco_exercicio;
import java.util.Scanner;
/*
 * @author Cyber_Hiki
 */
public class BANCO_EXERCICIO {

    /*
    objetivo da atividade:
    
    */
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa ("", 0);
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Deseja abrir uma conta? Digite uma das opções abaixo:"+
                "\n1 - SIM!" +
                "\n2 - Talvez mais tarde! :(");
        int sn = ler.nextInt(); 
        if (sn == 1) {
            
            System.out.println("Digite seu nome: ");
            pessoa.setNome(ler.nextLine());

            System.out.println("Quanto de dinheiro você tem? ");
            pessoa.setDinheiro(ler.nextFloat());

            // apenas um exemplo como é uma atividade simples não tem muita importancia o núemro da conta
            System.out.println("Digite o número da conta que deseja abrir: ");
            pessoa.setConta(ler.nextInt());


            SistemaBanco bc = new SistemaBanco(0,0);        

            System.out.println("Seu saldo: " + bc.getSaldo());
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
            ler.close();
        }
        
        else{
            System.out.println("Então vamos lá... espera, você disse não?"
                    +
                    "\nAhn.. tudo bem te vejo na próxima então ;-;");
        }
    }
}
