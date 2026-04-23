package biblioteca1;

public class Tese extends Publicacao {
    private int num_paginas;
    private String resumo;
    private String dt_defesa;
    private String instituicao;

    public Tese(int num_paginas, String resumo, String dt_defesa, String instituicao, String dt_publicacao, String titulo, double valorMulta) {
        super(dt_publicacao, titulo, valorMulta);
        this.num_paginas = num_paginas;
        this.resumo = resumo;
        this.dt_defesa = dt_defesa;
        this.instituicao = instituicao;
    }

    public void getInfo() {
        System.out.println("Informações: Data: " + getDt_publicacao() + " | Titulo: " + getTitulo() + " | Número de páginas: " + getNum_paginas() + " | Resumo: " + getResumo() + " | Data da defesa: " + getDt_defesa() + " | Instituição: " + getInstituicao());
    }

    /**
     * @return the autor
     */
    public Autor getAutor() {
        return getAutores().get(0);
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Autor autor) {
        getAutores().clear();
        getAutores().add(autor);
    }

    /**
     * @return the num_paginas
     */
    public int getNum_paginas() {
        return num_paginas;
    }

    /**
     * @param num_paginas the num_paginas to set
     */
    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
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

    /**
     * @return the dt_defesa
     */
    public String getDt_defesa() {
        return dt_defesa;
    }

    /**
     * @param dt_defesa the dt_defesa to set
     */
    public void setDt_defesa(String dt_defesa) {
        this.dt_defesa = dt_defesa;
    }

    /**
     * @return the instituicao
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     * @param instituicao the instituicao to set
     */
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}