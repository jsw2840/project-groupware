package com.TrueSpot.ts2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TrueSpot.ts2.dao.CompanyDao;
import com.TrueSpot.ts2.dto.CompanyDto;
@Controller
public class CompanyController {
	@Autowired
	private CompanyDao companyDao;

		@GetMapping("/join")
		public String join() {
			return "company/join";
		}
		
		@PostMapping("/join")
		public String join(@ModelAttribute CompanyDto companyDto) {
			companyDao.insert(companyDto);
			return "redirect:joinFinish";
		}
		
		@RequestMapping("/joinFinish")
		public String joinFinish() {
			return "company/joinFinish";
		}
		
}
