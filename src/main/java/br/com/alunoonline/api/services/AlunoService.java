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

    public Optional<Aluno> update(Long id, Aluno aluno) {
        return alunoRepository.findById(id).map(alunoExistente -> {
            if (aluno.getName() != null) {
                alunoExistente.setName(aluno.getName());
            }

            if (aluno.getEmail() != null) {
                alunoExistente.setEmail(aluno.getEmail());
            }

            return alunoRepository.save(alunoExistente);

        });
    }

    public void delete(Long id) {
        alunoRepository.deleteById(id);
    }
}
