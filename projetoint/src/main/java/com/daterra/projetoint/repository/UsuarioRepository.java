package com.daterra.projetoint.repository;

	import java.util.Optional;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
    import com.daterra.projetoint.model.Usuario;
	
	@Repository
	public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByLogin(String login);
	
	}
	
	
	

