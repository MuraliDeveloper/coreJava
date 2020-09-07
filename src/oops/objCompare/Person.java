package oops.objCompare;

/**
  
 two objs are equal if the id, name, age of 1st obj == id,name,age of second obj
 step1 : write the equals() method inside the Person classs
 step2: use equals method for comparing two objects.

 */
public class Person {
	int id;
	String name;
	int age;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Person() {

	}

//param arg bconstructor
	public Person(int id, int age, String pName) {
		this.id = id;
		this.age = age;
		name = pName;
	}

}
