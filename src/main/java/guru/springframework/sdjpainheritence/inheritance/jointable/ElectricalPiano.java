package guru.springframework.sdjpainheritence.inheritance.jointable;

import jakarta.persistence.Entity;

@Entity
public class ElectricalPiano extends Piano {

    private boolean isSynthetic;

    public boolean isSynthetic() {
        return isSynthetic;
    }

    public void setSynthetic(boolean synthetic) {
        isSynthetic = synthetic;
    }
}
