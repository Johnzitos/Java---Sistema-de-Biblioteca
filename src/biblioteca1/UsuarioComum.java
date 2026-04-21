package biblioteca1;

public class UsuarioComum extends Usuario {

    public UsuarioComum(String Nome, String telefone, String email, String cpf) {
        super(Nome, telefone, email, cpf);
    }

    public boolean podeEmprestar() {
        for (Emprestimo e : emprestimos) {
            if (!e.isDevolvido()) {
                return false;
            }
        }
        return true;
    }
}