package com.concretepage.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.concretepage.entity.Education; 

@Transactional
@Repository
public class EducationDAO implements IEducationDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Education> getAllEducation() {
		String hql = "FROM Education as e ORDER BY e.eid";
		return (List<Education>) hibernateTemplate.find(hql); 
	}

	@Override
	public Education getEducationById(int eid) {
		return hibernateTemplate.get(Education.class, eid);
	}

	@Override
	public void addEducation(Education education) {
		hibernateTemplate.save(education);
	}

	@Override
	public void updateEducation(Education education) {
		Education e = getEducationById(education.getEid());
		e.setGrade(education.getGrade());
		e.setYear(education.getYear());
		hibernateTemplate.update(e);
	}

	@Override
	public void deleteEducation(int eid) {
		hibernateTemplate.delete(getEducationById(eid));		
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean educationExists(String grade, String year) {
		String hql = "FROM Education as e WHERE e.grade = ? and e.year = ?";
		List<Education> educations = (List<Education>) hibernateTemplate.find(hql, grade, year);
		return educations.size() > 0 ? true : false;
	}

}
