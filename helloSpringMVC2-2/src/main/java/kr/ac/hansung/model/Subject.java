package kr.ac.hansung.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Subject {
	
	@Range(min=2018, max=2021)
	@NotNull(message="Year must be between 2018 and 2021")
	private int year;
	
	@Range(min=1, max=2)
	@NotNull(message="semsester must be beteween 1 and 2")
	private int semester;
	
	@Length(min=1, max=20)
	@NotNull(message="The class name cannot be empty")
	private String name;
	
	@Length(min=1, max=5)
	@NotNull(message="Category cannot be empty")
	private String category;
	
	@Length(min=1, max=10)
	@NotNull(message="Professor cannot be empty")
	private String professor;
	
	@Range(min=1, max=3)
	@NotNull(message="Grade must be between 1 and 3")
	private int grade;
}

