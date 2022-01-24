package collectionsset;

import java.util.Objects;

public class RightAnswer {

    private String solver;

    public RightAnswer(String solver) {
        this.solver = solver;
    }

    public String getSolver() {
        return solver;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        RightAnswer other = (RightAnswer) obj;
        return other.getSolver().equals(this.solver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(solver);
    }
}
