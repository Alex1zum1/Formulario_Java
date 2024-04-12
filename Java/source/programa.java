package source;

import entity.Aluno;
import entity.Funcionario;

public class programa {
    public static void main(String[] args) {
		Aluno luiz = new Aluno("Luiz Felipe", "123.456.789-10", 25, "123456");
        luiz.setNota1(9.0);
        luiz.setNota2(5.0);
        System.out.println("Nota final: "+luiz.getTotalNota());

        Funcionario joao = new Funcionario("Joao Guilherme", "109.876.543-21", 37, "198765");
        joao.setSenha("14Carro@");
        System.out.println("Senha: "+joao.getSenha());
	}
}