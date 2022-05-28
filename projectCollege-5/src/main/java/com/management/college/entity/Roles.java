package com.management.college.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Roles")
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY )
	    @Column(name="id")
	    private long id;
	    @Column(name="code")
	    private String Code;
	    @Column(name="description")
	    private String description;

}
