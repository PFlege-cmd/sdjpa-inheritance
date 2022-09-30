package guru.springframework.sdjpainheritence.inheritance.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sdjpainheritence.inheritance.jointable.ElectricalPiano;
import guru.springframework.sdjpainheritence.inheritance.repositories.ElectricalPianoRepository;
import guru.springframework.sdjpainheritence.inheritance.repositories.VehicleRepository;
import guru.springframework.sdjpainheritence.inheritance.singletable.Car;
import guru.springframework.sdjpainheritence.inheritance.singletable.Truck;

@Component
public class InheritanceCommandLineRunner implements CommandLineRunner {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private ElectricalPianoRepository electricalPianoRepository;

    @Override public void run(String... args) throws
            Exception {
        var car = new Car();
        car.setMileage(10000);
        vehicleRepository.saveAndFlush(car);

        var truck = new Truck();
        truck.setMaxLoad(200);
        vehicleRepository.saveAndFlush(truck);

        var electricalPiano = new ElectricalPiano();
        electricalPiano.setNumberOfKeys(100);
        electricalPiano.setSynthetic(true);

        electricalPianoRepository.saveAndFlush(electricalPiano);
    }
}
