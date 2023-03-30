package atividade.array.collection;

import atividade.array.object.Conta;

public class CadastrarConta {
    
    private Conta[] conta = new Conta[100];
    private int cont;
    private int contV;

    
    public void adicionarConta(Conta conta){
         this.conta[cont] = conta;
         cont++;
    }
    public void adicionarContaPosicao(Conta conta, int posicao){
    	if(!verificarPosicao(posicao)) {
    		throw new IllegalArgumentException("Posição Inválida");
    	}
    	if(posicao - 1 < cont) {
    		contV = cont;
			while(contV > (posicao - 1)) {
				this.conta[contV] = this.conta[contV - 1];
				contV--;
			}
			this.conta[contV] = conta;
			cont++;
    	}else {
    		this.conta[posicao - 1] = conta;
    	}
    }
    
    public Conta[] listarConta(){
        return this.conta;
    }
    
    public Conta procurarConta(int i){
    	if(!verificarPosicao(i)) {
        	throw new IllegalArgumentException("Posição Inválida");
    	}
    	return conta[i-1];
    }
    
    public Conta procurarContaNome(String nome){
        for(Conta c : this.conta){
        	if(c == null) {
        		continue;
        	}
        	else if(c.getNome().equalsIgnoreCase(nome)){
                return c;
            }
        }
        return null;
    }
    
    public boolean verificarPosicao(int posicao) {
    	if(posicao >= 1 && posicao <= conta.length) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
}
