package practice.code;

import java.util.Objects;

public class EqualsAndHashCode {
         int sid;
         String sname;
         String sadd;
         
	@Override
		public int hashCode() {
			return Objects.hash(sadd, sid, sname);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EqualsAndHashCode other = (EqualsAndHashCode) obj;
			return Objects.equals(sadd, other.sadd) && sid == other.sid && Objects.equals(sname, other.sname);
		}

	@Override
		public String toString() {
			return "EqualsAndHashCode [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + "]";
		}

	public EqualsAndHashCode(int sid, String sname, String sadd) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.sadd = sadd;
		}

	public static void main(String[] args) {
		EqualsAndHashCode ee=new EqualsAndHashCode(101,"Abinash","Hyderabad");
		EqualsAndHashCode ee1=new EqualsAndHashCode(101,"Abinash","Hyderabad");
        System.out.println(ee.hashCode());
        System.out.println(ee1.hashCode());
        System.out.println(ee.equals(ee1));
        System.out.println(ee==ee1);
	}

}
