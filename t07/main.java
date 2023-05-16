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

//associação nn

public class Aluno{
    private Curso[] cursos;
}

public class Curso{
    private Aluno[] aluno;
}

//Algoritmo para Java

public class TesteSomaNaturais{
    public static long SomaNaturais(int n){
    int c = 1;
    long s = 0;
    while(c<=n){
        s = s+c;
        c = c +1;
        }
    }
    
    public static void main(String [] args){
        System.out.println(SomaNaturais(10));
    }
}

//Aplicação Java

public class Permuta{
    public static void Permutação(String p, String S){
    if(S.length()==1){
        System.out.println(p+S);        
    } else {
        String Slinha;
        String plinha;
        for(int i = 0, i < S.length(); i++){
        Slinha = S.substring(0,i) + S.substring(i,1);
        plinha = p + S.charAt(i);
        Permutação = (plinha, Slinha);
        }
    }
    }
    
    public static void main(String [] args){
        Permutação (new String().args[0]);
    }
}

//composiçao 

public class Religiao{
    private ArrayList devotos;
    
    public void novoFiel(Devoto d){
    
    }
}
