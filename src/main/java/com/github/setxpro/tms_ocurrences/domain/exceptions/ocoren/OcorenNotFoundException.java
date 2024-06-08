package com.github.setxpro.tms_ocurrences.domain.exceptions.ocoren;

import java.util.UUID;

public class OcorenNotFoundException extends OcorenException {
    public OcorenNotFoundException(UUID id) {
        super("Ocoren not found with id: " + id);
    }
}
