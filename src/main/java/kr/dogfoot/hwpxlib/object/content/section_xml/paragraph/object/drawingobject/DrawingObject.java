package kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.drawingobject;

import kr.dogfoot.hwpxlib.object.common.HWPXObject;
import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.object.content.header_xml.references.borderfill.FillBrush;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.picture.LineShape;
import kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.shapecomponent.ShapeComponent;

public abstract class DrawingObject<ChildType> extends ShapeComponent<ChildType> {
    /**
     * 테두리/선 모양
     */
    private LineShape lineShape;
    /**
     * 채움 정보
     */
    private FillBrush fillBrush;
    /**
     * 글상자
     */
    private DrawText drawText;
    /**
     * 그림자 정보
     */
    private DrawingShadow shadow;

    @Override
    public HWPXObject createChildWithElementName(String name) {
        if (ObjectType.LineShape.equalElementName(name)) {
            return new LineShape();
        } else if (ObjectType.FillBrush.equalElementName(name)) {
            return new FillBrush();
        } else if (ObjectType.DrawText.equalElementName(name)) {
            return new DrawText();
        } else if (ObjectType.DrawingShadow.equalElementName(name)) {
            return new DrawingShadow();
        }
        return super.createChildWithElementName(name);
    }

    public LineShape lineShape() {
        return lineShape;
    }

    public void createLineShape() {
        lineShape = new LineShape();
    }

    public void removeLineShape() {
        lineShape = null;
    }

    public FillBrush fillBrush() {
        return fillBrush;
    }

    public void createFillBrush() {
        fillBrush = new FillBrush();
    }

    public void removeFillBrush() {
        fillBrush = null;
    }

    public DrawText drawText() {
        return drawText;
    }

    public void createDrawText() {
        drawText = new DrawText();
    }

    public void removeDrawText() {
        drawText = null;
    }

    public DrawingShadow shadow() {
        return shadow;
    }

    public void createShadow() {
        shadow = new DrawingShadow();
    }

    public void removeShadow() {
        shadow = null;
    }
}
