package com.github.setxpro.tms_ocurrences.domain.exceptions.ocoren;

import java.util.UUID;

public class OcorenDeletionException extends OcorenException {
    public OcorenDeletionException(UUID id) {
        super("Error deleting ocoren with id: " + id);
    }
}
