package atividade.array.collection;

import java.util.Arrays;

public class ColecaoInt {
    
    
    private int max = 1;
    private int[] listaInt = new int[max];

    public void armazenarInt(int a){
        for(int i = 0; i < listaInt.length; i++){
            if(listaInt[i] == 0){
                listaInt[i] = a;
            }
        }
        max++;
        listaInt = new int[max];
        armazenarInt(a);
    }

    public String listarInt(){
        return Arrays.stream(this.listaInt).mapToObj(String::valueOf).reduce((x,y) -> x +", "+ y).get();
    }
    
}
