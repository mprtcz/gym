package com.java.academy.gym.dto;

import java.util.List;

public class LocaleUserMessagesRequestDto {

    private String languageCode;
    private List<String> messagesKeys;

    public LocaleUserMessagesRequestDto() {
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public List<String> getMessagesKeys() {
        return messagesKeys;
    }

    public void setMessagesKeys(List<String> messagesKeys) {
        this.messagesKeys = messagesKeys;
    }
}
