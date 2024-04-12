package entity;

import superclasses.User;
public class Aluno extends User {
    private double nota1;
    private double nota2;
    private double totalNota;
    
    public Aluno(String NOME, String cPF, int Idade, String Codigo) {
        super(NOME, cPF, Idade, Codigo);
    } 
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
        totalNota += nota1;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
        totalNota += nota2;
    }
    public double getNota2() {
        return nota2;
    }
    public double getTotalNota() {
        totalNota /= 2;
        return totalNota;
    }
}
