public class Path {
    private final City city;
    private final int cost;

    public Path(City city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    public City getCity() {
        return city;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return city.getName() + ":" + cost; // пара "название:стоимость"
    }
}
