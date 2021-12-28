package com.exercicio.diplomas.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class DiplomaDto {
    String mensagem;
    double media;
    String aluno;
}
