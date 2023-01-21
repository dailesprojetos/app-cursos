package escola.model.inteface;

public interface Tributos {
	
	Double calculaInss(Double salario);
	Double calculaIR(Double salario);
	Double calculaValeRefeicao(Double salario);
	Double calculaValeTransporte(Double salario);        

}
