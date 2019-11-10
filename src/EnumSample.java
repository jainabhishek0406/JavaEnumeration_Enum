/**
 * @author Abhishek Jain
 *
 * enum is same as class, that contains only constant value and
 * counted from 0 onwards.
 * to retrieve enum value, we need to use values() method.
 */

enum Days{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class EnumSample {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        Days daysArray[] = Days.values();
        for (Days d:daysArray)
            System.out.println(d);

        Days enumValue = Days.FRIDAY;
        System.out.println("\nenumValue = " + enumValue);

        Days strValue = Days.valueOf("MONDAY");
        System.out.println("\nstrValue = " + strValue);
    }
}
