package CSMP_DMM_API;

public class testClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Backup_opportunities tt = new Backup_opportunities();
		Backup_campaigns ttt = new Backup_campaigns();
//		int status = tt.send("xxxxx","10860d94-c9e9-a29b-27ac-51249f456c51", "0", "SME-001", "2/20/2013 10:03:44", "3/21/2013 12:53:54", "1", "1", "NULL", "1", "JBC Banking Inc - 1000 units"
//				, "Jere Murphey", "Existing Business", "User Conference", "Web Site", "1500000", "4/20/2013 12:00:00", "NULL", "Needs Analysis", "55");
		String opportunities_status = tt.send("aaa","1","1","33","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1");
		String campaigns_status = ttt.send("aaa", "2", "2", "33", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2");
		System.out.println("Insert_opportunities is " + opportunities_status);
		System.out.println("Insert_campaigns is " + campaigns_status);
	}
		

}
