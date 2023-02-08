package kr.dogfoot.hwpxlib.reader.util;

public class ValueConvertor {
    private static final String True = "1";
    private static final String TrueText = "true";

    public static Boolean toBoolean(String value) {
        if (value == null) {
            return null;
        }
        return True.equals(value);
    }

    public static Boolean toBooleanText(String value) {
        if (value == null) {
            return null;
        }
        return TrueText.equalsIgnoreCase(value);
    }

    public static Integer toInteger(String value) {
        if (value == null) {
            return null;
        }
        return new Integer(value);
    }

    public static Short toShort(String value) {
        if (value == null) {
            return null;
        }
        return new Short(value);
    }

    public static Float toFloat(String value) {
        if (value == null) {
            return null;
        }
        return new Float(value);
    }

    public static Byte toByte(String value) {
        if (value == null) {
            return null;
        }
        return new Byte(value);
    }
}
