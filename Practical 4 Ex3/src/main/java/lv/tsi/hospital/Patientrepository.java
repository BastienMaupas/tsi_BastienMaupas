package lv.tsi.hospital;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Patientrepository extends CrudRepository<Patient, Long> {
}
