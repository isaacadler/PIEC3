import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.io.i2c.I2C;
import com.pi4j.io.i2c.I2CConfig;

public class PN532 {
    private static final int ENDERECO_I2C = 0x24;

    private Context pi4j;
    private I2C i2c;

    public void iniciar() {

        pi4j = Pi4J.newAutoContext();

        I2CConfig config = I2C.newConfigBuilder(pi4j)
                .id("PN532")
                .bus(1)
                .device(ENDERECO_I2C)
                .build();

        i2c = pi4j.create(config);

        System.out.println("I2C conectado ao PN532.");
    }

    public String lerUID() {

        return null;
    }
}