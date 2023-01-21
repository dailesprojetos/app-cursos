package app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import escola.model.Aluno;
import escola.model.Contato;
import escola.model.Curso;
import escola.model.Endereco;
import escola.model.Funcionario;
import escola.model.Professor;
import escola.model.enums.SituacaoEstCadastro;
import escola.model.enums.SituacaoFunCadastro;

public class AppCursoScanner {

	static String logradouro, numero, bairro, cep, municipio, estado, pais, telefone01, telefone02, email, nome, data,
			cargo, situacaoFunCadastro, situacaoEstCadastro, turno, descricao, curso;
	static Integer cargaHoraria, horasPorAula;
	static Double salarioDouble;

	static Scanner dado = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {

		// dadosFuncionario();
		//dadosProfessor();
		dadosAluno();

	}

	public static void dadosEndereco() {

		System.out.println("Digite as informações do endereço");
		System.out.print("Logradouro: ");
		dado.nextLine();
		logradouro = dado.nextLine();
		System.out.print("Número: ");
		numero = dado.nextLine();
		System.out.print("Bairro: ");
		bairro = dado.nextLine();
		System.out.print("Cep: ");
		cep = dado.nextLine();
		System.out.print("Municipio: ");
		municipio = dado.nextLine();
		System.out.print("Estado: ");
		estado = dado.nextLine();
		System.out.print("Pais: ");
		pais = dado.nextLine();

	}

	public static void dadosContato() {

		System.out.println("Digite as informações de contato");
		System.out.print("Primeiro telefone: ");
		telefone01 = dado.nextLine();
		System.out.print("Segundo telefone: ");
		telefone02 = dado.nextLine();
		System.out.print("Email: ");
		email = dado.nextLine();
	}

	public static void dadosFuncionario() {

		System.out.println("-INICIO INFORMAÇÕES DO FUNCIONÁRIO");

		dadosEndereco();
		dadosContato();

		Endereco enderecoFuncionario = new Endereco(logradouro, numero, bairro, cep, municipio, estado, pais);
		Contato contatoFuncionario = new Contato(telefone01, telefone02, email);

		// dados do funcionario
		System.out.print("Nome: ");
		nome = dado.nextLine();
		System.out.print("Data Aniversário: ");
		data = dado.nextLine();
		LocalDate dataAniversario = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Cargo: ");
		cargo = dado.nextLine();
		System.out.print("CargaHoraria: ");
		cargaHoraria = dado.nextInt();
		System.out.print("Salario: ");
		salarioDouble = dado.nextDouble();
		System.out.println("Situaçao: ");
		situacaoFunCadastro = dado.next().toUpperCase();
		SituacaoFunCadastro situacaoFuncionario = SituacaoFunCadastro.valueOf(situacaoFunCadastro);

		Funcionario funcionario = new Funcionario(10L, nome, dataAniversario, enderecoFuncionario, contatoFuncionario,
				cargo, cargaHoraria, salarioDouble, situacaoFuncionario);

		System.out.println();
		System.out.println("Saída das Informações do Funcionário");
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getDataDeAniversario());
		System.out.println(funcionario.getCargo());
		System.out.println(funcionario.getCargaHoraria());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getSituacaoFunCadastro());

		System.out.println();
		System.out.println("Informação Salarial");
		System.out.println(funcionario.calculaInss(salarioDouble));
		System.out.println(funcionario.calculaIR(salarioDouble));
		System.out.println(funcionario.calculaValeRefeicao(salarioDouble));
		System.out.println(funcionario.calculaValeTransporte(salarioDouble));
		System.out.println(funcionario.calculoSalarioFinal());

		System.out.println();
		System.out.println("-FIM INFORMAÇÕES DO FUNCIONARIO");
		System.out.println();
	}

	public static void dadosTurmas() {

		System.out.print("Digite a quantidade de cursos: ");
		int quantidadeCurso = dado.nextInt();

		for (int i = 1; i < quantidadeCurso; i++) {

			System.out.print("Nome: ");
			nome = dado.nextLine();
			System.out.print("Turno: ");
			turno = dado.nextLine();
			System.out.print("HorasPorAula: ");
			horasPorAula = dado.nextInt();
			System.out.print("CargaHoraria: ");
			cargaHoraria = dado.nextInt();
			System.out.print("DataInicio: ");
			data = dado.nextLine();
			LocalDate dataInicio = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("DataFim: ");
			data = dado.nextLine();
			LocalDate dataFim = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			Curso curso = new Curso(nome, turno, horasPorAula, cargaHoraria, dataInicio, dataFim);

		}
	}

	public static void dadosProfessor() {

		System.out.println("-INICIO INFORMAÇÕES DO PROFESSOR");

		System.out.print("Nome: ");
		descricao = dado.nextLine();
		System.out.print("Data Aniversário: ");
		data = dado.nextLine();
		LocalDate dataAniversario = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Cargo: ");
		cargo = dado.nextLine();
		System.out.print("Salario: ");
		salarioDouble = dado.nextDouble();
		System.out.print("Situaçao: ");
		situacaoFunCadastro = dado.next().toUpperCase();
		SituacaoFunCadastro situacaoProfessor = SituacaoFunCadastro.valueOf(situacaoFunCadastro);

		System.out.println();
		dadosEndereco();
		System.out.println();
		dadosContato();

		Endereco enderecoFuncionario = new Endereco(logradouro, numero, bairro, cep, municipio, estado, pais);
		Contato contatoFuncionario = new Contato(telefone01, telefone02, email);
		System.out.println();

		System.out.print("Digite a quantidade de cursos: ");
		int quantidadeCurso = dado.nextInt();

		List<Curso> cursos = new ArrayList<>();

		for (int i = 0; i < quantidadeCurso; i++) {
			System.out.print("Nome: ");
			nome = dado.next();
			System.out.print("Turno: ");
			turno = dado.next();
			System.out.print("HorasPorAula: ");
			horasPorAula = dado.nextInt();
			System.out.print("CargaHoraria: ");
			cargaHoraria = dado.nextInt();
			System.out.print("DataInicio: ");
			data = dado.next();
			LocalDate dataInicio = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("DataFim: ");
			data = dado.next();
			LocalDate dataFim = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

			Curso curso = new Curso(nome, turno, horasPorAula, cargaHoraria, dataInicio, dataFim);
			cursos.add(curso);
		}

		Professor professor = new Professor(11L, descricao, dataAniversario, enderecoFuncionario, contatoFuncionario,
				cargo, salarioDouble, situacaoProfessor, cursos);

		System.out.println();
		System.out.println("Informações do Professor");
		System.out.println("====================================================");
		System.out.println("Nome: " + professor.getNome());
		System.out.println("DataAniversario: " + professor.getDataDeAniversario());
		System.out.println("Cargo: " + professor.getCargo());
		System.out.println("CargaHoraria: " + professor.getSalario());
		System.out.println("Situacao: " + professor.getSituacaoFunCadastro());
		System.out.println("====================================================");
		System.out.println();

		System.out.println("Cursos Ministrados");
		System.out.println("====================================================");
		for (Curso curso : cursos) {
			System.out.println("Curso: " + curso.getNome());
			System.out.println("Turno: " + curso.getTurno());
			System.out.println("HorasPorAula: " + curso.getHorasPorAula());
			System.out.println("CargaHoraria: " + curso.getCargaHoraria());
			System.out.println("DataInicio: " + curso.getDataInicio());
			System.out.println("DataFinal: " + curso.getDataFim());
			System.out.println("------------------------------------------------");
		}
		System.out.println("====================================================");
		System.out.println();

		System.out.println("Informação Salarial");
		System.out.println("====================================================");
		System.out.println("Desconto INSS: " + professor.calculaInss(salarioDouble));
		System.out.println("Desconto IR: " + professor.calculaIR(salarioDouble));
		System.out.println("Vale Refeição: " + professor.calculaValeRefeicao(salarioDouble));
		System.out.println("Vale Transporte: " + professor.calculaValeTransporte(salarioDouble));
		System.out.println(professor.calculoSalarioFinal());
		System.out.println("====================================================");

		System.out.println();
		System.out.println("FIM DAS INFORMAÇÕES DO PROFESSOR");

	}

	public static void dadosAluno() {

		System.out.println("-INICIO INFORMAÇÕES DO ALUNO");

		System.out.print("Nome: ");
		descricao = dado.nextLine();
		System.out.print("Data Aniversário: ");
		data = dado.nextLine();
		LocalDate dataAniversario = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Situaçao: ");
		situacaoEstCadastro = dado.next().toUpperCase();
		SituacaoEstCadastro situacaoAluno = SituacaoEstCadastro.valueOf(situacaoEstCadastro);

		System.out.println();
		dadosEndereco();
		System.out.println();
		dadosContato();

		Endereco enderecoAluno = new Endereco(logradouro, numero, bairro, cep, municipio, estado, pais);
		Contato contatoAluno = new Contato(telefone01, telefone02, email);
		System.out.println();

		System.out.print("Digite a quantidade de cursos: ");
		int quantidadeCurso = dado.nextInt();

		List<Curso> cursos = new ArrayList<>();

		for (int i = 0; i < quantidadeCurso; i++) {
			System.out.print("Nome: ");
			nome = dado.next();
			System.out.print("Turno: ");
			turno = dado.next();
			System.out.print("HorasPorAula: ");
			horasPorAula = dado.nextInt();
			System.out.print("CargaHoraria: ");
			cargaHoraria = dado.nextInt();
			System.out.print("DataInicio: ");
			data = dado.next();
			LocalDate dataInicio = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("DataFim: ");
			data = dado.next();
			LocalDate dataFim = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

			Curso curso = new Curso(nome, turno, horasPorAula, cargaHoraria, dataInicio, dataFim);
			cursos.add(curso);
		}

		Aluno aluno = new Aluno(11L, descricao, dataAniversario, enderecoAluno, contatoAluno, situacaoAluno, cursos);

		System.out.println();
		System.out.println("Informações do Aluno");
		System.out.println("====================================================");
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("DataAniversario: " + aluno.getDataDeAniversario());
		System.out.println("Situacao: " + aluno.getSituacaoEstCadastro());
		System.out.println("====================================================");
		System.out.println();
		
		System.out.println("Informações Pessoais");
		System.out.println(aluno.getEndereco().toString());
		System.out.println(aluno.getContato().toString());
		System.out.println();

		System.out.println("Cursos Matriculados");
		System.out.println("====================================================");
		for (Curso curso : cursos) {
			System.out.println("Curso: " + curso.getNome());
			System.out.println("Turno: " + curso.getTurno());
			System.out.println("HorasPorAula: " + curso.getHorasPorAula());
			System.out.println("CargaHoraria: " + curso.getCargaHoraria());
			System.out.println("DataInicio: " + curso.getDataInicio());
			System.out.println("DataFinal: " + curso.getDataFim());
			System.out.println("------------------------------------------------");
		}
		System.out.println("====================================================");
		System.out.println();

		System.out.println();
		System.out.println("FIM DAS INFORMAÇÕES DO ALUNO");

	}
}
