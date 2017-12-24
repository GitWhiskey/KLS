package ru.bmstu.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by MKhabrat on 22.12.2017.
 */
@Entity
public class KeysRecord {

    @Id
    @GeneratedValue
    private Long id;

    private String terminalNumber;

    private String pinMasterKey;

    private String macMasterKey;

    public Long getId() {
        return id;
    }

    public String getTerminalNumber() {
        return terminalNumber;
    }

    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    public String getPinMasterKey() {
        return pinMasterKey;
    }

    public void setPinMasterKey(String pinMasterKey) {
        this.pinMasterKey = pinMasterKey;
    }

    public String getMacMasterKey() {
        return macMasterKey;
    }

    public void setMacMasterKey(String macMasterKey) {
        this.macMasterKey = macMasterKey;
    }
}
