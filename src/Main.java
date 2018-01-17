import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            DBCollections dbCollections = new DBCollections();
            dbCollections.readDB();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose number for search:\n1-Oven\n2-Laptop\n3-Refrigerator\n4-Vacuum Cleaner\n5-Tablet PC\n6-Speakers");
            int tmp = scanner.nextInt();
            switch (tmp) {
                case 1:
                    dbCollections.searchOven(1000, 10, -1, 60, 45.5, -1, 39.5, -1, -1, -1);
                    break;
                case 2:
                    dbCollections.searchLaptop(1, 3, "Windows", 4000, 8000, 1000, 1600, 1.2, 3.2, -1, -1);
                    break;
                case 3:
                    dbCollections.searchRefrigerator(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1);
                    break;
                case 4:
                    dbCollections.searchVacuumCleaner(-1, "", "", "", -1, 2950, -1, -1);
                    break;
                case 5:
                    dbCollections.searchTabletPC(-1,-1,-1,-1,-1,-1,-1,-1,"");
                    break;
                case 6:
                    dbCollections.searchSpeakers(-1,-1,-1,-1,-1,-1,-1);
                    break;
            }
        } catch (IOException ioe) {
            System.out.println("Что-то не так с вводом-выводом");
        }
    }
}
