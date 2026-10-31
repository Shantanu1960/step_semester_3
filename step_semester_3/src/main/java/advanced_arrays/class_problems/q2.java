package advanced_arrays.class_problems;
import java.util.*;
import java.time.*;

abstract class LibraryItem {
    abstract int getDays();
}

class Book extends LibraryItem {
    int getDays() {
        return 14;
    }
}

class DVD extends LibraryItem {
    int getDays() {
        return 7;
    }
}

class Magazine extends LibraryItem {
    int getDays() {
        return 3;
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, LibraryItem> types = new HashMap<>();
        types.put("BOOK", new Book());
        types.put("DVD", new DVD());
        types.put("MAGAZINE", new Magazine());

        LocalDate current = LocalDate.of(2023, 10, 26);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            int start = line.indexOf('"');
            int end = line.lastIndexOf('"');

            String typ = line.substring(0, start).trim();
            String title = line.substring(start + 1, end);

            LibraryItem item = types.get(typ);

            LocalDate due = current.plusDays(item.getDays());

            System.out.println(title + ": " + due);
        }

        sc.close();
    }
}
