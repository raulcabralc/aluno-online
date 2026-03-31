package br.com.alunoonline.api.controllers;

import br.com.alunoonline.api.models.Aluno;
import br.com.alunoonline.api.repositories.AlunoRepository;
import br.com.alunoonline.api.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Aluno> index() {
        return alunoService.index();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Aluno> findById(@PathVariable Long id) {
        return alunoService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void criarAluno(@RequestBody Aluno aluno) {
        alunoService.create(aluno);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletarAluno(@PathVariable Long id) {
        alunoService.delete(id);
    }
}
