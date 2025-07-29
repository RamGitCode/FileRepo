package com.example.file.service;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.file.entity.PdfFile;
import com.example.file.repository.PdfFileRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PdfFileService {

    private final PdfFileRepository repository;

    public PdfFile saveFile(MultipartFile file) throws Exception {
        PdfFile pdf = new PdfFile();
        pdf.setFileName(file.getOriginalFilename());
        pdf.setFileType(file.getContentType());
        pdf.setData(file.getBytes());
        
        return repository.save(pdf);
    }

    public PdfFile getFile(Long id) {
        return repository.findById(id).orElse(null);
    }
}
