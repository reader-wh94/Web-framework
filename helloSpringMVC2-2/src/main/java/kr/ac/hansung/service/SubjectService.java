package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kr.ac.hansung.dao.SubjectDao;
import kr.ac.hansung.model.Subject;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectDao subjectDao;
	
	public List<Subject> getCurrent() {
		return subjectDao.getSubjects();
	}

	public void insert(Subject subject) {
		subjectDao.insert(subject);
	}
	
	public List<Subject> getSubjects2(int year, int semester){
		return subjectDao.getSubject2(year, semester);
	}
	
	public int getGrade(int year, int semester) {
		return subjectDao.getGrade(year, semester);
	}
}
