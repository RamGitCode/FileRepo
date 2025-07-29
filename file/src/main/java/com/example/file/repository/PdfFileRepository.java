package com.example.file.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.file.entity.PdfFile;

public interface PdfFileRepository extends JpaRepository<PdfFile, Long> {
}
