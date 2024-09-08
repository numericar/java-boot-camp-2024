import java.math.BigDecimal;

public class WrapperClass {
    public static void main(String[] args) {
        basicWrapper();
        parseTechnuique();
    }

    // แปลงค่า string เป็น prinitive type โดยจะต้องแปลงเป็น refernece type ก้อร
    public static void parseTechnuique() {
        // แปลง string เป็น int
        Integer operand1 = Integer.parseInt("500");

        // เมื่อแปลงข้อมูลเสร็จ ให้ทำ auto unboxing
        int operand2 = Integer.parseInt("200");

        Boolean.parseBoolean("false");

    }

    public static void basicWrapper() {
        byte exOfByte = 100;
        Byte byteBoxing = Byte.valueOf(exOfByte); // Boxing นำข้อมูลที่เป็น primitive type มาใส่ในกล่องที่เป็น reference type
        System.out.println(byteBoxing.byteValue()); // unboxing นำข้อมูลที่เป็น reference type ทำให้กลายมาเป็น primitive type

        // example of auto boxing
        Byte autoBoxing = exOfByte;

        // exalple of auto unboxing
        System.out.println(autoBoxing);

        short exOfShort = 100;
        Short shortData = exOfShort;
        System.out.println(shortData);

        int exOfInt = 10;
        Integer integerData = exOfInt;
        System.out.println(integerData);

        double exOfDouble = 10;
        Double doubleData = exOfDouble;
        System.out.println(doubleData);

        // ใช้จัดการกับตัวเลขที่เป็นค่าเงิน
        BigDecimal exOfBigDecimal = new BigDecimal(100);
        System.out.println(exOfBigDecimal);

        Character characterData = 'D';
        System.out.println(Character.isDigit(characterData));

        boolean isEnable = true;
        Boolean booleanData = isEnable;
        System.out.println(booleanData);
    }
}
