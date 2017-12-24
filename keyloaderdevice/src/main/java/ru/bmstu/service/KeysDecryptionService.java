package ru.bmstu.service;

import org.apache.commons.codec.DecoderException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bmstu.domain.DecryptedKeysResponse;
import ru.bmstu.domain.KeysRecord;
import ru.bmstu.domain.MasterKey;

import java.io.IOException;
import java.security.GeneralSecurityException;

/**
 * Created by Maxon on 24.12.2017.
 */
@Service
public class KeysDecryptionService {

    @Autowired
    private EncryptionService encryptionService;

    @Autowired
    private MasterKey masterKey;

    public DecryptedKeysResponse getDecryptedKeysResponseFromRecord(KeysRecord record)
            throws IOException, DecoderException, GeneralSecurityException {
        String decryptedPinKey = encryptionService.desDecryptString(record.getPinMasterKey(), masterKey.getFullKey());
        String decryptedMacKey = encryptionService.desDecryptString(record.getMacMasterKey(), masterKey.getFullKey());

        DecryptedKeysResponse response = new DecryptedKeysResponse();
        response.setDecryptedPinKey(decryptedPinKey);
        response.setDecryptedMacKey(decryptedMacKey);
        return response;
    }
}
