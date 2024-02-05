package Comparable.Comparator;

public class EmployeeSorting implements Comparable {
	@Override
	public String toString() {
		return "\n EmployeeSorting:: eid=" + eid + " name=" + name;
	}

	private int eid;
	private String name;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object obj) {
		int eid1 = this.eid;

		EmployeeSorting e = (EmployeeSorting) obj;
		int eid2 = e.eid;

		if (eid1 > eid2)
			return 1;
		else if (eid1 < eid2)
			return -1;
		else
			return 0;
	}

	public EmployeeSorting(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}

}
