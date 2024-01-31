package com.nadyne.api.medico;


import com.nadyne.api.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(

        @NotBlank // para verificar se o camo esta vindo vazio ou null.
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,7}") //  expressao regular para verificar se é de 4 a 7 digitos
        String crm,
        @NotNull // por que nao é String
        Especialidade especialidade,
        @NotNull
        @Valid
        DadosEndereco endereco) {
}
