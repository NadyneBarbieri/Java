package com.nadyne.api.medico;


import com.nadyne.api.endereco.Endereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, Endereco endereco) {
}