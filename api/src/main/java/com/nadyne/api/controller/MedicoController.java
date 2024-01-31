package com.nadyne.api.controller;

import com.nadyne.api.medico.DadosCadastroMedico;
import com.nadyne.api.medico.DadosListagemMedico;
import com.nadyne.api.medico.Medico;
import com.nadyne.api.medico.MedicoRepository;
import com.nadyne.api.paciente.DadosListagemPaciente;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }
    @GetMapping                          //ordena como os dados virao no metodo get
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 10, sort={"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }

}
