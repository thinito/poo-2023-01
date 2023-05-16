import java.util.TreeSet;

public class Pessoa{
    private short dia;
    private short mes;
    private short ano;
    public short idade;
    private String nome;
}

public class Livro extends Object{

}

public class Prova{
    private byte numQuestoes;
    
    public byte getNumQuestoes() {
        return numQuestoes;
    }

    public void setNumQuestoes(byte n){
        if(n>0){
            numQuestoes = n;
        }
    }

}

public class TestProva{
    public static void main (String[] args ){
        Prova pf = new Prova();
    }
}

public class Casa{
    public Casa(){
        System.out.print("mais uma Casa.");
    }
    public static void main(String[] args){
        Casa c = new Casa();
    }
}

//Classe abstrata

public abstract class Pessoa{}

//Agregação

public class Festa{
    private TreeSet convidados = new TreeSet();
    
    public void novoConvidado(Convidado c){
        convidados.add(c);
    }
    public Festa(Convidado c) {
        convidados.add(c);
    }
}

//agregação e união

public class União {
    private ArrayList filhos;
    private Pessoa parceiros[2];
     
    public void novoFilho(Pessoa p){
        filhos.add(p);
    }
    public Uniao(Pessoa a, Pessoa b){
        parceiros [0] = a;
        parceiros [1] = b;
    }
}
