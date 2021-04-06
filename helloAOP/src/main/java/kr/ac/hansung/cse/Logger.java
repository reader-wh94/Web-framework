package kr.ac.hansung.cse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger { //aspect
		@Pointcut("execution(void kr.ac.hansung.cse.*.sound())")
		private void selectSound(){
			
		}
		
		@Before("selectSound()")
		public void aboutToSound() { //advice
			System.out.println("advice: about to sound");
		}
}
