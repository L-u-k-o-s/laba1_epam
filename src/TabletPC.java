import java.util.Objects;

public class TabletPC {
    private int bateryCapacity;
    private int displayInches;
    private int memoryROM;
    private int flashMemory;
    private String color;

    public TabletPC() {
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "bateryCapacity=" + bateryCapacity +
                ", displayInches=" + displayInches +
                ", memoryROM=" + memoryROM +
                ", flashMemory=" + flashMemory +
                ", color='" + color + '\'' +
                '}';
    }

    public void setBateryCapacity(int bateryCapacity) {
        this.bateryCapacity = bateryCapacity;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public void setFlashMemory(int flashMemory) {
        this.flashMemory = flashMemory;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return getBateryCapacity() == tabletPC.getBateryCapacity() &&
                getDisplayInches() == tabletPC.getDisplayInches() &&
                getMemoryROM() == tabletPC.getMemoryROM() &&
                getFlashMemory() == tabletPC.getFlashMemory() &&
                Objects.equals(getColor(), tabletPC.getColor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getBateryCapacity(), getDisplayInches(), getMemoryROM(), getFlashMemory(), getColor());
    }

    public int getBateryCapacity() {
        return bateryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public int getFlashMemory() {
        return flashMemory;
    }

    public String getColor() {
        return color;
    }

    public TabletPC(int bateryCapacity, int displayInches, int memoryROM, int flashMemory, String color) {
        this.bateryCapacity = bateryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemory = flashMemory;
        this.color = color;
    }
}
