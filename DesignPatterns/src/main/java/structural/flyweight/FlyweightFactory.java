package structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FlyweightFactory {

    Map<String, Flyweight> flyweightMap = new ConcurrentHashMap<>();

    public Flyweight getFlyweight(String name) {
        flyweightMap.computeIfAbsent(name, _ -> new Flyweight(name, 123));

        return flyweightMap.get(name);
    }
}
