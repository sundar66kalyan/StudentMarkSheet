package com.example.StudentMarkSheet.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StudentMarkSheet.Entity.MarkSheet;
import com.example.StudentMarkSheet.Repository.MarkSheetRepository;

@Repository
public class MarkSheetDao {

	@Autowired
	MarkSheetRepository mkRepo;

//get MarkSheetDetails by id
	public MarkSheet getbyMarkSheetDetailsid(int id) {
		return mkRepo.findById(id).get();

	}

//delete MarkSheetDetails by id
	public String deleteMarkSheetDetailsbyid(int id) {
		mkRepo.deleteById(id);
		return "successfully deleted";
	}

	// add list of MarkSheetDetailss

	public String addlistofMarkSheetDetails(List<MarkSheet> e) {
		mkRepo.saveAll(e);
		return "successfully added to the list";
	}
	// get list of MarkSheetDetailss

	public List<MarkSheet> getlistofMarkSheetDetails() {

		return mkRepo.findAll();
	}
	// update MarkSheetDetails by id

	public String updateMarkSheetDetailsbyid(MarkSheet id) {
		mkRepo.save(id);
		return "successfully updated in the list";
	}

	public String addMarksheet(MarkSheet marksheet) {

		mkRepo.save(marksheet);
		return "successfully saved";

	}

	public Integer getsemttotal1(int id) {
		return mkRepo.getsem1total(id);
	}

	public Integer getsemttotal2(int id) {
		return mkRepo.getsem2total(id);
	}

}
