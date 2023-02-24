package kr.dogfoot.hwpxlib.reader.section_xml.ctrl;

import kr.dogfoot.hwpxlib.object.common.HWPXObject;
import kr.dogfoot.hwpxlib.object.common.SwitchableObject;
import kr.dogfoot.hwpxlib.object.content.section_xml.SubList;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.ctrl.inner.NoteType;
import kr.dogfoot.hwpxlib.reader.common.ElementReader;
import kr.dogfoot.hwpxlib.reader.common.ElementReaderSort;
import kr.dogfoot.hwpxlib.reader.section_xml.SubListReader;
import kr.dogfoot.hwpxlib.reader.util.ValueConvertor;
import kr.dogfoot.hwpxlib.commonstirngs.AttributeNames;
import kr.dogfoot.hwpxlib.commonstirngs.ElementNames;
import org.xml.sax.Attributes;

public class FootNoteEndNoteReader extends ElementReader {
    private NoteType footNoteEndNote;

    @Override
    public ElementReaderSort sort() {
        return ElementReaderSort.FootNoteEndNote;
    }

    public void footNoteEndNote(NoteType footNoteEndNote) {
        this.footNoteEndNote = footNoteEndNote;
    }

    @Override
    protected void setAttribute(String name, String value) {
        switch (name) {
            case AttributeNames.number:
                footNoteEndNote.number(ValueConvertor.toInteger(value));
                break;
            case AttributeNames.suffixChar:
                footNoteEndNote.suffixChar(value);
                break;
            case AttributeNames.instId:
                footNoteEndNote.instId(value);
                break;
        }
    }

    @Override
    public void childElement(String name, Attributes attrs) {
        switch (name) {
            case ElementNames.hp_subList:
                footNoteEndNote.createSubList();
                subList(footNoteEndNote.subList(), name, attrs);
                break;
        }
    }

    @Override
    public HWPXObject childElementInSwitch(String name, Attributes attrs) {
        switch (name) {
            case ElementNames.hp_subList:
                SubList subList = new SubList();
                subList(subList, name, attrs);
                return subList;
        }
        return null;
    }

    private void subList(SubList subList, String name, Attributes attrs) {
        ((SubListReader) xmlFileReader().setCurrentEntryReader(ElementReaderSort.SubList))
                .subList(subList);

        xmlFileReader().startElement(name, attrs);
    }

    @Override
    public SwitchableObject switchableObject() {
        return footNoteEndNote;
    }
}
