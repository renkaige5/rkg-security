/**
 * 
 */
package com.rkg.security.core.validate.code.sms;

/**
 * @author zhailiang
 *
 */
public interface SmsCodeSender {
	
	void send(String mobile, String code);

}
