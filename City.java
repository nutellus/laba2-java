import java.util.ArrayList;
import java.util.List;

public class City {
    private final String name;
    private final List<Path> paths = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public City addPath(City to, int cost) {
        paths.add(new Path(to, cost));
        return this; // чтобы можно было цепочкой
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ");
        for (int i = 0; i < paths.size(); i++) {
            sb.append(paths.get(i)); // Path сам печатает "Город:стоимость"
            if (i < paths.size() - 1) sb.append(", ");
        }
        return sb.toString();
    }
}
