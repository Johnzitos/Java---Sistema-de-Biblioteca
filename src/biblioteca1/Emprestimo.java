package biblioteca1;

public class Emprestimo {
    private Publicacao publicacao;
    private Usuario usuario;
    private int renovacoes = 0;
    private boolean devolvido = false;

    public Emprestimo(Publicacao publicacao, Usuario usuario) {
        this.publicacao = publicacao;
        this.usuario = usuario;
        this.publicacao.setDisponivel(false);
    }

    public void renovar() {
        renovacoes = renovacoes + 1;
        System.out.println("Renovação Atualizada");
    }

    public double devolver() {
        double multaCalculada = 0;

        if (renovacoes > 3) {
            int renovacoesExtras = renovacoes - 3;
            multaCalculada = renovacoesExtras * this.publicacao.getValorMulta();
        }

        this.publicacao.setDisponivel(true);
        this.devolvido = true;

        System.out.println("O usuário deve pagar: " + multaCalculada);

        return multaCalculada;
    }

    /**
     * @return the devolvido
     */
    public boolean isDevolvido() {
        return devolvido;
    }

    /**
     * @return the publicacao
     */
    public Publicacao getPublicacao() {
        return publicacao;
    }

    /**
     * @param publicacao the publicacao to set
     */
    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the renovacoes
     */
    public int getRenovacoes() {
        return renovacoes;
    }

    /**
     * @param renovacoes the renovacoes to set
     */
    public void setRenovacoes(int renovacoes) {
        this.renovacoes = renovacoes;
    }
}