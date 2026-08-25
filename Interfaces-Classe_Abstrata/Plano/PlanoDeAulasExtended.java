/**
 * Este arquivo PODE ser alterado.
 */
 
package plano;

public class PlanoDeAulasExtended extends PlanoDeAulas {
    private void removerAula(int indiceAula) {
	    for (int i = indiceAula; i < qtdAulas - 1; i++)
	        aulas[i] = aulas[i + 1];
	    qtdAulas--;
	}
	
	public void removerAvalicoes() {
	    int i = 0;
	    while (i < qtdAulas) {
	        if (aulas[i] instanceof Avaliacao) {
	            removerAula(i);
	        } else {
	            i++;
	        }
	    }
	}
    
    private int getCargaHorariaTotal() {
	    int total = 0;
	    for (int i = 0; i < qtdAulas; i++)
	        total += aulas[i].getCargaHoraria();
	    return total;
	}
    
    public int comparar(PlanoDeAulasExtended p) {
	    int atual = getCargaHorariaTotal();
	    int outro = p.getCargaHorariaTotal();
	    if (atual < outro)
	        return -1;
	    else if (atual > outro)
	        return 1;
	    else
	        return 0;
	}
    
    public static int compararPlanos(PlanoDeAulasExtended plano1,
                              PlanoDeAulasExtended plano2) {
        return plano1.comparar(plano2);
    }
    
    @Override
    public void imprimir() {
		for (int i = 0; i < qtdAulas; i++) 
			System.out.println(String.format("- [%s] %s (%dh)",
								this.aulas[i].getTipo(),
								this.aulas[i].getDescricao(),
								this.aulas[i].getCargaHoraria()));
	}
}