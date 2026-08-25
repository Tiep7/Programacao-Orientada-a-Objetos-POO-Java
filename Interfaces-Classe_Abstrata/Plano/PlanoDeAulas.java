/**
 * Importante: nao altere o arquivo PlanoDeAulas.java
 */

package plano;

public class PlanoDeAulas {
	Aula[] aulas = new Aula[5];
	int qtdAulas = 0;
	
	/**
	 * Observe que o metodo usa final. Isso significa que este metodo nao pode ser sobreposto (overrride).
	 */
	public final void adicionar(Aula a) {
		this.aulas[qtdAulas++] = a;
	}
	
	public void imprimir() {
		for (int i = 0; i < qtdAulas; i++) 
			System.out.println(String.format("- [%s] %s",
								this.aulas[i].getTipo(),
								this.aulas[i].getDescricao()));
	}

	public String getFormula() {
		String formula = "";
		for (int i = 0; i < this.qtdAulas; i++) {
			if (this.aulas[i] instanceof Avaliacao) {
				double peso = ((Avaliacao) this.aulas[i]).getPeso();
				String descricao = this.aulas[i].getDescricao();
				
				if (!formula.equals(""))
					formula += " + ";
				formula += String.format("%.1f x %s",
									 	peso,
										descricao);
			}
		}
		return formula;
	}
}