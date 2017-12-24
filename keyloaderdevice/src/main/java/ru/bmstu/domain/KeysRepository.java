package ru.bmstu.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Maxon on 24.12.2017.
 */
@Repository
public interface KeysRepository extends CrudRepository<KeysRecord, String> {

    KeysRecord findKeysRecordByTerminalNumber(String terminalNumber);
}
