/**
 * Este arquivo PODE ser alterado.
 */
 
package plano;

public class Prova extends Aula implements Avaliacao {
	private double peso;

	public Prova(double peso, String descricao) {
		super.setDescricao(descricao);
		this.peso = peso;
	}
	
	public Prova(double peso, 
	             String descricao,
	             int cargaHoraria) {
		super.setDescricao(descricao);
		this.peso = peso;
		super.setCargaHoraria(cargaHoraria);
	}
	
	@Override
	public String getTipo() {
		return "Prova";
	}
	
	@Override
	public double getPeso() {
		return this.peso;
	}
}