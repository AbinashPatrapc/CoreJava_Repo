package Helena;

public class ShallowCloning implements Cloneable {

	private String name;
	private Address address; // Assuming Address is another class

	public ShallowCloning(String name, Address address) {
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
		return "ShallowCloning [name=" + name + ", address=" + address + "]";
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws Exception {
		// Usage
		ShallowCloning original = new ShallowCloning("Alice", new Address("123 Street"));
		ShallowCloning cloned = (ShallowCloning) original.clone();
         System.out.println(original);
         System.out.println(cloned);
         original.address.setRoadNo("Hello");
         System.out.println(original);
         System.out.println(cloned);
	}
}
