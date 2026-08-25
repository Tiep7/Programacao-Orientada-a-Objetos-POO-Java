/**
 * Este arquivo PODE ser alterado.
 */

package plano;

public class Teorica extends Aula {
	public Teorica(String descricao) {
		super.setDescricao(descricao);
	}
	
	public Teorica(String descricao,
	    int cargaHoraria) {
		super.setDescricao(descricao);
		super.setCargaHoraria(cargaHoraria);
	}

	@Override
	public String getTipo() {
		return "Teorica";
	}
}