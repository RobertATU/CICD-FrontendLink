package ie.atu.cicdfrontend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest(PinsController.class)

public class PinsControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private PinsService pinsService;

    @Test
    public void allPinsTest() throws Exception{

    } 
}

