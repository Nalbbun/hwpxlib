package kr.dogfoot.hwpxlib.tool.textextractor;

import kr.dogfoot.hwpxlib.object.HWPXFile;
import kr.dogfoot.hwpxlib.object.common.HWPXObject;
import kr.dogfoot.hwpxlib.object.common.ObjectType;
import kr.dogfoot.hwpxlib.tool.textextractor.comm.CannotStartFromException;
import kr.dogfoot.hwpxlib.tool.textextractor.comm.ExtractorBase;
import kr.dogfoot.hwpxlib.tool.textextractor.comm.ExtractorManager;

import java.util.ArrayList;

public class TextExtractor {
    public static String extract(HWPXFile hwpxFile,
                                 TextExtractMethod objectExtractMethod,
                                 ArrayList<ObjectType> exceptedObjects,
                                 boolean insertParaHead,
                                 TextMarks textMarks) throws Exception {
        Parameter parameter = new Parameter(hwpxFile,
                objectExtractMethod,
                exceptedObjects,
                insertParaHead,
                textMarks);
        ExtractorBase extractor = new ExtractorManager(parameter).get(hwpxFile._objectType());
        if (extractor._objectType() == ObjectType.Unknown) {
            throw new CannotStartFromException(hwpxFile);
        }
        extractor.extract(hwpxFile);
        return parameter.result();
    }

    public static String extractFrom(HWPXObject from,
                                 TextExtractMethod objectExtractMethod,
                                 ArrayList<ObjectType> exceptedObjects,
                                 TextMarks textMarks) throws Exception {
        Parameter parameter = new Parameter(null,
                objectExtractMethod,
                exceptedObjects,
                false,
                textMarks);
        ExtractorBase extractor = new ExtractorManager(parameter).get(from._objectType());
        if (extractor._objectType() == ObjectType.Unknown) {
            throw new CannotStartFromException(from);
        }
        extractor.extract(from);
        return parameter.result();
    }
}
