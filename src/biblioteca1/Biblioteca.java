package biblioteca1;

import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private String endereco;
    private ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    
    public void adicionarPublicacao(Publicacao novaPublicacao) {
    publicacoes.add(novaPublicacao);
}
    public void mostrarAcervo(String docBusca) {
        Publicacao publicacao = null;
        for (Publicacao p : publicacoes) {
                if (p.getTitulo().equals(docBusca)) {
                   p.getInfo();
                    
                    break;
                }
            }
        }

public Publicacao buscarPublicacao(String tituloBusca) {
        for (Publicacao p : publicacoes) {
            if (p.getTitulo().equals(tituloBusca)) {
               
                return p;
            }
        }
       
        return null;
    }
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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}