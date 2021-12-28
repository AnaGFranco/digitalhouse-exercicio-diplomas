package com.exercicio.diplomas.Service;

import com.exercicio.diplomas.Dto.DiplomaDto;
import com.exercicio.diplomas.Model.AlunoModel;
import com.exercicio.diplomas.Model.DisciplinaModel;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.concurrent.atomic.AtomicReference;

@Service
public class DiplomaService {

    public DiplomaDto media(AlunoModel alunos){
        List<DisciplinaModel> disciplinas = alunos.getDisciplinas();

        AtomicReference<Double> somaMedia = new AtomicReference<>((double) 0);

//        BinaryOperator<Double> binaryOperator = (x, y) -> x + y / disciplinas.size();

        disciplinas.stream().forEach((disciplina)-> {
            somaMedia.accumulateAndGet(disciplina.getNota(), Double::sum);
        });

        Double media = somaMedia.get() / disciplinas.size();

        DiplomaDto mensagem;

       if (media >= 9){
           mensagem =  DiplomaDto.builder().aluno(alunos.getNome()).media(media).mensagem("Parabens você é incrivel!!").build();
       }else {
           mensagem =  DiplomaDto.builder().aluno(alunos.getNome()).media(media).mensagem("Parabens!").build();
       }

        return mensagem;
    }
}
