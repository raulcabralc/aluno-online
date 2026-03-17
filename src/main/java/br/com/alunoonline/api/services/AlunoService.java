package br.com.alunoonline.api.services;

import br.com.alunoonline.api.models.Aluno;
import br.com.alunoonline.api.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Iterable<Aluno> index() {
        return alunoRepository.findAll();
    }
}
