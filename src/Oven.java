import java.util.Objects;

public class Oven {
    private int power_consumption;
    private int weight;
    private int capacity;
    private double depth;
    private double height;
    private double width;

    public Oven() {
    }

    public Oven(int power_consumption, int weight, int capacity, int depth, double height, double width) {
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public void setPower_consumption(int power_consumption) {
        this.power_consumption = power_consumption;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return getPower_consumption() == oven.getPower_consumption() &&
                getWeight() == oven.getWeight() &&
                getCapacity() == oven.getCapacity() &&
                getDepth() == oven.getDepth() &&
                Double.compare(oven.getHeight(), getHeight()) == 0 &&
                Double.compare(oven.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPower_consumption(), getWeight(), getCapacity(), getDepth(), getHeight(), getWidth());
    }

    public int getPower_consumption() {
        return power_consumption;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
