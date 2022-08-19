package model.entities;

public class Curso extends Conteudo{

    private Integer cargahoraria;
    public Integer getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(Integer cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    @Override
    public String toString() {
        return "Curso [cargahoraria=" + cargahoraria + ", descricao=" + getDescricao() + ", titulo=" + getTitulo() + "]";
    }
    @Override
    public double calcularXp() {

        return XP_PADRAO + 20d;
    }

    

}
