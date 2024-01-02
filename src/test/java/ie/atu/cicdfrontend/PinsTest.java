package ie.atu.cicdfrontend;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PinsTest {
    private final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = validatorFactory.getValidator();

    @Test
    public void testValidPin(){
        Pins pins = new Pins();
        pins.setSheepId("newSheep");
        pins.setLongitude(20.321);
        pins.setLatitude(20.123);
       assertTrue(validator.validate(pins).isEmpty());
    }
    @Test
    public void testInvalidPin(){
        Pins pins = new Pins();
        pins.setSheepId("");
        pins.setLongitude(2000.321);
        pins.setLatitude(20000.123);
        assertEquals(3,validator.validate(pins).size());
    }

}
