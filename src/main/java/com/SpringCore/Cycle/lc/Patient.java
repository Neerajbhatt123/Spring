package com.SpringCore.Cycle.lc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
*/
public class Patient 
//implements InitializingBean,DisposableBean
{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("This is From Setter");
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Start or Init");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("End or destory");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception { // TODO
	 * Auto-generated method stub System.out.println("Start after properties set ");
	 * 
	 * }
	 * 
	 * @Override public void destroy() throws Exception { // TODO Auto-generated
	 * method stub System.out.println("Destroy");
	 * 
	 * }
	 */

	
}
