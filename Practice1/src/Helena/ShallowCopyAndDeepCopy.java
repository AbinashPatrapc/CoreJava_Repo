package Helena;

public class ShallowCopyAndDeepCopy {
	private String name;
	private int id;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ShallowCopyAndDeepCopy(String name, int id,Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address=address;
	}

	public ShallowCopyAndDeepCopy(ShallowCopyAndDeepCopy scp) {
		this.name =scp.name;
		this.id =scp.id;
		this.address=new Address(scp.address.getRoadNo());
	}

	
	@Override
	public String toString() {
		return "ShallowCopyAndDeepCopy [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		ShallowCopyAndDeepCopy scp = new ShallowCopyAndDeepCopy("Bittu", 101,new Address("Hyderabad"));
		ShallowCopyAndDeepCopy scp1 = new ShallowCopyAndDeepCopy(scp);//Deep Copy
		ShallowCopyAndDeepCopy scp2 = scp;//Shallow Copy
		System.out.println(scp);
		System.out.println(scp1);
		System.out.println(scp2);
		scp.setName("Helena");
		scp.address.setRoadNo("Road No 5");
		System.out.println(scp);
		System.out.println(scp1);
		System.out.println(scp2);
	}
}
