package com.tonovel.be_tonovel.controller;

import com.tonovel.be_tonovel.datalayer.repositories.BnkFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.nio.file.*;

@RestController
@RequestMapping("/api/bnkfiles")
public class BnkFileController {

    @Autowired private BnkFileRepository bnkFileRepository;

    // GET /api/bnkfiles/{id}/download
    @GetMapping("/{id}/download")
    public ResponseEntity<Resource> downloadBnkFile(@PathVariable Long id) {
        return (ResponseEntity<Resource>) bnkFileRepository.findById(id).map(bnk -> {
            try {
                Path path = Paths.get(bnk.getFilePath());
                Resource resource = new UrlResource(path.toUri());
                if (!resource.exists() || !resource.isReadable()) {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
                }
                String filename = bnk.getFileName();
                return ResponseEntity.ok()
                        .contentType(MediaType.APPLICATION_OCTET_STREAM)
                        .header(HttpHeaders.CONTENT_DISPOSITION,
                                "attachment; filename=\"" + filename + "\"")
                        .body(resource);

            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
