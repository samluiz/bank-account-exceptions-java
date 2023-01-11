package model.exceptions;

public class WithdrawLimitException extends Exception {
    public WithdrawLimitException(String msg) {
        super(msg);
    }
}
