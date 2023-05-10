package tcc.etec.bn.TesteTCC.MODEL;

import java.util.Objects;

public class turmas {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        turmas turmas = (turmas) o;
        return id.equals(turmas.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private Integer id;
    private String turma;

}
