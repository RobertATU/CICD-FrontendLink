package ie.atu.cicdfrontend;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "db-link",url = "http://localhost:8081/pins")
public interface DatabaseClient {
    @PostMapping("/createPin")
    Void createPin(@RequestBody Pins pins);

    @GetMapping()
     List<Pins> findAll();
    @DeleteMapping("/removePin/{sheepId}")
    Pins deleteBySheepId(@PathVariable String sheepId);
}
