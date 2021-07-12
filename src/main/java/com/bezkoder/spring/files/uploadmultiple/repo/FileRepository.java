package com.bezkoder.spring.files.uploadmultiple.repo;

import com.bezkoder.spring.files.uploadmultiple.model.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileInfo, Long> {
}
