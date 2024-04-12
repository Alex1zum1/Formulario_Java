package entity;

import superclasses.User;

public class Funcionario extends User {
    private String senha;

    public Funcionario(String NOME, String cPF, int Idade, String Codigo) {
        super(NOME, cPF, Idade, Codigo);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha() {
        return senha;
    }
}
