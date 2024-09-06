package structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FlyweightFactory {

    Map<String, Flyweight> flyweightMap = new ConcurrentHashMap<>();

    public Flyweight getFlyweight(String name) {
        flyweightMap.computeIfAbsent(name, x -> new Flyweight(name, 123));

        return flyweightMap.get(name);
    }
}
