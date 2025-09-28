import java.util.ArrayList;
import java.util.List;

public class City48 {
    private final String name;
    private final List<Path48> paths = new ArrayList<>();

    // Конструктор только с названием
    public City48(String name) {
        this.name = name;
    }

    // Конструктор с названием и готовым списком путей
    public City48(String name, List<Path48> initialPaths) {
        this.name = name;
        this.paths.addAll(initialPaths);
    }

    public String getName() {
        return name;
    }

    public City48 addPath(City48 to, int cost) {
        paths.add(new Path48(to, cost));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ");
        for (int i = 0; i < paths.size(); i++) {
            sb.append(paths.get(i));
            if (i < paths.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
