package lv.tsi.hospital;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nurse {
    @JsonProperty
    @Id
    Long id;
    @JsonProperty
    String name;

    @JsonProperty
    String email;

}
