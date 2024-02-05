package Helena;

public class Address implements Cloneable{
 private String roadNo;
 
 public Address(String roadNo) {
	 this.roadNo=roadNo;
 }
 
 public void setRoadNo(String roadNo) {
	this.roadNo = roadNo;
}

public String getRoadNo() {
	return roadNo;
}

@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
@Override
public String toString() {
	return "Address [roadNo=" + roadNo + "]";
}
 
 
}
