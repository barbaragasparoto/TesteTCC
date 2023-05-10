package tcc.etec.bn.TesteTCC.MODEL;

import java.util.Objects;

public class permicoes {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        permicoes permicoes = (permicoes) o;
        return id.equals(permicoes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private Integer idusuario;

}
