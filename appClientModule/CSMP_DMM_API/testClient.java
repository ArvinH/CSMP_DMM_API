package CSMP_DMM_API;

public class testClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert_opportunities tt = new insert_opportunities();
		int status = tt.send("xxxxx","100c5d1a-0054-80f3-f600-50ff8144a05d", "SME_001", "Waverly Trading House - 1000 units", "2013/1/23  06:20:14 AM", "2013/1/23  06:39:14 AM", "1", "1", "123", "0", "1"
				, "New Business", "7c343060-69cd-cf34-aa9d-50ff85bb6526", "Self Generated", "25000", "25000", "2014/1/20", "test2", "Id. Decision Makers", "40");
		System.out.print(status);
	}
		

}
