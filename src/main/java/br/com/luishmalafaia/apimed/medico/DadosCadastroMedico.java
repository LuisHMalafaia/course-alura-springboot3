package br.com.luishmalafaia.apimed.medico;

import br.com.luishmalafaia.apimed.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
