package br.com.alunoonline.api.controllers;

import br.com.alunoonline.api.models.Aluno;
import br.com.alunoonline.api.repositories.AlunoRepository;
import br.com.alunoonline.api.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/")
    public Iterable<Aluno> index() {
        return alunoService.index();
    }
}
