package com.sddtc.utils.accounts.factory;

/**
 * @author sddtc
 *
 */
public class SendEmailFactory implements Provider{
	@Override
	public Sender produce() {
		return new EmailSender();
	}
}
