package com.github.setxpro.tms_ocurrences.domain.exceptions.ocoren;

public class OcorenCreationException extends OcorenException {
    public OcorenCreationException(String message) {
        super("Error creating ocoren" + message);
    }
}
