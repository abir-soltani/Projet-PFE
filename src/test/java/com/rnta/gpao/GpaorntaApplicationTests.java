package com.rnta.gpao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rnta.gpao.entities.Atelier;
import com.rnta.gpao.repository.AtelierRepository;

@SpringBootTest
class GpaorntaApplicationTests {
	@Autowired
	private AtelierRepository atelierrepository ;

	@Test
	public void testCreateAtelier() {
		Atelier a = new Atelier("1234","VMI2");
		atelierrepository.save(a);
	}
	
	 @Test
	 public void testFindAtelier()
	 {
		 Atelier p = atelierrepository.findById(1L).get();
	 System.out.println(p);
	 }

	 @Test
	 public void testUpdateAtelier()
	 {
		 Atelier p = atelierrepository.findById(1L).get();
	 p.setNomAtelier("VMI2");
	 atelierrepository.save(p);
	 }
	 
	 @Test
	 public void testDeleteAtelier()
	 {
		 atelierrepository.deleteById(1L);
		 }
	 @Test
	 public void testListerTousAteliers()
	 {
	 List<Atelier> a = atelierrepository.findAll();
	 for (Atelier p : a)
	 {
	 System.out.println(p);
	 }
	 
	/*@Test
	void contextLoads() {
	}*/
	 }
}
