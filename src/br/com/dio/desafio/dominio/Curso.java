package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: "
                + getTitulo()
                + ". Descrição: "
                + getDescricao()
                + ". Carga horária: "
                + getCargaHoraria()
                + "h.";
    }

}
