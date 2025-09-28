public class Path48 {
    private final City48 city;
    private final int cost;

    public Path48(City48 city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    public City48 getCity() {
        return city;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return city.getName() + ":" + cost;
    }
}
