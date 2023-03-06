//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package school.management.practice.Drivers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.slf4j.Logger;

public class PropertiesDriver {
    InputStream readStream = null;
    Properties prop;
    String propFile = "Properties/";

    public PropertiesDriver(Logger logger, String propFileName) {
        try {
            this.readStream = this.getClass().getClassLoader().getResourceAsStream(this.propFile + propFileName);
            this.prop = new Properties();
            this.prop.load(this.readStream);
        } catch (IOException var4) {
            logger.error(String.format("%s", var4));
        }

    }
