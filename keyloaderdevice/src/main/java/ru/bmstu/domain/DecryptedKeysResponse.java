package ru.bmstu.domain;

/**
 * Created by Maxon on 23.12.2017.
 */
public class DecryptedKeysResponse {

    private String decryptedPinKey;
    private String decryptedMacKey;

    public String getDecryptedPinKey() {
        return decryptedPinKey;
    }

    public void setDecryptedPinKey(String decryptedPinKey) {
        this.decryptedPinKey = decryptedPinKey;
    }

    public String getDecryptedMacKey() {
        return decryptedMacKey;
    }

    public void setDecryptedMacKey(String decryptedMacKey) {
        this.decryptedMacKey = decryptedMacKey;
    }
}
