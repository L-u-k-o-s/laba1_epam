import javafx.scene.control.Tab;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class DBCollections {
    private List<Oven> ovens;
    private List<Laptop> laptops;
    private List<Refrigerator> refrigerators;
    private List<VacuumCleaner> vacuumCleaners;
    private List<TabletPC> tabletPCs;
    private List<Speakers> speakers;

    public DBCollections() {
        ovens = new ArrayList<>(3);
        laptops = new ArrayList<>(3);
        refrigerators = new ArrayList<>(3);
        vacuumCleaners = new ArrayList<>(3);
        tabletPCs = new ArrayList<>(3);
        speakers = new ArrayList<>(3);
    }

    public void searchOven(int power_consumption,//max
                           int weight,//max
                           int capacityMIN, int capacityMAX,
                           double depthMIN, double depthMAX,
                           double heightMIN, double heightMAX,
                           double widthMIN, double widthMAX) {
        for (Oven oven : ovens) {
            if (power_consumption == -1 || power_consumption >= oven.getPower_consumption()) {
                if (weight == -1 || weight >= oven.getWeight())
                    if (capacityMIN == -1 || capacityMIN <= oven.getCapacity())
                        if (capacityMAX == -1 || capacityMAX >= oven.getCapacity())
                            if (depthMIN == -1 || depthMIN <= oven.getDepth())
                                if (depthMAX == -1 || depthMAX >= oven.getDepth())
                                    if (heightMIN == -1 || heightMIN <= oven.getHeight())
                                        if (heightMAX == -1 || heightMAX >= oven.getHeight())
                                            if (widthMIN == -1 || widthMIN <= oven.getWidth())
                                                if (widthMAX == -1 || widthMAX >= oven.getWidth())
                                                    System.out.println(oven);

            }
        }
    }

    public void searchLaptop(double battery_capacityMIN, double battery_capacityMAX,
                             String os,
                             int memory_romMIN, int memory_romMAX,
                             int system_memoryMIN, int system_memoryMAX,
                             double cpuMIN, double cpuMAX,
                             int display_inchsMIN, int display_inchsMAX) {

        for (Laptop laptop : laptops) {
            if (battery_capacityMAX == -1 || laptop.getBattery_capacity() <= battery_capacityMAX)
                if (battery_capacityMIN == -1 || laptop.getBattery_capacity() >= battery_capacityMIN)
                    if (os.equals("") || os.equals(laptop.getOs()))
                        if (memory_romMIN == -1 || laptop.getMemory_rom() >= memory_romMIN)
                            if (memory_romMAX == -1 || laptop.getMemory_rom() <= memory_romMAX)
                                if (system_memoryMIN == -1 || laptop.getSystem_memory() >= system_memoryMIN)
                                    if (system_memoryMAX == -1 || laptop.getSystem_memory() <= system_memoryMAX)
                                        if (cpuMIN == -1 || laptop.getCpu() >= cpuMIN)
                                            if (cpuMAX == -1 || laptop.getCpu() <= cpuMAX)
                                                if (display_inchsMIN == -1 || laptop.getDisplay_inchs() >= display_inchsMIN)
                                                    if (display_inchsMAX == -1 || laptop.getDisplay_inchs() <= display_inchsMAX)
                                                        System.out.println(laptop);


        }
    }

    public void searchRefrigerator(int powerConsumption,//max
                                   int weight,//max
                                   int freezerCapacityMIN, int freezerCapacityMAX,
                                   double overallCapacityMIN, double overallCapacityMAX,
                                   int heightMIN, int heightMAX,
                                   int widthMIN, int widthMAX) {
        for (Refrigerator refrigerator : refrigerators) {
            if (powerConsumption == -1 || refrigerator.getPowerConsumption() <= powerConsumption)
                if (weight == -1 || refrigerator.getWeight() <= weight)
                    if (freezerCapacityMIN == -1 || refrigerator.getFreezerCapacity() >= freezerCapacityMIN)
                        if (freezerCapacityMAX == -1 || refrigerator.getFreezerCapacity() <= freezerCapacityMAX)
                            if (overallCapacityMIN == -1 || refrigerator.getOverallCapacity() >= overallCapacityMIN)
                                if (overallCapacityMAX == -1 || refrigerator.getOverallCapacity() <= overallCapacityMAX)
                                    if (heightMIN == -1 || refrigerator.getHeight() >= heightMIN)
                                        if (heightMAX == -1 || refrigerator.getHeight() <= heightMAX)
                                            if (widthMIN == -1 || refrigerator.getWidth() >= widthMIN)
                                                if (widthMAX == -1 || refrigerator.getWidth() <= widthMAX)
                                                    System.out.println(refrigerator);


        }
    }

    public void searchVacuumCleaner(int powerConsumption,//max
                                    String filterType,
                                    String bagType,
                                    String wandType,
                                    int motorSpeedRegulationMIN, int motorSpeedRegulationMAX,
                                    int cleaningWidthMIN, int cleaningWidthMAX) {

        for (VacuumCleaner vacuumCleaner : vacuumCleaners) {
            if (powerConsumption == -1 || vacuumCleaner.getPowerConsumption() <= powerConsumption)
                if (filterType.equals("") || filterType.equals(vacuumCleaner.getFilterType()))
                    if (bagType.equals("") || bagType.equals(vacuumCleaner.getBagType()))
                        if (wandType.equals("") || wandType.equals(vacuumCleaner.getWandType()))
                            if (motorSpeedRegulationMIN == -1 || vacuumCleaner.getMotorSpeedRegulation() >= motorSpeedRegulationMIN)
                                if (motorSpeedRegulationMAX == -1 || vacuumCleaner.getMotorSpeedRegulation() <= motorSpeedRegulationMAX)
                                    if (cleaningWidthMIN == -1 || vacuumCleaner.getCleaningWidth() >= cleaningWidthMIN)
                                        if (cleaningWidthMAX == -1 || vacuumCleaner.getCleaningWidth() <= cleaningWidthMAX)
                                            System.out.println(vacuumCleaner);


        }
    }


    public void searchTabletPC(int bateryCapacityMIN, int bateryCapacityMAX,
                               int displayInchesMIN, int displayInchesMAX,
                               int memoryROMMIN, int memoryROMMAX,
                               int flashMemoryMIN, int flashMemoryMAX,
                               String color) {

        for (TabletPC tabletPC : tabletPCs) {
            if (bateryCapacityMAX == -1 || tabletPC.getBateryCapacity() <= bateryCapacityMAX)
                if (bateryCapacityMIN == -1 || tabletPC.getBateryCapacity() >= bateryCapacityMIN)
                    if (color.equals("") || color.equals(tabletPC.getColor()))
                        if (memoryROMMIN == -1 || tabletPC.getMemoryROM() >= memoryROMMIN)
                            if (memoryROMMAX == -1 || tabletPC.getMemoryROM() <= memoryROMMAX)
                                if (flashMemoryMIN == -1 || tabletPC.getFlashMemory() >= flashMemoryMIN)
                                    if (flashMemoryMAX == -1 || tabletPC.getFlashMemory() <= flashMemoryMAX)
                                        if (displayInchesMIN == -1 || tabletPC.getDisplayInches() >= displayInchesMIN)
                                            if (displayInchesMAX == -1 || tabletPC.getDisplayInches() <= displayInchesMAX)
                                                System.out.println(tabletPC);


        }
    }

    public void searchSpeakers(int powerConsumption,//max
                               int numberOfSpeakersMIN, int numberOfSpeakersMAX,
                               double minFrequency, double maxFrequency,
                               int cordLengthMIN, int cordLengthMAX) {
        for (Speakers speaker : speakers) {
            if (powerConsumption == -1 || speaker.getPowerConsumption() <= powerConsumption)
                if (numberOfSpeakersMIN == -1 || speaker.getNumberOfSpeakers() >= numberOfSpeakersMIN)
                    if (numberOfSpeakersMAX == -1 || speaker.getNumberOfSpeakers() <= numberOfSpeakersMAX)
                        if (minFrequency == -1 || speaker.getMinFrequency() >= minFrequency)
                            if (maxFrequency == -1 || speaker.getMaxFrequency() <= maxFrequency)
                                if (cordLengthMIN == -1 || speaker.getCordLength() >= cordLengthMIN)
                                    if (cordLengthMAX == -1 || speaker.getCordLength() <= cordLengthMAX)
                                        System.out.println(speaker);
        }
    }

    public void readDB() throws IOException {
        Scanner fileScanner = new Scanner(new File("appliances_db.txt")).useDelimiter(";");
        Scanner strScanner;
        Scanner helpScanner;
        Oven oven;
        Laptop laptop;
        Speakers speaker;
        Refrigerator refrigerator;
        VacuumCleaner vacuumCleaner;
        TabletPC tabletPC;

        while (fileScanner.hasNext()) {
            strScanner = new Scanner(fileScanner.next().trim()).useDelimiter("[:,= \n\r]+").useLocale(Locale.US);

            switch (strScanner.next().trim()) {
                case "Oven":
                    strScanner.next();
                    oven = new Oven();
                    oven.setPower_consumption(strScanner.nextInt());
                    strScanner.next();
                    oven.setWeight(strScanner.nextInt());
                    strScanner.next();
                    oven.setCapacity(strScanner.nextInt());
                    strScanner.next();
                    oven.setDepth(strScanner.nextDouble());
                    strScanner.next();
                    oven.setHeight(strScanner.nextDouble());
                    strScanner.next();
                    oven.setWidth(strScanner.nextDouble());
                    ovens.add(oven);
                    break;
                case "Laptop":
                    strScanner.next();
                    laptop = new Laptop();
                    laptop.setBattery_capacity(strScanner.nextDouble());
                    strScanner.next();
                    laptop.setOs(strScanner.next());
                    strScanner.next();
                    laptop.setMemory_rom(strScanner.nextInt());
                    strScanner.next();
                    laptop.setSystem_memory(strScanner.nextInt());
                    strScanner.next();
                    laptop.setCpu(strScanner.nextDouble());
                    strScanner.next();
                    laptop.setDisplay_inchs(strScanner.nextInt());
                    laptops.add(laptop);

                    break;
                case "Refrigerator":
                    strScanner.next();
                    refrigerator = new Refrigerator();
                    refrigerator.setPowerConsumption(strScanner.nextInt());
                    strScanner.next();
                    refrigerator.setWeight(strScanner.nextInt());
                    strScanner.next();
                    refrigerator.setFreezerCapacity(strScanner.nextInt());
                    strScanner.next();
                    refrigerator.setOverallCapacity(strScanner.nextDouble());
                    strScanner.next();
                    refrigerator.setHeight(strScanner.nextInt());
                    strScanner.next();
                    refrigerator.setWidth(strScanner.nextInt());
                    refrigerators.add(refrigerator);

                    break;
                case "VacuumCleaner":
                    strScanner.next();
                    vacuumCleaner = new VacuumCleaner();
                    vacuumCleaner.setPowerConsumption(strScanner.nextInt());
                    strScanner.next();
                    vacuumCleaner.setFilterType(strScanner.next());
                    strScanner.next();
                    vacuumCleaner.setBagType(strScanner.next());
                    strScanner.next();
                    vacuumCleaner.setWandType(strScanner.next());
                    strScanner.next();
                    vacuumCleaner.setMotorSpeedRegulation(strScanner.nextInt());
                    strScanner.next();
                    vacuumCleaner.setCleaningWidth(strScanner.nextInt());
                    vacuumCleaners.add(vacuumCleaner);

                    break;
                case "TabletPC":
                    strScanner.next();
                    tabletPC = new TabletPC();
                    tabletPC.setBateryCapacity(strScanner.nextInt());
                    strScanner.next();
                    tabletPC.setDisplayInches(strScanner.nextInt());
                    strScanner.next();
                    tabletPC.setMemoryROM(strScanner.nextInt());
                    strScanner.next();
                    tabletPC.setFlashMemory(strScanner.nextInt());
                    strScanner.next();
                    tabletPC.setColor(strScanner.next());
                    tabletPCs.add(tabletPC);

                    break;
                case "Speakers":
                    strScanner.next();
                    speaker = new Speakers();
                    speaker.setPowerConsumption(strScanner.nextInt());
                    strScanner.next();
                    speaker.setNumberOfSpeakers(strScanner.nextInt());
                    strScanner.next();
                    helpScanner = new Scanner(strScanner.next()).useDelimiter("-").useLocale(Locale.US);
                    speaker.setMinFrequency(helpScanner.nextDouble());
                    speaker.setMaxFrequency(helpScanner.nextDouble());
                    strScanner.next();
                    speaker.setCordLength(strScanner.nextInt());

                    speakers.add(speaker);

                    break;

            }

        }

    }
}
