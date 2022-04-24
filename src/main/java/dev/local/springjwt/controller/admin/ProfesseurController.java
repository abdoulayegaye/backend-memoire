package dev.local.springjwt.controller.admin;

import dev.local.springjwt.dao.ProfesseurDao;
import dev.local.springjwt.model.Professeur;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/admin/prof")
public class ProfesseurController {
    final private ProfesseurDao professeurService;
    public ProfesseurController(ProfesseurDao professeurService) {
        this.professeurService = professeurService;
    }

    @GetMapping()
    public List<Professeur> index(){

        return this.professeurService.findAll();
    }
}
