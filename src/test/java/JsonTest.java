import com.fasterxml.jackson.databind.ObjectMapper;
import model.JsonFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;


public class JsonTest {
    private ClassLoader cl = JsonTest.class.getClassLoader();

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void checkJsonFileTest() throws Exception {
        try (InputStream is = cl.getResourceAsStream("JsonFile.json")) {
            assert is != null;
            try (InputStreamReader isr = new InputStreamReader(is)) {
                JsonFile data;
                data = objectMapper.readValue(isr, JsonFile.class);
                Assertions.assertEquals("Alpha team", data.getSquadName());
                Assertions.assertEquals("City-17", data.getCity());
                Assertions.assertEquals(2016, data.getFormed());
                Assertions.assertEquals("Defeat Enclave", data.getGoal());
                Assertions.assertEquals(true, data.isActive());
                Assertions.assertEquals(List.of("Alex Vane",
                        "Gordon Freeman",
                        "John Doe"), data.getMembers());
            }
        }
    }
}