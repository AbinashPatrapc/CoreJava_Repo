package Helena;

public class DeepCloning implements Cloneable {
	private String name;
	private Address address;

	public DeepCloning(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "DeepCloning [name=" + name + ", address=" + address + "]";
	}

	public DeepCloning deepClone() {
		try {
			DeepCloning clonedPerson = (DeepCloning) super.clone();
			clonedPerson.address = (Address) this.address.clone(); // Assuming Address implements Cloneable
			return clonedPerson;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		// Usage
		DeepCloning originalPerson = new DeepCloning("Alice", new Address("Hyderabad"));
		DeepCloning clonedPerson = originalPerson.deepClone();
		System.out.println(originalPerson);
		System.out.println(clonedPerson);
		originalPerson.address.setRoadNo("Hello");
		System.out.println(originalPerson);
		System.out.println(clonedPerson);

		// 'clonedPerson' has its own separate 'Address' object, not shared with
		// 'originalPerson'

	}
}
