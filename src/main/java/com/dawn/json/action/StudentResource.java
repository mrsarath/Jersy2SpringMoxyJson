package com.dawn.json.action;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


import org.apache.log4j.Logger;
import org.eclipse.persistence.annotations.ChangeTracking;
import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;

import com.dawn.json.entity.Student;
import com.dawn.json.entity.StudentResponseVO;


@Path("/students")
public class StudentResource {
	
	Logger logger = Logger.getLogger(StudentResource.class); 
	
	

	public StudentResource() {		
		super();
		logger.info("Student REsourdfdfd dfddddddddddddddddddddddddddd");
	}

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/filter")
	public StudentResponseVO getAll(@NotNull(message="Cannot be Blank!")  @QueryParam("id") String id, @QueryParam("name") String name) {
		logger.info("Student Resourdfdfd dfddddddddddddddddddddddddddd");
 
		Student student = new Student(23, "dsf", "sdfds");
		
		StudentResponseVO response = new StudentResponseVO();
		response.getStudends().add(student);
		return response;
	}
	
	@GET
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public Student get(@PathParam("param") int id) {
 
		Student student = null;
 
		return student;
	}
	

}
