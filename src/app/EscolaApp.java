package app;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import escola.model.Aluno;
import escola.model.Contato;
import escola.model.Curso;
import escola.model.Endereco;
import escola.model.Funcionario;
import escola.model.Professor;
import escola.model.enums.SituacaoEstCadastro;
import escola.model.enums.SituacaoFunCadastro;

public class EscolaApp {

	public static void main(String[] args) {

		Double calculoInss, calculoIRPF, calculoValeRefeicao, calculoValeTransporte;

		System.out.println("--INFORMAÇÕES RELACIONADAS AO FUNCIONÁRIO");
		System.out.println();

		Endereco end01 = new Endereco("Rua Antonio Sales", "2548", "Aldeota", "60.055-184", "Fortaleza", "Ceará",
				"Brasil");
		Contato cont01 = new Contato("85 9999-9999", "85 3333-3333", "email@email.com.br");

		Funcionario funcionario = new Funcionario(10L, "Marcio", LocalDate.of(2023, 06, 28), end01, cont01,
				"Supervisor", 8, 4500.00, SituacaoFunCadastro.ATIVO);

		System.out.println(funcionario.toString());

		calculoInss = funcionario.calculaInss(funcionario.getSalario());
		calculoIRPF = funcionario.calculaIR(funcionario.getSalario());
		calculoValeRefeicao = funcionario.calculaValeRefeicao(funcionario.getSalario());
		calculoValeTransporte = funcionario.calculaValeTransporte(funcionario.getSalario());

		System.out.println("Desconto INSS: " + calculoInss);
		System.out.println("Desconto IRPF: " + calculoIRPF);
		System.out.println("Vale Refeicão: " + calculoValeRefeicao);
		System.out.println("Vale Transporte: " + calculoValeTransporte);

		System.out.println("Calculo Final Salário à Receber: " + funcionario.calculoSalarioFinal());
		System.out.println();
		System.out.println("--FIM DAS INFORMAÇÕES RELACIONADAS AO FUNCIONÁRIO");

		System.out.println();

		System.out.println("--INFORMAÇÕES RELACIONADOS AO PROFESSOR");
		System.out.println();
		Endereco end02 = new Endereco("Rua das Laranjeiras", "84A", "Montese", "60.055-200", "Fortaleza", "Ceará",
				"Brasil");
		Contato cont02 = new Contato("85 8888-8888", "85 4444-4444", "emailprofessor@email.com.br");

		Curso curso01 = new Curso("Java", "Noite", 8, 100, LocalDate.of(2023, Month.JANUARY, 20),
				LocalDate.of(2023, Month.JULY, 20));
		Curso curso02 = new Curso("Python", "Manhã", 10, 120, LocalDate.of(2023, Month.FEBRUARY, 20),
				LocalDate.of(2023, Month.AUGUST, 20));
		Curso curso03 = new Curso("C++", "Tarde", 8, 150, LocalDate.of(2023, Month.MARCH, 20),
				LocalDate.of(2023, Month.AUGUST, 20));

		List<Curso> turmas = new ArrayList<>();

		turmas.add(curso01);
		turmas.add(curso02);
		turmas.add(curso03);

		Professor professor = new Professor(20L, "Francisco Diniz Sales", LocalDate.of(1998, Month.DECEMBER, 10), end02,
				cont02, "Professor", 7000.00, SituacaoFunCadastro.ATIVO, turmas);

		System.out.println(professor.toString());

		calculoInss = professor.calculaInss(professor.getSalario());
		calculoIRPF = professor.calculaIR(professor.getSalario());
		calculoValeRefeicao = professor.calculaValeRefeicao(professor.getSalario());
		calculoValeTransporte = professor.calculaValeTransporte(professor.getSalario());

		System.out.println("Desconto INSS: " + calculoInss);
		System.out.println("Desconto IRPF: " + calculoIRPF);
		System.out.println("Vale Refeicão: " + calculoValeRefeicao);
		System.out.println("Vale Transporte: " + calculoValeTransporte);

		System.out.println("Calculo Final Salário à Receber: " + funcionario.calculoSalarioFinal());

		System.out.println();
		System.out.println("Cursos Ministrados pelo Professor:");
		System.out.println();

		for (Curso curso : turmas) {
			System.out.println(curso.toString());
		}

		System.out.println();
		System.out.println("--FIM DAS INFORMAÇÕES RELACIONADAS AO PROFESSOR");

		System.out.println();

		System.out.println("--INFORMAÇÕES RELACIONADOS AO ALUNO");
		System.out.println();

		Endereco end03 = new Endereco("Av. Pontes Vieira", "500", "Dionisio Torres", "60.055-500", "Fortaleza", "Ceará",
				"Brasil");
		Contato cont03 = new Contato("85 7777-7777", "85 5555-5555", "emailaluno@email.com.br");

		Aluno aluno = new Aluno(20L, "Rafael Gomes Alencar", LocalDate.of(1998, Month.DECEMBER, 10), end03, cont03,
				SituacaoEstCadastro.ATIVO, List.of(curso02, curso03));

		System.out.println("Nome do Aluno: "+aluno.getNome());
		System.out.println("Endereço: "+aluno.getEndereco());
		System.out.println("Contato: "+aluno.getContato());
		System.out.println("Data de Aniversario: "+ aluno.getDataDeAniversario());
		System.out.println("Situação: "+aluno.getSituacaoEstCadastro());
		System.out.println();
		System.out.println("Cursos Matriculados");
		System.out.println(aluno.getTurmas());
		System.out.println();

		System.out.println("--FIM DAS INFORMAÇÕES RELACIONADAS AO ALUNO");
		
	}

}
