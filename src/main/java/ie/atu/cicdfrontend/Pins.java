package ie.atu.cicdfrontend;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pins {

    private Long Id;

    @NotBlank
    private String sheepId;
    @DecimalMin(value = "-90.0",message = "Latitude must be between -90 and 90")
    @DecimalMax(value = "90.0",message = "Latitude must be between -90 and 90")
    private double latitude;

    @DecimalMin(value = "-180.0",message = "Latitude must be between -180 and 180")
    @DecimalMax(value = "180.0",message = "Latitude must be between -180 and 180")
    private double longitude;

    @PastOrPresent
    private LocalDate date;
}
