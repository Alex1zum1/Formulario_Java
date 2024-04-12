package superclasses;
public class User {
    protected int numero;
    private String nome;
    private String CPF;
    private int idade;
    private String codigo;
    
    public User(String nome, String CPF, int idade, String codigo){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public int getIdade() {
        return idade;
    }
    public String getCodigo() {
        return codigo;
    }
};
