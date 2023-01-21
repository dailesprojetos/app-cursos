package escola.model.inteface;

public interface Tributos {
	
	public Double calculaInss(double salario);
	public Double calculaIR(double salario);
	public Double calculaValeRefeicao(double salario);
	public Double calculaValeTransporte(double salario);        

}
