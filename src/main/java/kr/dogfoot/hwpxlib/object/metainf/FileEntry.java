package kr.dogfoot.hwpxlib.object.metainf;

import kr.dogfoot.hwpxlib.object.common.HWPXObject;
import kr.dogfoot.hwpxlib.object.common.SwitchableObject;
import kr.dogfoot.hwpxlib.object.common.ObjectType;

public class FileEntry extends SwitchableObject {
    /**
     * 패키지 내부에 경로
     */
    private String fullPath;
    /**
     * 파일의 mime 타입
     */
    private String mediaType;
    /**
     * 원본 파일의 크기
     */
    private Integer size;
    /**
     * 암호화 정보
     */
    private EncryptionData encryptionData;

    public FileEntry() {
    }

    @Override
    public ObjectType objectType() {
        return ObjectType.FileEntry;
    }

    @Override
    public HWPXObject createChildWithElementName(String name) {
        if (ObjectType.EncryptionData.equalElementName(name)) {
            return new EncryptionData();
        }
        return null;
    }

    public String fullPath() {
        return fullPath;
    }

    public void fullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public FileEntry fullPathAnd(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    public String mediaType() {
        return mediaType;
    }

    public FileEntry mediaTypeAnd(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    public void mediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Integer size() {
        return size;
    }

    public void size(Integer size) {
        this.size = size;
    }

    public FileEntry sizeAnd(Integer size) {
        this.size = size;
        return this;
    }


    public EncryptionData encryptionData() {
        return encryptionData;
    }

    public void createEncryptionData() {
        encryptionData = new EncryptionData();
    }

    public void removeEncryptionData() {
        encryptionData = null;
    }
}
