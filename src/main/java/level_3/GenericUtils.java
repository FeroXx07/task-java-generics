package level_3;

public class GenericUtils {
    public static <T extends Phone> void usePhone(T phone) {
        phone.call();
    }

    public static <T extends Smartphone> void useSmartphone(T smartphone) {
        smartphone.call();
        smartphone.takePhoto();
    }
}
