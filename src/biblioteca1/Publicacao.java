package biblioteca1;

import java.util.ArrayList;

public abstract class Publicacao {

    private String dt_publicacao;
    private String titulo;
    private double valorMulta;
    private boolean disponivel = true;

    private ArrayList<Autor> autores = new ArrayList<Autor>();
    private ArrayList<Publicacao> referencias = new ArrayList<Publicacao>();

    public Publicacao(String dt_publicacao, String titulo, double valorMulta) {
        this.dt_publicacao = dt_publicacao;
        this.titulo = titulo;
        this.valorMulta = valorMulta;
    }

    public abstract void getInfo();

    public void adicionarReferencia(Publicacao p) {
        referencias.add(p);
    }

    /**
     * @return the referencias
     */
    public ArrayList<Publicacao> getReferencias() {
        return referencias;
    }

    /**
     * @return the dt_publicacao
     */
    public String getDt_publicacao() {
        return dt_publicacao;
    }

    /**
     * @param dt_publicacao the dt_publicacao to set
     */
    public void setDt_publicacao(String dt_publicacao) {
        this.dt_publicacao = dt_publicacao;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autores
     */
    public ArrayList<Autor> getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    /**
     * @return the valorMulta
     */
    public double getValorMulta() {
        return valorMulta;
    }

    /**
     * @param valorMulta the valorMulta to set
     */
    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    /**
     * @return the disponivel
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * @param disponivel the disponivel to set
     */
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}