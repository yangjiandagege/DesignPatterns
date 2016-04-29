package com.intel.yj.dp.filter;

import java.util.ArrayList;
import java.util.List;

import com.intel.yj.dp.Result;

public class FilterApp {
	public static void test() {
	    List<Person> persons = new ArrayList<Person>();

	    persons.add(new Person("Robert","Male", "Single"));
	    persons.add(new Person("John","Male", "Married"));
	    persons.add(new Person("Laura","Female", "Married"));
	    persons.add(new Person("Diana","Female", "Single"));
	    persons.add(new Person("Mike","Male", "Single"));
	    persons.add(new Person("Bobby","Male", "Single"));

	    Criteria male = new CriteriaMale();
	    Criteria female = new CriteriaFemale();
	    Criteria single = new CriteriaSingle();
	    Criteria singleMale = new AndCriteria(single, male);
	    Criteria singleOrFemale = new OrCriteria(single, female);

	    Result.append("Males: " );
	    printPersons(male.meetCriteria(persons));

	    Result.append("\nFemales: ");
	    printPersons(female.meetCriteria(persons));

	    Result.append("\nSingle Males: ");
	    printPersons(singleMale.meetCriteria(persons));

	    Result.append("\nSingle Or Females: ");
	    printPersons(singleOrFemale.meetCriteria(persons));
	}
	
	 public static void printPersons(List<Person> persons){
		    for (Person person : persons) {
		       Result.append("Person : [ Name : " + person.getName()
		          +", Gender : " + person.getGender()
		          +", Marital Status : " + person.getMaritalStatus()
		          +" ]");
		    }
		 }
 }

