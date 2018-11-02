package br.com.example.log4;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestPerson {
	private static final Logger LOGGER = Logger.getLogger(TestPerson.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		
		List<Person> personList = new ArrayList<Person>();
		for (int i = 1; i < 20; i++) {
			Person p = new Person();
			p.setName("Usuário" + i);
			p.setAge(i);
			personList.add(p);
		}
		
		for (Person person : personList) {
			System.out.println(person.toString());
		}
		
		LOGGER.debug("LOGGER.debug");
		LOGGER.info("LOGGER.info");
		LOGGER.warn("LOGGER.warn");
		LOGGER.error("LOGGER.error");
		LOGGER.fatal("LOGGER.fatal");
		
		exempleErroLog();
	}
	
	
	private static void exempleErroLog() {
		Integer i = null; // forcando um null pointer;
		
		try {
			Person p = new Person();
			LOGGER.warn("Pode ocorrer um Null pointer");
			p.setAge(i);
		} catch (Exception e) {
			LOGGER.error("Erro interno NPE " + e.toString());
		}

	}
}
