package com.nadyne.api.paciente;

import com.nadyne.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosaAtualizacaoPaciente(@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {
}
