package sddtc.couple;

/**
 * Author tuijiang
 * Date 16/5/5
 */
public enum Encode {
    UNKNOWN(0),
    UTF8(1),
    GBK(2);
    private final int value;

    private Encode(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}