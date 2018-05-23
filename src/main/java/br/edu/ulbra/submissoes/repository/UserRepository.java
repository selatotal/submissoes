package br.edu.ulbra.submissoes.repository;

import br.edu.ulbra.submissoes.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
