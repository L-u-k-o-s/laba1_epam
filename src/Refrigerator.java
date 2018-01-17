import java.util.Objects;

public class Refrigerator {
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity, int height, int width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public Refrigerator() {
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return getPowerConsumption() == that.getPowerConsumption() &&
                getWeight() == that.getWeight() &&
                getFreezerCapacity() == that.getFreezerCapacity() &&
                Double.compare(that.getOverallCapacity(), getOverallCapacity()) == 0 &&
                getHeight() == that.getHeight() &&
                getWidth() == that.getWidth();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPowerConsumption(), getWeight(), getFreezerCapacity(), getOverallCapacity(), getHeight(), getWidth());
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
