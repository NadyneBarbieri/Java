package com.nadyne.api.medico;

import com.nadyne.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosaAtualizacaoMedico(@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {
}
