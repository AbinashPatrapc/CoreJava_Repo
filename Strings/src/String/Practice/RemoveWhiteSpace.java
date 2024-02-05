package String.Practice;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str="J a v a P r o g r a m i n g";
		str=str.replaceAll("\\s", "");
		System.out.println(str);

	}

}
