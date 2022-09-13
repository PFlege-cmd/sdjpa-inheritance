package guru.springframework.sdjpainheritence.inheritance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.springframework.sdjpainheritence.inheritance.jointable.ElectricalPiano;

public interface ElectricalPianoRepository extends JpaRepository<ElectricalPiano, Long> {
}
