package kr.ac.hansung.cse;

import lombok.Setter;

@Setter
public class Cat implements AnimalType {

	private String myName;

	@Override
	public void sound() {
	
		System.out.println("Cat name = "+ myName + ":" + "Meow");
	}

}
//crtl + shift + o : 자동 임포트, crtl + space : 자동 완성 기능, crtl + shift + f : format