package com.sddtc.utils.accounts.factory;

/**
 * @author sddtc
 *
 */
public interface Provider {
    /**
     * @return
     */
    public Sender produce();
}
