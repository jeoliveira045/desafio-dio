package model.entities;

public class Curso {
    private String titulo;
    private String descricao;
    private Integer cargahoraria;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Integer getCargahoraria() {
        return cargahoraria;
    }
    public void setCargahoraria(Integer cargahoraria) {
        this.cargahoraria = cargahoraria;
    }
    @Override
    public String toString() {
        return "Curso [cargahoraria=" + cargahoraria + ", descricao=" + descricao + ", titulo=" + titulo + "]";
    }

    

}
