package com.management.college.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Documents")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Documents {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="id_doc")
 private long id;
 @Column(name="content")
 @Lob
 private byte [] content;
 @Column(name="name")
 private String name;
 @Column(name="filetype")
 private String filetype;
 
}