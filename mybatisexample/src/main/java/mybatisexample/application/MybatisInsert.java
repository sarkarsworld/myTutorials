package mybatisexample.application;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatisexample.domains.Student;

public class MybatisInsert { 

   public static void main(String args[]) throws IOException{
      
      Reader reader = Resources.getResourceAsReader("mybatisConfigurations/SqlMapConfig.xml");
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
      SqlSession session = sqlSessionFactory.openSession();
      
      //Create a new student object
      Student student = new Student("Dinesh","IT", 80, 984803322, "Dinesh@mail.com" ); 
            
      //Insert student data      
      session.insert("Student.insert", student);
      System.out.println("record inserted successfully");
      session.commit();
      session.close();
			
   }
   
}