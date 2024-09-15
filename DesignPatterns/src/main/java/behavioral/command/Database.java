package behavioral.command;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

public final class Database {
    public static final AtomicInteger idGenerator = new AtomicInteger(0);
    private final Map<Integer, DBRecord> db = new HashMap<>();

    public int insert(DBRecord data) {
        int id = idGenerator.getAndIncrement();
        db.put(id, data);

        return id;
    }


    public void update(int id, DBRecord newData) {
        if (!db.containsKey(id)) {
            throw new NoSuchElementException("Element with id " + id + " is not found.");
        }

        db.put(id, newData);
    }

    public DBRecord getData(int id) {
        if (!db.containsKey(id)) {
            throw new NoSuchElementException("Element with id " + id + " is not found.");
        }

        return db.get(id);
    }
}
