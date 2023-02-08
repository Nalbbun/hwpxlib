package kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.secpr.notepr;

import kr.dogfoot.hwpxlib.object.common.HWPXObject;
import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.object.common.SwitchableObject;

public abstract class NoteShape extends SwitchableObject {
    /**
     * 자동 번호 포맷
     */
    private AutoNumFormat autoNumFormat;
    /**
     * 구분선 정보
     */
    private NoteLine noteLine;
    /**
     * 여백 정보
     */
    private NoteSpacing noteSpacing;

    public AutoNumFormat autoNumFormat() {
        return autoNumFormat;
    }

    @Override
    public HWPXObject createChildWithElementName(String name) {
        if (ObjectType.AutoNumFormat.equalElementName(name)) {
            return new AutoNumFormat();
        } else if (ObjectType.NoteLine.equalElementName(name)) {
            return new NoteLine();
        } else if (ObjectType.NoteSpacing.equalElementName(name)) {
            return new NoteSpacing();
        }
        return null;
    }

    public void createAutoNumFormat() {
        autoNumFormat = new AutoNumFormat();
    }

    public void removeAutoNumFormat() {
        autoNumFormat = new AutoNumFormat();
    }

    public NoteLine noteLine() {
        return noteLine;
    }

    public void createNoteLine() {
        noteLine = new NoteLine();
    }

    public void removeNoteLine() {
        noteLine = null;
    }

    public NoteSpacing noteSpacing() {
        return noteSpacing;
    }

    public void createNoteSpacing() {
        noteSpacing = new NoteSpacing();
    }

    public void removeNoteSpacing() {
        noteSpacing = null;
    }
}
