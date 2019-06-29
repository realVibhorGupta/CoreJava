package coreJava;

public class ClonableObject implements Cloneable {

	int i;
	char ch;

	public Object test() throws CloneNotSupportedException {
		return super.clone();// checks whether the object is of type clonable.
	}

}
