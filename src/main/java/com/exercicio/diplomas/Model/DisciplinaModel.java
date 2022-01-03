package com.exercicio.diplomas.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DisciplinaModel {

    @NotNull
    @NotEmpty(message = "A disciplina é obrigatório")
    String nome;

    @NotEmpty(message = "A nota é obrigatório")
    @Pattern(regexp = "[0-9]", flags = Pattern.Flag.UNICODE_CASE)
    double nota;

}
