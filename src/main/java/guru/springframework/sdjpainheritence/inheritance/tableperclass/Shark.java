package guru.springframework.sdjpainheritence.inheritance.tableperclass;

import jakarta.persistence.Entity;

@Entity
public class Shark extends Fish {

    private Integer numberOfTeeth;

    public Shark() {

    }

    public Shark(Integer numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public Integer getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(Integer numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }
}
