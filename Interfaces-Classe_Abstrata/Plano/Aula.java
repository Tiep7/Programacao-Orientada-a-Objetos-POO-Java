package plano;

public abstract class Aula {
	private String descricao;
	private int cargaHoraria = 2;

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

	public String getDescricao() {
		return this.descricao;
	}
	
	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public abstract String getTipo();
}
