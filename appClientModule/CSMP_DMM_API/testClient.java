package CSMP_DMM_API;

public class testClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert_opportunities tt = new insert_opportunities();
		insert_campaigns ttt = new insert_campaigns();
//		int status = tt.send("xxxxx","10860d94-c9e9-a29b-27ac-51249f456c51", "0", "SME-001", "2/20/2013 10:03:44", "3/21/2013 12:53:54", "1", "1", "NULL", "1", "JBC Banking Inc - 1000 units"
//				, "Jere Murphey", "Existing Business", "User Conference", "Web Site", "1500000", "4/20/2013 12:00:00", "NULL", "Needs Analysis", "55");
		int status = tt.send("1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1");
		int status2 = ttt.send("2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2");
		System.out.print(status2);
	}
		

}
