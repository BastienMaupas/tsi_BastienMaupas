package lv.tsi.hospital;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Nurserepository extends CrudRepository<Nurse, Long> {
}
