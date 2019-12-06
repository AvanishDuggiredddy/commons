package io.mosip.resident.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IdAuthService {

	public boolean validateOtp(String transactionID, String individualId, String individualIdType, String otp);

	public boolean authTypeStatusUpdate(String individualId, String individualIdType, List<String> authType,
			boolean isLock);
}
