

import java.util.ArrayList;
import imd.modelo.Aluno;

public class Turma {
	
	private ArrayList<Aluno> alunos;
	
	public Turma() {
		alunos = new ArrayList<Aluno>();
	}
	
	public void inserirAluno(Aluno a)  {
		alunos.add(a);
		System.out.println("Aluno inserido com sucesso!!");
	}
	
	public String calcularMediaTurma() {
		String output = "";
		output += "------------------------------------------------";
	
		double mediaTurma = 0;
		for (Aluno a : alunos) {
			mediaTurma += a.calculaMedia();
		}
		mediaTurma = mediaTurma / alunos.size();
		output += "\nMedia da Turma => " + mediaTurma + "\n";
		output += "------------------------------------------------\n";
		return output;
	}
}
