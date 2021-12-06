public class LeapYear {
    public static void main(String[] args) {
        int theYear = 2020;
        if (isLeapYear(theYear)) {
            System.out.println("Rok: " + theYear + " jest rokiem przestępnym");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

