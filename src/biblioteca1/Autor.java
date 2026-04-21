package biblioteca1;

public class Autor {
    private String nome;
    private String titularidade;

    public Autor(String nome, String titularidade) {
        this.nome = nome;
        this.titularidade = titularidade;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the titularidade
     */
    public String getTitularidade() {
        return titularidade;
    }

    /**
     * @param titularidade the titularidade to set
     */
    public void setTitularidade(String titularidade) {
        this.titularidade = titularidade;
    }
}