package kr.dogfoot.hwpxlib.object.content.section_xml.paragraph.object.shapecomponent;

import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.object.common.baseobject.Matrix;

/**
 * 확대/축소 행렬
 */
public class ScaleMatrix extends Matrix<ScaleMatrix> {
    public ScaleMatrix() {
    }

    @Override
    public ObjectType objectType() {
        return ObjectType.ScaMatrix;
    }
}
