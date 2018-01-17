import java.util.Objects;

public class Laptop {
    private double battery_capacity;
    private String os;
    private int memory_rom;
    private int system_memory;
    private double cpu;
    private int display_inchs;


    public Laptop(double battery_capacity, String os, int memory_rom, int system_memory, double cpu, int display_inchs) {
        this.battery_capacity = battery_capacity;
        this.os = os;
        this.memory_rom = memory_rom;
        this.system_memory = system_memory;
        this.cpu = cpu;
        this.display_inchs = display_inchs;
    }

    public Laptop() {
    }

    public void setBattery_capacity(double battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemory_rom(int memory_rom) {
        this.memory_rom = memory_rom;
    }

    public void setSystem_memory(int system_memory) {
        this.system_memory = system_memory;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public void setDisplay_inchs(int display_inchs) {
        this.display_inchs = display_inchs;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery_capacity=" + battery_capacity +
                ", os='" + os + '\'' +
                ", memory_rom=" + memory_rom +
                ", system_memory=" + system_memory +
                ", cpu=" + cpu +
                ", display_inchs=" + display_inchs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getBattery_capacity(), getBattery_capacity()) == 0 &&
                getMemory_rom() == laptop.getMemory_rom() &&
                getSystem_memory() == laptop.getSystem_memory() &&
                Double.compare(laptop.getCpu(), getCpu()) == 0 &&
                getDisplay_inchs() == laptop.getDisplay_inchs() &&
                Objects.equals(getOs(), laptop.getOs());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getBattery_capacity(), getOs(), getMemory_rom(), getSystem_memory(), getCpu(), getDisplay_inchs());
    }

    public double getBattery_capacity() {
        return battery_capacity;
    }

    public String getOs() {
        return os;
    }

    public int getMemory_rom() {
        return memory_rom;
    }

    public int getSystem_memory() {
        return system_memory;
    }

    public double getCpu() {
        return cpu;
    }

    public int getDisplay_inchs() {
        return display_inchs;
    }
}
