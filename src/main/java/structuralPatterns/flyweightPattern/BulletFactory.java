package structuralPatterns.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {

    private static final Map<String, BulletType> bulletMap = new HashMap<>();
    public static BulletType getBulletType(String texture, int speed, int size) {
       // "bullet.png" + 10 + 5 -> "bullet.png105"
        String key = texture + speed + size;
        if (!bulletMap.containsKey(key)) {
           bulletMap.put(key, new BulletType(texture, speed, size));
            System.out.println("Creating new bullet type: " + key);
        }
        return bulletMap.get(key);
    }
}
