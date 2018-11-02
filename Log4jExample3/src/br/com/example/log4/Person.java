package br.com.example.log4;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Person {
	private static final Logger LOOGER = Logger.getLogger(Person.class);

	private String name;
	private int age;

	public Person() {
		PropertyConfigurator.configure("log4j.properties");
	}

	public String getName() {
		LOOGER.info("Buscando nome usuario");
		return name;
	}

	public void setName(String name) {
		LOOGER.info("Inserindo nome usuario");
		this.name = name;
	}

	public int getAge() {
		LOOGER.info("Buscando idade usuario");
		return age;
	}

	public void setAge(int age) {
		LOOGER.info("Inserindo idade usuario");
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("\nNome:").append(getName());
		buf.append("\nIdade:").append(getAge());
		LOOGER.info("chamando toString");
		return buf.toString();
	}
}
