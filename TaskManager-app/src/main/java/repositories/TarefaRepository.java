package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}