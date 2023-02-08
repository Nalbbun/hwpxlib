package kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.secpr.notepr;

import kr.dogfoot.hwpxlib.object.common.HWPXObject;
import kr.dogfoot.hwpxlib.object.common.ObjectType;

/**
 * 미주 모양
 */
public class EndNotePr extends NoteShape {
    /**
     * 번호 매김 방식
     */
    private EndNoteNumbering numbering;
    /**
     * 미주 위치
     */
    private EndNotePlacement placement;

    public EndNotePr() {
    }

    @Override
    public ObjectType objectType() {
        return ObjectType.EndNotePr;
    }

    @Override
    public HWPXObject createChildWithElementName(String name) {
        if (ObjectType.EndNoteNumbering.equalElementName(name)) {
            return new EndNoteNumbering();
        } else if (ObjectType.EndNotePlacement.equalElementName(name)) {
            return new EndNotePlacement();
        }
        return super.createChildWithElementName(name);
    }

    public EndNoteNumbering numbering() {
        return numbering;
    }

    public void createNumbering() {
        numbering = new EndNoteNumbering();
    }

    public void removeNumbering() {
        numbering = null;
    }

    public EndNotePlacement placement() {
        return placement;
    }

    public void createPlacement() {
        placement = new EndNotePlacement();
    }

    public void removePlacement() {
        placement = null;
    }
}
