package com.example.StudentMarkSheet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.StudentMarkSheet.Entity.MarkSheet;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Integer> {


	

	// total for semtotal1

	@Query(value = "select semtotal1 from prod_db.marksheet where rollnumber=?",nativeQuery = true)
	public Integer getsem1total(int id);

	//total to semtotal2
	@Query(value = "select semtotal2 from prod_db.marksheet where rollnumber=?", nativeQuery = true)
	public Integer getsem2total(int id);


}
