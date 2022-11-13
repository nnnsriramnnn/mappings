package com.cst.map.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sid;
	
	private String sname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Course> course;

	public Student(String sname, List<Course> course) {
		super();
		this.sname = sname;
		this.course = course;
	}

}
