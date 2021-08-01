package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

@Controller
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/subjects")
	public String showGrades(Model model) {
		int semester1801 = subjectService.getGrade(2018, 1);
		int semester1802 = subjectService.getGrade(2018, 2);
		int semester1901 = subjectService.getGrade(2019, 1);
		int semester1902 = subjectService.getGrade(2019, 2);
		int semester2001 = subjectService.getGrade(2020, 1);
		int semester2002 = subjectService.getGrade(2020, 2);
		
		model.addAttribute("semester1801", semester1801);
		model.addAttribute("semester1802", semester1802);
		model.addAttribute("semester1901", semester1901);
		model.addAttribute("semester1902", semester1902);
		model.addAttribute("semester2001", semester2001);
		model.addAttribute("semester2002", semester2002);
		
		int allGrade = semester1801 + semester1802 + semester1901 + semester1902 + semester2001 + semester2002;
		
		model.addAttribute("allGrade", allGrade);
		
		return"subjects";
	}
	
	
	
	@RequestMapping("/2018_1")
	public String showSubjects1801(Model model) {
		List<Subject> subjects = subjectService.getSubjects2(2018, 1);
		model.addAttribute("subjects", subjects);
		
		return "2018_1";
	}
	
	@RequestMapping("/2018_2")
	public String showSubjects1802(Model model) {
		List<Subject> subjects = subjectService.getSubjects2(2018, 2);
		model.addAttribute("subjects", subjects);
		
		return "2018_2";
	}
	
	@RequestMapping("/2019_1")
	public String showSubjects1901(Model model) {
		List<Subject> subjects = subjectService.getSubjects2(2019, 1);
		model.addAttribute("subjects", subjects);
		
		return "2019_1";
	}
	
	@RequestMapping("/2019_2")
	public String showSubjects1902(Model model) {
		List<Subject> subjects = subjectService.getSubjects2(2019, 2);
		model.addAttribute("subjects", subjects);
		
		return "2019_2";
	}
	
	@RequestMapping("/2020_1")
	public String showSubjects2001(Model model) {
		List<Subject> subjects = subjectService.getSubjects2(2020, 1);
		model.addAttribute("subjects", subjects);
		
		return"2020_1";
	}
	
	@RequestMapping("/2020_2")
	public String showSubjects2002(Model model) {
		List<Subject> subjects = subjectService.getSubjects2(2020, 2);
		model.addAttribute("subjects", subjects);
		
		return "2020_2";
	}
	
	@RequestMapping("/enrollment")
	public String enrollment(Model model) {
		
		model.addAttribute("subject", new Subject());
		
		return "enrollment";
	}
	
	@RequestMapping("/createsubject")
	public String doCreate(Model model, @Valid Subject subject, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("== Form data does not validated ==");
			
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "enrollment";
		}
		
		subjectService.insert(subject);
		
		return "enrolledsubject";
	}
	
	@RequestMapping("/newsubject")
	public String show2021(Model model) {
		List<Subject> subjects = subjectService.getSubjects2(2021, 1);
		model.addAttribute("subjects", subjects);
		
		return "newsubject";
			
	}
	
}
