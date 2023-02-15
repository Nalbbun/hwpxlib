package kr.dogfoot.hwpxlib.object.content.header_xml.references.charpr;

import kr.dogfoot.hwpxlib.object.common.HWPXObject;

/**
 * 언어별 값
 *
 * @param <ValueType> 값의 타입
 */
public abstract class ValuesByLanguage<ValueType, ChildType> extends HWPXObject {
    /**
     * 한글을 위한 값
     */
    private ValueType hangul;
    /**
     * 영문자를 위한 값
     */
    private ValueType latin;
    /**
     * 한자를 위한 값
     */
    private ValueType hanja;
    /**
     * 일본어를 위한 값
     */
    private ValueType japanese;
    /**
     * 기타 문자를 위한 값
     */
    private ValueType other;
    /**
     * 특수 문자를 위한 값
     */
    private ValueType symbol;
    /**
     * 사용자 정의 문자를 위한 값
     */
    private ValueType user;

    public ValueType hangul() {
        return hangul;
    }

    public void hangul(ValueType hangul) {
        this.hangul = hangul;
    }

    public ChildType hangulAnd(ValueType hangul) {
        this.hangul = hangul;
        return (ChildType) this;
    }

    public ValueType latin() {
        return latin;
    }

    public void latin(ValueType latin) {
        this.latin = latin;
    }

    public ChildType latinAnd(ValueType latin) {
        this.latin = latin;
        return (ChildType) this;
    }

    public ValueType hanja() {
        return hanja;
    }

    public void hanja(ValueType hanja) {
        this.hanja = hanja;
    }

    public ChildType hanjaAnd(ValueType hanja) {
        this.hanja = hanja;
        return (ChildType) this;
    }

    public ValueType japanese() {
        return japanese;
    }

    public void japanese(ValueType japanese) {
        this.japanese = japanese;
    }

    public ChildType japaneseAnd(ValueType japanese) {
        this.japanese = japanese;
        return (ChildType) this;
    }

    public ValueType other() {
        return other;
    }

    public void other(ValueType other) {
        this.other = other;
    }

    public ChildType otherAnd(ValueType other) {
        this.other = other;
        return (ChildType) this;
    }

    public ValueType symbol() {
        return symbol;
    }

    public void symbol(ValueType symbol) {
        this.symbol = symbol;
    }

    public ChildType symbolAnd(ValueType symbol) {
        this.symbol = symbol;
        return (ChildType) this;
    }

    public ValueType user() {
        return user;
    }

    public void user(ValueType user) {
        this.user = user;
    }

    public ChildType userAnd(ValueType user) {
        this.user = user;
        return (ChildType) this;
    }
}