package biblioteca1;


public class Artigo extends Publicacao{
    private String resumo;

    public Artigo(String resumo, String dt_publicacao, String titulo, double valorMulta) {
        super(dt_publicacao, titulo, valorMulta);
        this.resumo = resumo;
    }
    

    
public void getInfo() {
    System.out.println("Informações: Data: " + getDt_publicacao() + " | Titulo: " + getTitulo() + " | Resumo: " + getResumo());
}

    /**
     * @return the resumo
     */
    public String getResumo() {
        return resumo;
    }

    /**
     * @param resumo the resumo to set
     */
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
}