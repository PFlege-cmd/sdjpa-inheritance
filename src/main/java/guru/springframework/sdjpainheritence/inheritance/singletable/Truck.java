package guru.springframework.sdjpainheritence.inheritance.singletable;

import jakarta.persistence.Entity;

@Entity
public class Truck extends Vehicle {

    private Integer maxLoad;

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }
}
