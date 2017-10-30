package com.concretepage.service;

import java.util.List;

import com.concretepage.entity.Education; 

public interface IEducationService {
	List<Education> getAllEducation();
	Education getEducation(int eid);
	boolean addEducation(Education education);
	void updateEduction(Education education); 
    void deleteEducation(int eid);
}
