package com.acorn.prac.batis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )
 

public class MemberRepositoryTest {
	
	@Autowired
	MemberRepository repository;
	
//	@Test
	public void test() throws Exception {
//		fail("Not yet implemented");
		List<Member> list = repository.selectAll();
		System.out.println(list);
		assertTrue(list.size() >= 1 );
	}
	
	public void test2() {
		Member m = new Member();
		m.setId("test1");
		m.setPwd("1234");
		m.setName("김태준");
		
		int rowCnt = repository.insert(m);
		
		
//		assertTrue(rowCnt.size() >=2);
	}
	
	

}
