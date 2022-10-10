package com.sptech.atividade.com.testes;

public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos = 0;
    private Integer quantidadeDeHoraExtra = 0;

    public Hospital(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }

    public void realizarPagamento(Medico medico, Double valorPago) {

        if (medico != null && valorPago != null) {

            if (medico.getAtivo() == true) {

                if (valorPago > 0) {

                    medico.setSalario(medico.getSalario() + valorPago);

                    quantidadeDePagamentos++;

                } else {

                    System.out.println("Digite um valor positivo.");

                }

            } else {

                System.out.println("O Medico responsavel deve estar ativo.");

            }

        } else {

            System.out.println("Digite um valor antes.");

        }

    }

    public void realizarPagamento(Medico medico, Double valorPago, Double horaExtra) {

        if (medico != null && valorPago != null) {

            if (medico.getAtivo() == true) {

                if (valorPago > 0) {

                    if (horaExtra != null && horaExtra > 0) {

                        medico.setSalario(medico.getSalario() + horaExtra + valorPago);

                        quantidadeDeHoraExtra++;

                        quantidadeDePagamentos++;

                    } else {

                        System.out.println("Digite um valor valido.");

                    }

                } else {

                    System.out.println("Digite um valor positivo.");

                }

            } else {

                System.out.println("O Medico responsavel deve estar ativo.");

            }

        } else {

            System.out.println("Adicione um valor.");

        }

    }

    public void desligarMedico(Medico medico) {

        if (medico != null) {

            if (medico.getAtivo() == true) {

                medico.setAtivo(Boolean.FALSE);

            } else {

                System.out.println("O médico já esta desativado.");

            }

        } else {

            System.out.println("Adicione o nome de um médico.");

        }

    }

}
