package br.com.alunoonline.api.services;

import br.com.alunoonline.api.models.Professor;
import br.com.alunoonline.api.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public Iterable<Professor> index() {
        return professorRepository.findAll();
    }

    public Optional<Professor> findById(Long id) {
        return professorRepository.findById(id);
    }

    public void create(Professor professor) {
        professorRepository.save(professor);
    }

    public Professor update(Long id, Professor professor) { return professorRepository.save(professor); }

    public void delete(Long id) {
        professorRepository.deleteById(id);
    }
}
