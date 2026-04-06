package br.com.alunoonline.api.controllers;

import br.com.alunoonline.api.models.Professor;
import br.com.alunoonline.api.services.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Professor> index() {
        return professorService.index();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Professor> findById(@PathVariable Long id) {
        return professorService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Professor professor) {
        professorService.create(professor);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Professor> update(@RequestBody Professor professor, @PathVariable Long id) { return professorService.update(id, professor); }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        professorService.delete(id);
    }
}
