package sddtc.couple;

/**
 * Author tuijiang
 * Date 16/5/5
 */
public class BaseResult {
    private ResultCode resultCode = ResultCode.OK;
    private Encode encode = Encode.UTF8;

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public Encode getEncode() {
        return encode;
    }

    public void setEncode(Encode encode) {
        this.encode = encode;
    }
}
