package br.com.alunoonline.api.services;

import br.com.alunoonline.api.models.Professor;
import br.com.alunoonline.api.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public Iterable<Professor> index() {
        return professorRepository.findAll();
    }

    public Optional<Professor> findById(Long id) {
        return professorRepository.findById(id);
    }

    public void create(Professor professor) {
        professorRepository.save(professor);
    }

    public Optional<Professor> update(Long id, Professor professor) {
        return professorRepository.findById(id).map(professorExistente -> {
            if (professor.getName() != null) {
                professorExistente.setName(professor.getName());
            }

            if (professor.getEmail() != null) {
                professorExistente.setEmail(professor.getEmail());
            }

            return professorRepository.save(professorExistente);

        });
    }

    public void delete(Long id) {
        professorRepository.deleteById(id);
    }
}
