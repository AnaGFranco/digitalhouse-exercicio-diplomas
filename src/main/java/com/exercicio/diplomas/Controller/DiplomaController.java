package com.exercicio.diplomas.Controller;

import com.exercicio.diplomas.Dto.DiplomaDto;
import com.exercicio.diplomas.Model.AlunoModel;
import com.exercicio.diplomas.Service.DiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DiplomaController {

    @Autowired
    DiplomaService diplomaService;

    @PostMapping("/aluno/media")
    public ResponseEntity<?> verificarDiploma(@RequestBody AlunoModel aluno){
       DiplomaDto media = diplomaService.media(aluno);
        return ResponseEntity.ok(media);
    }

}
