package ie.atu.cicdfrontend;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinsService {
    private final DatabaseClient databaseClient;

    public PinsService(DatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    public void createPin(Pins pins) {

        databaseClient.createPin(pins);
    }

    public List<Pins> allPins() {
        return databaseClient.findAll();
    }
}
