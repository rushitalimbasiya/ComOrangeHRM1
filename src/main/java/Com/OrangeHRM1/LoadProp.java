package Com.OrangeHRM1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    static Properties prop;
    static FileInputStream inputStream;

    public String getproperty(String key) {
        prop = new Properties();
        try {
            inputStream = new FileInputStream("src\\test\\Resourcer\\config.properties");
            prop.load(inputStream);
            inputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);

    }



}
