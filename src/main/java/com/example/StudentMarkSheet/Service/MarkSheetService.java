package com.example.StudentMarkSheet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentMarkSheet.Dao.MarkSheetDao;
import com.example.StudentMarkSheet.Entity.MarkSheet;

@Service
public class MarkSheetService {

	@Autowired
	MarkSheetDao markDao;

	// get MarkSheetDetails by id
	public MarkSheet getMarkSheetDetails(int id) {
		return markDao.getbyMarkSheetDetailsid(id);
	}
//delete MarkSheetDetails by id

	public String deleteMarkSheetDetailsbyid(int id) {

		return markDao.deleteMarkSheetDetailsbyid(id);
	}

	// add list of MarkSheetDetailss

	public String addaListofMarkSheetDetailss(List<MarkSheet> e) {
		return markDao.addlistofMarkSheetDetails(e);
	}

	// get list of MarkSheetDetailss

	public List<MarkSheet> getlistofMarkSheetDetails() {
		return markDao.getlistofMarkSheetDetails();
	}

	// update MarkSheetDetails by id

	public String updateMarkSheetDetailsbyid(MarkSheet id) {

		return markDao.updateMarkSheetDetailsbyid(id);
	}

	// add MarkSheetDetails

	public String addMarkSheet(MarkSheet ms) {
	
		return markDao.addMarksheet(ms);
	}

	
	public Integer getsemttotal1(int id) {
		return markDao.getsemttotal1(id);
	}

	public Integer getsemttotal2(int id) {
		return markDao.getsemttotal2(id);
	}

	
}
