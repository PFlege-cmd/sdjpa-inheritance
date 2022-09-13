package guru.springframework.sdjpainheritence.inheritance.singletable;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle{

    private Integer mileage;

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }
}
