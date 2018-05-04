package mybatisexample.application;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatisexample.domains.Student;

public class MybatisRead_ALL {

	public static void main(String args[]) throws IOException {

		Reader reader = Resources.getResourceAsReader("mybatisConfigurations/SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();

		// select contact all contacts
		List<Student> student = session.selectList("Student.getAll");

		for (Student st : student) {
			System.out.println(st.getId() + ", " + st.getName() + ", " + st.getBranch() + ", " + st.getPercentage() + ", " + st.getEmail() + ", " + st.getPhone());
		}

		System.out.println("Records Read Successfully ");
		session.commit();
		session.close();
	}
}
