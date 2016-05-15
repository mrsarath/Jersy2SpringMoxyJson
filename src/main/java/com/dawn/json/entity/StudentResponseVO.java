package com.dawn.json.entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentResponseVO {
	
	List<Student> studends = new ArrayList<Student>();

	public List<Student> getStudends() {
		return studends;
	}

	public void setStudends(List<Student> studends) {
		this.studends = studends;
	}
	
	

}
