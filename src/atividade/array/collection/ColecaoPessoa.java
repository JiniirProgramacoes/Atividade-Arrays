package atividade.array.collection;

import atividade.array.object.Pessoa;
import java.util.Arrays;
import java.util.Collections;

public class ColecaoPessoa {
    
    private Pessoa[] pessoa = new Pessoa[10];
    private int cont;
    
    public void armazenarPessoa(Pessoa pessoa){
        this.pessoa[cont] = pessoa;
        this.cont++;
    }
    
    public Pessoa[] listarPessoa(){
        Arrays.sort(this.pessoa);
        return this.pessoa;
    }
}
