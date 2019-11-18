package pkg17_03_hapburg;

public abstract class PhoneNumber {

    public abstract int price(int perc, int mp);

    public static PhoneNumber create(String phoneNumber) {
        String car;
        boolean jo = false;

        String keres[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < phoneNumber.length(); i++) {
            car = phoneNumber.substring(i, i + 1);
            jo = false;
            for (int j = 0; j <= 9; j++) {
                if (car.equals(keres[j])) {
                    jo = true;
                }
            }
            if (!jo) {
                return null;
            }
        }

        if (phoneNumber.startsWith("1")) {
            return new KwakPhoneNumber();
        }
        if (phoneNumber.startsWith("999")) {
            return new McChipPhoneNumber();
        }
        if (phoneNumber.startsWith("88")) {
            return new IkiPhoneNumber();
        } else {
            return null;
        }
    }

}
