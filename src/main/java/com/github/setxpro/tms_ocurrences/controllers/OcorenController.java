package com.github.setxpro.tms_ocurrences.controllers;

import com.github.setxpro.tms_ocurrences.domain.core.usecases.*;
import com.github.setxpro.tms_ocurrences.domain.dtos.MessageDTO;
import com.github.setxpro.tms_ocurrences.domain.dtos.OcorenDTO;
import com.github.setxpro.tms_ocurrences.domain.exceptions.ocoren.OcorenCreationException;
import com.github.setxpro.tms_ocurrences.domain.exceptions.ocoren.OcorenDeletionException;
import com.github.setxpro.tms_ocurrences.domain.exceptions.ocoren.OcorenNotFoundException;
import com.github.setxpro.tms_ocurrences.domain.exceptions.ocoren.OcorenUpdateException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/ocoren")
public class OcorenController {

    private final CreateOcorenUseCase createOcorenUseCase;
    private final FindAllOcorenUseCase findAllOcorenUseCase;
    private final FindOneOcorenUseCase findOneOcorenUseCase;
    private final UpdateOneOcorenUseCase updateOneOcorenUseCase;
    private final DeleteOneOcorenUseCase deleteOneOcorenUseCase;

    public OcorenController(CreateOcorenUseCase createOcorenUseCase,
            FindAllOcorenUseCase findAllOcorenUseCase,
            FindOneOcorenUseCase findOneOcorenUseCase,
            UpdateOneOcorenUseCase updateOneOcorenUseCase,
            DeleteOneOcorenUseCase deleteOneOcorenUseCase) {
        this.createOcorenUseCase = createOcorenUseCase;
        this.findAllOcorenUseCase = findAllOcorenUseCase;
        this.findOneOcorenUseCase = findOneOcorenUseCase;
        this.updateOneOcorenUseCase = updateOneOcorenUseCase;
        this.deleteOneOcorenUseCase = deleteOneOcorenUseCase;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody List<OcorenDTO> ocorenDTO) {
        try {
            createOcorenUseCase.execute(ocorenDTO);
            return new ResponseEntity<>(new MessageDTO("Ocoren created with successfully"), HttpStatus.CREATED);
        } catch (OcorenCreationException creationException) {
            return new ResponseEntity<>(new MessageDTO(creationException.getMessage()), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(new MessageDTO("Erro interno!"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        try {
            return new ResponseEntity<>(findAllOcorenUseCase.execute(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new MessageDTO("Erro interno!"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findOneById(@PathVariable(value = "id") UUID id) {
        try {
            return new ResponseEntity<>(findOneOcorenUseCase.execute(id), HttpStatus.OK);
        } catch (OcorenNotFoundException | OcorenUpdateException e) {
            return new ResponseEntity<>(new MessageDTO(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
        catch (Exception e) {
            return new ResponseEntity<>(new MessageDTO("Erro interno!"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateOne(@PathVariable(value = "id") UUID id, @RequestBody OcorenDTO ocorenDTO) {
        try {
            return new ResponseEntity<>(updateOneOcorenUseCase.execute(id, ocorenDTO), HttpStatus.OK);
        } catch (OcorenNotFoundException | OcorenUpdateException e) {
            return new ResponseEntity<>(new MessageDTO(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
        catch (Exception e) {
            return new ResponseEntity<>(new MessageDTO("Erro interno!"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOne(@PathVariable(value = "id") UUID id) {
        try {
            deleteOneOcorenUseCase.execute(id);
            return new ResponseEntity<>(new MessageDTO("Deleted with successfully"), HttpStatus.OK);
        } catch (OcorenNotFoundException | OcorenDeletionException e) {
            return new ResponseEntity<>(new MessageDTO(e.getMessage()), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(new MessageDTO("Erro interno!"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
