package ie.atu.cicdfrontend;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "db-link",url = "${feign.url}")
public interface DatabaseClient {
    @PostMapping("/createPin")
    Void createPin(@RequestBody Pins pins);

    @GetMapping()
     List<Pins> findAll();
    @DeleteMapping("/removePin/{sheepId}")
    Pins deleteBySheepId(@PathVariable String sheepId);
}
