package ru.bmstu.service;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;

/**
 * Created by Maxon on 24.12.2017.
 */
@Service
public class EncryptionService {

    public String desDecryptString(String hexEncodedData, String hexEncodedDesKey)
            throws IOException, DecoderException, GeneralSecurityException {
        // Превращаем строку с 16-ми числами ключа в полноценный DES-ключ
        byte[] desKeyBytes = Hex.decodeHex(hexEncodedDesKey.toCharArray());
        Key desKey = new SecretKeySpec(desKeyBytes,0,desKeyBytes.length, "DES");
        // Преобразуем строку с зашифрованными данными, закодированную в Hex, в массив байтов
        byte[] dataEncryptedBytes = Hex.decodeHex(hexEncodedData.toCharArray());
        // Расшифровываем данные
        Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE, desKey);
        byte[] decryptedDataBytes = cipher.doFinal(dataEncryptedBytes);
        return Hex.encodeHexString(decryptedDataBytes);
    }
}
