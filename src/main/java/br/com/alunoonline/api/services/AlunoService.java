package br.com.alunoonline.api.services;

import br.com.alunoonline.api.models.Aluno;
import br.com.alunoonline.api.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class
AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Iterable<Aluno> index() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> findById(Long id) {
        return alunoRepository.findById(id);
    }

    public void create(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public void delete(Long id) {
        alunoRepository.deleteById(id);
    }
}
