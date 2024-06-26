package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate cargaHoraria;

    public Mentoria(String titulo, String descricao, LocalDate cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria: "
                + getTitulo()
                + ". Descrição: "
                + getDescricao()
                + ". Data: "
                + getCargaHoraria();
    }
}
