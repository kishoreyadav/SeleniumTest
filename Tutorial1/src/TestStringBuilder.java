class Students {
	private String name = "Kishore";
	private int id = 518851;



	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(" :  ").append(id);
		return sb.toString();
		
	}
}
	public class TestStringBuilder {
		public static void main(String[] args) {

			/*
			 * StringBuilder sb = new StringBuilder(); sb.append(
			 * "I am kishore.\n"); sb.append(" "); sb.append(
			 * "I love java programming!"); System.out.println(sb.toString());
			 */
			Students st1 = new Students();
			System.out.println(st1);

		}
	}
