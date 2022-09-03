package com.app.service.impl;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import com.app.service.CallService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;


@Service
public class CallServiceImpl implements CallService{

	@Value("${app.twillio.accountSID}")
	private String ACCOUNT_SID;
	
	@Value("${app.twillio.authToken}")
	private String AUTH_TOKEN;
	
	@Value("${app.twillio.fromPhoneNo}")
	private String from;
	
	@Value("${app.twillio.toPhoneNo}")
	private String to;
	
	@Override
	public void makeCall() {
		try {
			Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
			Call call = Call.creator(new PhoneNumber(to), 
					new PhoneNumber(from),
					URI.create("http://demo.twilio.com/docs/voice.xml"))
					.setStatusCallback(URI.create("http://postb.in/1234abcd"))
					.create();
			System.out.println(call);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
