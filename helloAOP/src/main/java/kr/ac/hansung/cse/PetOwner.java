package kr.ac.hansung.cse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	@Autowired //wiring by type
	@Qualifier(value="qf_cat")
	private AnimalType animal;
	
	public void play() {
		animal.sound();
	}
}
