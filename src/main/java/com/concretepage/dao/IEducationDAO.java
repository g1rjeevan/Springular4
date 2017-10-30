package com.concretepage.dao;

import java.util.List;

import com.concretepage.entity.Education; 

public interface IEducationDAO {
	List<Education> getAllEducation();
	Education getEducationById(int eid);
    void addEducation(Education education);
    void updateEducation(Education education);
    void deleteEducation(int eid);
    boolean educationExists(String grade, String year);
}
