package br.com.alunoonline.api.controllers;

import br.com.alunoonline.api.models.Aluno;
import br.com.alunoonline.api.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

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
    public void create(@RequestBody Aluno aluno) {
        alunoService.create(aluno);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Aluno> update(@RequestBody Aluno aluno, @PathVariable Long id) { return alunoService.update(id, aluno); }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        alunoService.delete(id);
    }
}
