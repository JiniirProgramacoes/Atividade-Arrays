package atividade.array.object;

public class Numero {
    
    private int id;
    private int valor;

    public Numero() {
    }

    public Numero(int id, int valor) {
        this.id = id;
        this.valor = valor;
    }

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
