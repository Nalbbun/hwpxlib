package kr.dogfoot.hwpxlib.object.content.section_xml.enumtype;

public enum VideoType {
    /**
     * 컴퓨터의 동영상
     */
    LOCAL("LOCAL"),
    /**
     * 인터넷 동영상
     */
    WEB("WEB");

    private String str;

    VideoType(String str) {
        this.str = str;
    }

    public String str() {
        return str;
    }

    public static VideoType fromString(String str) {
        if (str != null) {
            String STR = str.toUpperCase();
            for (VideoType item : values()) {
                if (item.str.equals(STR)) {
                    return item;
                }
            }
        }
        return null;
    }
}