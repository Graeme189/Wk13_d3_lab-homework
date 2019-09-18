package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findWhiskyByYear(){
		List<Whisky> found = whiskyRepository.findWhiskiesForYear(1991);
		assertEquals(1991, found.get(0).getYear());
	}

	@Test
	public void findDistilleryByRegion(){
		List<Distillery> found = distilleryRepository.findDistilleriesByRegion("Highland");
		assertEquals("Glendronach", found.get(0).getName());
	}

	@Test
	public void findWhiskiesFromDistilleryByAge(){
		List<Whisky> found = whiskyRepository.findWhiskiesFromDistilleryByAge("Glendronach", 15);
		assertEquals("The Glendronach Revival", found.get(0).getName());
	}

	@Test
	public void findWhiskiesByRegion() {
		List<Whisky> found = whiskyRepository.findWhiskiesByRegion("Highland");
		assertEquals("The Glendronach Revival", found.get(0).getName());
	}

}
