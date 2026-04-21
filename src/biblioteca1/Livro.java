package biblioteca1;

public class Livro extends Publicacao {

    private int num_edicao;
    private String nm_editora;
    private String ISBN;

    public Livro(int num_edicao, String nm_editora, String ISBN, String dt_publicacao, String titulo, double valorMulta) {
        super(dt_publicacao, titulo, valorMulta);
        this.num_edicao = num_edicao;
        this.nm_editora = nm_editora;
        this.ISBN = ISBN;
    }

    public void getInfo() {
        System.out.println("Informações:" + "Data: " + getDt_publicacao() + " | " + "Titulo: " + getTitulo() + " | " + "numero da edição: " + getNum_edicao() + " | " + "nome da editora: " + getNm_editora() + " | " + "ISBN: " + getISBN());
    }

    /**
     * @return the num_edicao
     */
    public int getNum_edicao() {
        return num_edicao;
    }

    /**
     * @param num_edicao the num_edicao to set
     */
    public void setNum_edicao(int num_edicao) {
        this.num_edicao = num_edicao;
    }

    /**
     * @return the nm_editora
     */
    public String getNm_editora() {
        return nm_editora;
    }

    /**
     * @param nm_editora the nm_editora to set
     */
    public void setNm_editora(String nm_editora) {
        this.nm_editora = nm_editora;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}