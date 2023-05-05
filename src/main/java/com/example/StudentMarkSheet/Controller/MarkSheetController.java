package com.example.StudentMarkSheet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentMarkSheet.Entity.MarkSheet;
import com.example.StudentMarkSheet.Service.MarkSheetService;

@RestController
@RequestMapping(value = "/marksheet")
public class MarkSheetController {

	@Autowired
	MarkSheetService markser;

	// adding the single MarkSheetDetails
	@PostMapping(value = "/add")
	public String createdMarksheet(@RequestBody MarkSheet ms) {

		int value1 = (ms.getSempractical1() + ms.getSemtheory1());
		int value2 = (ms.getSemtheory2() + ms.getSempractical2());

		ms.setSemtotal1(value1);
		ms.setSemtotal2(value2);
		return markser.addMarkSheet(ms);
	}

	// get the single MarkSheetDetails
	@GetMapping(value = "/get/{id}")
	public MarkSheet getMarkSheetDetails(@PathVariable int id) {
		return markser.getMarkSheetDetails(id);
	}

	// delete the single MarkSheetDetails
	@DeleteMapping(value = "/delete/{id}")
	public String delete(@PathVariable int id) {
		return markser.deleteMarkSheetDetailsbyid(id);
	}

	// add by the list of MarkSheetDetailss
	@PostMapping(value = "/addallmarksheet")
	public String addListMarkSheetDetails(@RequestBody List<MarkSheet> e) {
		return markser.addaListofMarkSheetDetailss(e);
	}

	// get all the list of MarkSheetDetailss
	@GetMapping(value = "/getall")
	public List<MarkSheet> getlistofMarkSheetDetails() {
		return markser.getlistofMarkSheetDetails();
	}

	// update the list of MarkSheetDetailss

	@PutMapping(value = "/update/{id}")
	public String updateMarkSheetDetails(@RequestBody MarkSheet ms) {

		int value3 = (ms.getSempractical1() + ms.getSemtheory1());
		int value4 = (ms.getSemtheory2() + ms.getSempractical2());

		ms.setSemtotal1(value3);
		ms.setSemtotal2(value4);

		return markser.updateMarkSheetDetailsbyid(ms);
	}

	// query for sem1 total
	@GetMapping(value = "/gettotal1/{id}")
	public Integer getsemtotal1(@PathVariable int id) {
		return markser.getsemttotal1(id);

	}

	// query for sem1 total
	@GetMapping(value = "/gettotal2/{id}")
	public Integer getsemtotal2(@PathVariable int id) {
		return markser.getsemttotal2(id);
	}

}
