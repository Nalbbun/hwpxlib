package kr.dogfoot.hwpxlib.object.content.header_xml.enumtype;

public enum TargetApplicationSort {
    WordProcessor("WORDPROCESSOR"),
    Presentation("PRESENTATION"),
    SpreadSheet("SPREADSHEET");

    private String str;

    TargetApplicationSort(String str) {
        this.str = str;
    }

    public String str() {
        return str;
    }

    public static TargetApplicationSort fromString(String str) {
        if (str != null) {
            String STR = str.toUpperCase();
            for (TargetApplicationSort item : values()) {
                if (item.str.equals(STR)) {
                    return item;
                }
            }
        }
        return null;
    }
}
