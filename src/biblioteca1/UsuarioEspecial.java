package biblioteca1;

public class UsuarioEspecial extends Usuario {

    public UsuarioEspecial(String Nome, String telefone, String email, String cpf) {
        super(Nome, telefone, email, cpf);
    }

    public boolean podeEmprestar() {
        return true;
    }
}