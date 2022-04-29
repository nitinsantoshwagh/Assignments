package com.springjdbc.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import com.springjdbc.model.*;
public class StudentDAO {

	JdbcTemplate objJDBC;

	public JdbcTemplate getObjJDBC() {
		return objJDBC;
	}

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}
	
	public int saveStudent(Student objE)
	{
		String query ="insert into student (firstname,lastname,fathername,mothername,classname,section,dob,date_of_addmission,gender,add1,add2,s_phone,p_phone,p_email,cityid)"
				+ " values ('"+objE.getFirstname()+"','"+objE.getLastname()+"','"+objE.getFathername()+"','"+objE.getMothername()+"','"+objE.getClassname()+"','"+objE.getSection()+"','"+objE.getDob()+"','"+objE.getDate_of_addmission()+"','"+objE.getGender()+"','"+objE.getAdd1()+"','"+objE.getAdd2()+"','"+objE.getS_phone()+"','"+objE.getP_phone()+"','"+objE.getP_email()+"',"+objE.getCityid()+")";
		int no;
		no = objJDBC.update(query);
		return no;
	}
//	public int updateStudent(Student objE)
//	{
//		String query="update student set ename='"+objE.getFirstname()+"','"+objE.getLastname()+"','"+objE.getFathername()+"','"+objE.getMothername()+"','"+objE.getClassname()+"','"+objE.getSection()+"','"+objE.getDob()+"','"+objE.getDate_of_addmission()+"','"+objE.getGender()+"','"+objE.getAdd1()+"','"+objE.getAdd2()+"','"+objE.getS_phone()+"','"+objE.getP_phone()+"','"+objE.getP_email()+"',"+objE.getCityid()+" where empid="+objE.getSid();
//		int no;
//		no =objJDBC.update(query);
//		return no;
//			
//	}
//	public int deleteStudent(int sid)
//	{
//		String query ="delete from student where empid="+sid;
//		return objJDBC.update(query);
//	}
//	public int showStudent(Student objE)
//	{
//		
//	}
	
	
	
	
	
}
