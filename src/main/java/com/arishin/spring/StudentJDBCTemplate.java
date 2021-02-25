package com.arishin.spring;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
public class StudentJDBCTemplate implements StudentDAO{

	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	
	public void setDataSource(DataSource dataSource) {
		
			this.dataSource = dataSource;
			this.jdbcTemplateObject = new JdbcTemplate(dataSource);	
		
		
		
	}
	public Student getStudent(Integer id) {
		  SimpleJdbcCall jdbcCall = new 
		  SimpleJdbcCall(dataSource).withFunctionName("get_student_name");
		   
	      SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
	      String name = jdbcCall.executeFunction(String.class, in);
	      Student student = new Student();
	      student.setId(id);
	      student.setName(name);
	     
	      return student;  	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
