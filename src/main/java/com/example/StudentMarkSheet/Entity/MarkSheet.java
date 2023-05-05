package com.example.StudentMarkSheet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "marksheet")
public class MarkSheet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private int rollnumber;
	private int semtheory1;
	private int sempractical1;
	private int semtheory2;
	private int sempractical2;
	private int semtotal1;
	private int semtotal2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public int getSemtheory1() {
		return semtheory1;
	}

	public void setSemtheory1(int semtheory1) {
		this.semtheory1 = semtheory1;
	}

	public int getSempractical1() {
		return sempractical1;
	}

	public void setSempractical1(int sempractical1) {
		this.sempractical1 = sempractical1;
	}

	public int getSemtheory2() {
		return semtheory2;
	}

	public void setSemtheory2(int semtheory2) {
		this.semtheory2 = semtheory2;
	}

	public int getSempractical2() {
		return sempractical2;
	}

	public void setSempractical2(int sempractical2) {
		this.sempractical2 = sempractical2;
	}

	public int getSemtotal1() {
		return semtotal1;
	}

	public void setSemtotal1(int semtotal1) {
		this.semtotal1 = semtotal1;
	}

	public int getSemtotal2() {
		return semtotal2;
	}
	
	public void setSemtotal2(int semtotal2) {
		this.semtotal2 = semtotal2;
	}

}
