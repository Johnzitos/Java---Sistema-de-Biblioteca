package biblioteca1;

import java.util.ArrayList;

public abstract class Usuario {
    private String Nome;
    private String telefone;
    private String email;
    private String cpf;
    protected ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public Usuario(String Nome, String telefone, String email, String cpf) {
        this.Nome = Nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public abstract boolean podeEmprestar();

    public void adicionarEmprestimo(Emprestimo e) {
        emprestimos.add(e);
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}