package escola.model;

import java.time.LocalDate;

import escola.model.enums.SituacaoFunCadastro;
import escola.model.heranca.Pessoa;
import escola.model.inteface.Tributos;

public class Funcionario extends Pessoa implements Tributos {

	private String cargo;
	private Integer cargaHoraria;
	private Double salario;
	private SituacaoFunCadastro situacaoFunCadastro;

	public Funcionario() {
	}

	public Funcionario(Long id, String nome, LocalDate dataDeAniversario, Endereco endereco, Contato contato,
			String cargo, Integer cargaHoraria, Double salario, SituacaoFunCadastro situacaoFunCadastro) {
		super(id, nome, dataDeAniversario, endereco, contato);
		this.cargo = cargo;
		this.cargaHoraria = cargaHoraria;
		this.salario = salario;
		this.situacaoFunCadastro = situacaoFunCadastro;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public SituacaoFunCadastro getSituacaoFunCadastro() {
		return situacaoFunCadastro;
	}

	public void setSituacaoFunCadastro(SituacaoFunCadastro situacaoFunCadastro) {
		this.situacaoFunCadastro = situacaoFunCadastro;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", cargaHoraria=" + cargaHoraria + ", salario=" + salario
				+ ", situacaoFunCadastro=" + situacaoFunCadastro + ", id=" + id + ", nome=" + nome
				+ ", dataDeAniversario=" + dataDeAniversario + ", endereco=" + endereco + ", contato=" + contato + "]";
	}

	@Override
	public Double calculaInss(double salario) {

		Double calculo = (salario <= 1302.00) ? salario = salario * 0.075
				: (salario >= 1302.01 || salario <= 2271.29) ? salario = salario * 0.09
						: (salario >= 2271.29 || salario <= 3856.94) ? salario = salario * 0.12
								: (salario >= 3856.95 || salario <= 7507.49) ? salario = salario * 0.14 : 0.0;

		return calculo; 
	}

	@Override
	public Double calculaIR(double salario) {

		if (salario >= 1903.99 || salario <= 2826.65)
			salario = salario * 0.075;
		else if (salario >= 2826.66 || salario <= 3751.05)
			salario = salario * 0.15;
		else if (salario >= 3751.06 || salario <= 4664.68)
			salario = salario * 0.225;
		return salario;
		
	}

	@Override
	public Double calculaValeRefeicao(double salario) {
		return salario * 0.10;
	}

	@Override
	public Double calculaValeTransporte(double salario) {
		return salario * 0.06;
	}

	public Double calculoSalarioFinal() {
		Double calculoDescontos = calculaInss(salario) + calculaIR(salario) + calculaValeRefeicao(salario)
				+ calculaValeTransporte(salario);
		return this.salario - calculoDescontos;
	}

}
