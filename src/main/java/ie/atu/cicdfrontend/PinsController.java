package ie.atu.cicdfrontend;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/pins")
@RestController
public class PinsController {
    private final PinsService pinsService;

    public PinsController(PinsService pinsService) {
        this.pinsService = pinsService;
    }
    @GetMapping()
    public List<Pins> allPins(){
        return pinsService.allPins();
    }


    @PostMapping("/createPin")
    public ResponseEntity<String> create(@Valid @RequestBody Pins pins){

        pinsService.createPin(pins);
        return new ResponseEntity<>("Pin created successfully", HttpStatus.OK);
    }
}
