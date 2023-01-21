package escola.model;

import java.time.LocalDate;

public class Curso {
	
	private String nome;
	private String turno;
	private Integer horasPorAula;
	private Integer cargaHoraria;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	
	public Curso() {
	}

	public Curso(String nome, String turno, Integer horasPorAula, Integer cargaHoraria, LocalDate dataInicio, LocalDate dataFim) {
		this.nome = nome;
		this.turno = turno;
		this.horasPorAula = horasPorAula;
		this.cargaHoraria = cargaHoraria;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public Integer getHorasPorAula() {
		return horasPorAula;
	}

	public void setHorasPorAula(Integer horasPorAula) {
		this.horasPorAula = horasPorAula;
	}
	
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", turno=" + turno + ", horasPorAula=" + horasPorAula + ", cargaHoraria="
				+ cargaHoraria + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
	}

}
