package com.arishin.spring;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {


	void setDataSource(DataSource ds);
	
	
	Student getStudent (Integer id);
	
	
}
