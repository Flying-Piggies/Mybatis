package utility;

import org.junit.Test;

import java.util.UUID;

@SuppressWarnings("all")
public class IDutils {
//    随机生成ID
    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
