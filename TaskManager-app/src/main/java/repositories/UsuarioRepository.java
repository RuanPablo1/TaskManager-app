package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}