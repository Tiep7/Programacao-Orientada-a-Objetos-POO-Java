public class Porta {
    private String nome = "Porta sem nome";
    private boolean aberta = true;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public boolean estaAberta(){
      return aberta;
    }
    public int abrir(){
        if (!aberta) {
            aberta = true;
            return 0;
        }
        return 1;
        
    }
    public int fechar() {
        if (aberta) {
            aberta = false;
            return 0;
        }
        return 1;
        
    }
}
