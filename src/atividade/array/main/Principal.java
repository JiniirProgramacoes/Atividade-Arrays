package atividade.array.main;

import atividade.array.collection.CadastrarConta;
import atividade.array.collection.ColecaoInt;
import atividade.array.collection.ColecaoNumero;
import atividade.array.collection.ColecaoPessoa;
import atividade.array.object.Conta;
import atividade.array.object.Numero;
import atividade.array.object.Pessoa;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
    	//Tirar as questões do modo comentário para executar cada questão.
    	
        //Primeira Questão
        /*ColecaoPessoa cP = new ColecaoPessoa();
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            Pessoa p = new Pessoa();
            System.out.println("Digite o nome da pessoa");
            p.setNome(scan.nextLine());
            cP.armazenarPessoa(p);
        }
        
        System.out.println(Arrays.toString(cP.listarPessoa()));*/
        
        
        //Segunda Questão
        /*ColecaoNumero cN = new ColecaoNumero();
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            Numero n = new Numero(scan.nextInt());
            cN.armazenarNumero(n);
        }
        
        System.out.println("Soma é: "+cN.somarValores());*/
        
        
        //Terceira, Quarta e Quinta questão
        CadastrarConta cC = new CadastrarConta();
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 1; i++){
            Conta c = new Conta();
            System.out.println("Digite o nome da Conta:");
                c.setNome(scan.next());
            System.out.println("Digite o valor da Conta:");
                c.setValor(scan.nextDouble());
            cC.adicionarConta(c);
        }
        /*Conta c1 = new Conta();
        System.out.println("Digite o nome da Conta:");
            c1.setNome(scan.next());
        System.out.println("Digite o valor da Conta:");
            c1.setValor(scan.nextDouble());
        System.out.println("Que lugar da fila deseja armazenar?");
            int nAdicionar = scan.nextInt();
            cC.adicionarContaPosicao(c1, nAdicionar);*/
        System.out.println("Que conta quer procurar pelo lugar da fila?");
            int i = scan.nextInt();
        System.out.println(cC.procurarConta(i));
        System.out.println("Que conta quer procurar pelo nome?");
            String nome = scan.next();
        System.out.println(cC.procurarContaNome(nome));
        System.out.println(Arrays.toString(cC.listarConta()));
        
    }
}
