package ru.bmstu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bmstu.domain.DecryptedKeysResponse;
import ru.bmstu.domain.KeysRecord;
import ru.bmstu.domain.KeysRepository;
import ru.bmstu.service.KeysDecryptionService;


/**
 * Created by Maxon on 23.12.2017.
 */
@RestController
public class TerminalKeysController {

    @Autowired
    private KeysRepository keysRepository;

    @Autowired
    private KeysDecryptionService keysDecryptionService;

    @RequestMapping("/decrypted-keys/{terminalNumber}")
    public DecryptedKeysResponse getDecryptedKeys(@PathVariable("terminalNumber") String terminalNumber) {
        KeysRecord record = keysRepository.findKeysRecordByTerminalNumber(terminalNumber);
        try {
            return keysDecryptionService.getDecryptedKeysResponseFromRecord(record);
        } catch (Exception e) {
            throw new RuntimeException("Error while decrypting data.", e);
        }
    }
}
