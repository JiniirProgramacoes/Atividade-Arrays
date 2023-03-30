
package atividade.array.collection;

import atividade.array.object.Numero;

public class ColecaoNumero {
    
    private Numero[] numero = new Numero[10];
    private int cont;
    private int soma;
    
    public void armazenarNumero(Numero numero){
        this.numero[cont] = numero;
        this.cont++;
    }
    
    public int somarValores(){
        for(Numero num : numero){
            soma+= num.getValor();
        }
        return soma;
    }
    
}
