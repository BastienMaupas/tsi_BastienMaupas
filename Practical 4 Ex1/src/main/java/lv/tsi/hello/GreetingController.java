package lv.tsi.hello;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public ResponseEntity<List<Greeting>> getGreeting() {
        List<Greeting> Greetings = new ArrayList<>();
        Greetings.add(new Greeting("Hello, my name is Spring"));

        return ResponseEntity.ok(Greetings);
    }
}
