package com.bezkoder.spring.files.uploadmultiple.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Table(name = "tbl_files_info")
@Data
public class FileInfo {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String url;
  private String path;

  public FileInfo() {
  }

  public FileInfo(String name, String url) {
    this.name = name;
    this.url = url;
  }
}
