package sddtc.couple;

/**
 * Author tuijiang
 * Date 16/5/5
 */
public enum ResultCode {
    OK(0),
    UNKNOWN(1),
    BAD_PARAMETER(11),
    NO_RESULT(100),
    EXPERIMENT_NOT_EXIST(102),
    PLACEMENT_NOT_EXIST(103),
    DEPENDENT_SERVICE_FAIL(201),
    PARTIAL_FAILED(202);
    private final int value;

    private ResultCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static ResultCode findByValue(int value) {
        switch (value) {
            case 0:
                return OK;
            case 1:
                return UNKNOWN;
            case 11:
                return BAD_PARAMETER;
            case 100:
                return NO_RESULT;
            case 102:
                return EXPERIMENT_NOT_EXIST;
            case 103:
                return PLACEMENT_NOT_EXIST;
            case 201:
                return DEPENDENT_SERVICE_FAIL;
            case 202:
                return PARTIAL_FAILED;
            default:
                return null;
        }
    }
}
