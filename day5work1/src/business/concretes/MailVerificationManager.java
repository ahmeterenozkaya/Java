package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.VerificationService;


public class MailVerificationManager implements VerificationService {

	CustomerCheckManager customerCheckManager;

	List<String> verificatedEmails = new ArrayList<String>();

	@Override
	public void verifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email + " başarıyla doğrulandı.");		
	}

	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email + " kullanıcısına doğrulama mail'i gönderildi.");
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if (verificatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

	

}
