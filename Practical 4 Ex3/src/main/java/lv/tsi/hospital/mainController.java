package lv.tsi.hospital;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class mainController {

        @Autowired
        private Patientrepository patientrepository;
        @Autowired
        private Nurserepository nurserepository;

        @GetMapping(path = "/getCourses")
        public ResponseEntity<Iterable<Patient>> getPatients() {
            return new ResponseEntity<>(patientrepository.findAll(), HttpStatus.OK);
        }



        @GetMapping(path = "/getSchedule")
        public ResponseEntity<Iterable<Nurse>> getNurse() {
            return new ResponseEntity<>(Nurserepository.findAll(), HttpStatus.OK);
        }


}
