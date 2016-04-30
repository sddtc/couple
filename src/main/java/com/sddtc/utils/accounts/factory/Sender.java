package com.sddtc.utils.accounts.factory;

/**
 * @author sddtc
 *
 */
public interface Sender {
	/**
	 * 发送
	 * @param email email
	 * @param auth auth-code
	 */
	public void send(String email, String auth);
}
