package mybatisexample.application;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatisexample.domains.Student;

public class Annotations_Example_Read {
	public static void main(String[] args) throws IOException {
		Reader reader = Resources.getResourceAsReader("mybatisConfigurations/SqlMapConfig.xml");
		   SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		   SqlSession session = sqlSessionFactory.openSession();
		   session.getConfiguration().addMapper(Student_mapper.class);      
		   Student_mapper mapper = session.getMapper(Student_mapper.class);
		      
		   //Get the student details
		   Student student = mapper.getById(2);
		   System.out.println(student.getBranch());
		   System.out.println(student.getEmail());
		   System.out.println(student.getId());
		   System.out.println(student.getName());
		   System.out.println(student.getPercentage());
		   System.out.println(student.getPhone());      
		   session.commit();
		   session.close();

	}

}
