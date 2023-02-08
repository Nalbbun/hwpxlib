package kr.dogfoot.hwpxlib.object.content.header_xml.enumtype;

public enum UnderlineType {
    NONE("NONE"),
    TOP("TOP"),
    BOTTOM("BOTTOM");

    private String str;

    UnderlineType(String str) {
        this.str = str;
    }

    public String str() {
        return str;
    }

    public static UnderlineType fromString(String str) {
        if (str != null) {
            String STR = str.toUpperCase();
            for (UnderlineType item : values()) {
                if (item.str.equals(STR)) {
                    return item;
                }
            }
        }
        return null;
    }
}
