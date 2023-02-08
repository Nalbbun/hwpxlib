package kr.dogfoot.hwpxlib.object.content.masterpage_xml.enumtype;

/**
 * 바탕쪽이 적용되는 페이지
 */
public enum MasterPageType {
    BOTH("BOTH"),
    EVEN("EVEN"),
    ODD("ODD"),
    LAST_PAGE("LAST_PAGE"),
    OPTIONAL_PAGE("OPTIONAL_PAGE");

    private String str;

    MasterPageType(String str) {
        this.str = str;
    }

    public String str() {
        return str;
    }

    public static MasterPageType fromString(String str) {
        if (str != null) {
            String STR = str.toUpperCase();
            for (MasterPageType item : values()) {
                if (item.str.equals(STR)) {
                    return item;
                }
            }
        }
        return null;
    }
}
