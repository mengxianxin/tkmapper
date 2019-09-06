//package com.atguigu.shop.test;
//
//import java.io.InputStream;
//import java.util.Iterator;
//
//import org.apache.ibatis.session.Configuration;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import com.atguigu.shop.entities.Employee;
//import com.atguigu.shop.mappers.EmployeeMapper;
//
//import tk.mybatis.mapper.mapperhelper.MapperHelper;
//
//public class MBGTest {
//
//	public static void main(String[] args) {
//
//		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//
//		InputStream inputStream = MBGTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
//
//		SqlSessionFactory factory = builder.build(inputStream);
//
//		SqlSession session = factory.openSession();
//
//		//***********************
//		//鎸夌収Java鏂瑰紡鏁村悎閫氱敤Mapper鐨勭壒娈婅缃�
//		//i.鍒涘缓MapperHelper瀵硅薄
//		MapperHelper mapperHelper = new MapperHelper();
//
//		//ii.閫氳繃MapperHelper瀵硅薄瀵筂yBatis鍘熺敓鐨凜onfiguration瀵硅薄杩涜澶勭悊
//		Configuration configuration = session.getConfiguration();
//		mapperHelper.processConfiguration(configuration);
//
//		//***********************
//
//		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//
//		Iterator<Employee> iterator = mapper.selectAll().iterator();
//
//		while (iterator.hasNext()) {
//			Employee employee = (Employee) iterator.next();
//			System.out.println(employee);
//		}
//
//	}
//
//}
