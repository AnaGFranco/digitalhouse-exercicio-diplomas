package com.exercicio.diplomas.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AlunoModel {

    @NotNull
    @NotEmpty(message = "A disciplina é obrigatório")
    String nome;
    List<DisciplinaModel> disciplinas;

}
