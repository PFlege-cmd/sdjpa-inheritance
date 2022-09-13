package guru.springframework.sdjpainheritence.inheritance.msuper;

import jakarta.persistence.Entity;

@Entity
public class ExtendedClass extends BaseClass{

    private boolean isExisting;

    public ExtendedClass(){

    }

    public ExtendedClass(boolean isExisting) {
        this.isExisting = isExisting;
    }

    public boolean isExisting() {
        return isExisting;
    }

    public void setExisting(boolean existing) {
        isExisting = existing;
    }
}
