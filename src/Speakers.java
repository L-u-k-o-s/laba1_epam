import java.util.Objects;

public class Speakers {
    private int powerConsumption;
    private int numberOfSpeakers;
    private double minFrequency;
    private double maxFrequency;
    private int cordLength;

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", minFrequency=" + minFrequency +
                ", maxFrequency=" + maxFrequency +
                ", cordLength=" + cordLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return getPowerConsumption() == speakers.getPowerConsumption() &&
                getNumberOfSpeakers() == speakers.getNumberOfSpeakers() &&
                getMinFrequency() == speakers.getMinFrequency() &&
                getMaxFrequency() == speakers.getMaxFrequency() &&
                getCordLength() == speakers.getCordLength();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPowerConsumption(), getNumberOfSpeakers(), getMinFrequency(), getMaxFrequency(), getCordLength());
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public double getMinFrequency() {
        return minFrequency;
    }

    public double getMaxFrequency() {
        return maxFrequency;
    }

    public int getCordLength() {
        return cordLength;
    }

    public Speakers(int powerConsumption, int numberOfSpeakers, int minFrequency, int maxFrequency, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
        this.cordLength = cordLength;
    }

    public Speakers() {
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setMinFrequency(double minFrequency) {
        this.minFrequency = minFrequency;
    }

    public void setMaxFrequency(double maxFrequency) {
        this.maxFrequency = maxFrequency;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }
}
