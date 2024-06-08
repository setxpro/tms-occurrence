package com.github.setxpro.tms_ocurrences.domain.exceptions.ocoren;

import java.util.UUID;

public class OcorenUpdateException extends OcorenException {
    public OcorenUpdateException(UUID id) {
        super("Error updating ocoren with id: " + id);
    }
}
