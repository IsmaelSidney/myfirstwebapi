package dio.myfirstwebapi.repository;

import dio.myfirstwebapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if (usuario.getId() == null) {
            System.out.println("SAVE Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE Recebendo o Usuário na canada de repositório");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id Recebendo o id: Xd para excluir um usuário", id));
        System.out.println(id);

    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios =  new ArrayList<>();
        usuarios.add(new Usuario( "gleyson", "password"));
        usuarios.add(new Usuario( "frank",  "masterpass"));

        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("Find/id Recebendo o id: Xd para excluir un usuário%n", id);
        return new Usuario( "gleyson", "password");
    }

    public Usuario  findByUserName(String username) {
        System.out.printf("DELETE/id Recebendo o id: Xd para excluir un usuário%n", username);
        return new Usuario( "gleyson", "password");
    }


}
