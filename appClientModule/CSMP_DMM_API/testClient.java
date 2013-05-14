package CSMP_DMM_API;

public class testClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String Token = ",MIIEpQIBAAKCAQEAntP7LTpbPf/86kEbmgPo/cS7DrD/koNCG0eIxQibBeCSdGcW,fylnK3mNlhn2WSJs8HuR/RIlyfYAh6quC5p1EPnCMWVDWUkqGOdgHQhs4gzJv8XF,6wDjUN99C7WGIYwjc0BLpxJJfRj8CfM04KHrPVXGu3Gduaxcwb4Za74fn5k4+X8x,b6/BAZfoWfUJn9MdU5F0Vx4srG+xLPw4Ei6/MhQoDPzZVhYSiW0OGn4SCmhmEGw8,rc/SFmLVwd60kNxLEQuSpjYHFw4GgrFnN/CAYs0ZGyCyWwNb8BgCWTlfkLdmX5R9,rLqFQAjVR22itKsv3EqvpklltkUP+0M4N9wR7QIDAQABAoIBAE5nlrbc9+3DULbT,LSz6gSnE1BKMjZ1l7lxJE9swRFbCZYnQ2eosJiHv/1T5vAKEXALa/VZQfxcTuW8/,cmuH9AJNSO/ZbUXGOGHS1j9+yUFNzso8d1drOMvTh4cgNPaal2Vtd+shu+VlUAYZ,aSD6zYWZsmEV1SazT5bUoPfvAu1ljtRqQhktVNqW4b3uQTVXQ+hSETcFKQeBJQiA,GtgJu85APSbj4PkuwYxoerKcPWd47sHYaF7Tz9+jg5HsoMCVoCsLVBsh/j+mR5A5,hVY2KkBJ4DS8lzuoUbwYVh+Fw+OFcs76tswsuD5aFVxTC54cbIxHvpRf04NqcHTB,WGlPkAECgYEA0qtY3vQ0r5WwjjFGttcNQeOeoF3sBc+S9+9Br3203ejXntZbA4nN,IzjhIlmY8R1qVPnQVGRUNTIH35QTZM21awqalOPuBwQYJ17OInon3jPN6GoykBTk,qpIzx/D5J3BigS5RbxERoFH1B46oyyczQIngKgWQW/i215+823J8gCECgYEAwQD5,Uzb9naPFc1DQxHL+H877vd8w4qXViM0B6eBnfdYOG4PavwgsHCwBGmJDtERtjvox,OSHCJLbgYV9Ly/x0WlKRaNFMnEtkN1WCXrKtiTDdAJdhgUptlv9c3gxd0YA54Lnk,Dkzh1SSgb1k9kAKkq2Q72DTdsRb03jgv6XlYiE0CgYEAlw5l2vggDwa2Yj7TBaeN,ygD8bODrq/760uyrnLn2Rmf+s9XfzNmyTd8rDwZPtBPzeprl1p1aBAqrupTikxUt,UGN6E+ibdExrRU+lXvNYQuvCaTQ8rTNOA0ByAJu5C556A0bC/XCvwtUBbTnNrl2d,UlmKcpcqu8fK0zGmqXOd8gECgYEAt7xrntK9AjOEp1EKTdqDHlj3wzwU18+zxvYT,mkitfVgoOf1+Y1ouU+t4aVuexKBYBEMeVRtULYuDdG86Q0lkow/zqeuGmUwUbbET,2X8UQYSpAAUdJ+5pAdS83g67ydPeRZfyCcMbQsQJj7dPKie6CAf2CM/bNNl754lp,40RICgkCgYEAzOaOKSX01JH+q+1UZD3+829FzmeDwzmmutY2J4AwqSFWILH3vAFb,Vi+mU3bbw7Bx49wgc/PKiOC8aAPQx7loCbDhko/hey8gR4yhqhGzopfGhfsHRsy4,kOdaoOqJIkeXydGdfJGgLeAyIeWDsRp/Pt/c8Evw5mVctpK64IdFmIU=,";
		String SME_ID = "79";
		//test insert_opportunities
		insert_opportunities tt1 = new insert_opportunities();
		String opportunities_status = tt1.send(Token,"1","1",SME_ID,"1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1");
		System.out.println("opportunities_status is " + opportunities_status);
		
		//test insert_campaigns
		insert_campaigns tt2 = new insert_campaigns();
		String campaigns_status = tt2.send("aaa", "2", "2", "33", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", 
				 							"2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2");
		System.out.println("campaigns_status is " + campaigns_status);
		
		//test insert_base
		insert_base tt3 = new insert_base();
		String base_status = tt3.send("aaa","1","1","1","1","1","1","1","1");
		System.out.println("base_status is " + base_status);
		
		//test insert_accounts
		insert_accounts tt4 = new insert_accounts();
		String accounts_status = tt4.send("aaa","1","1","1","1","1","1","1","1","1","1",
										"1","1","1","1","1","1","1","1","1","1",
										"1","1","1","1","1","1","1","1","1","1",
										"1","1","1","1","1","1","1","1","1","1");
		System.out.println("accounts_status is " + accounts_status);
		
		//test insert_accounts
		insert_calls tt5 = new insert_calls();
		String calls_status = tt5.send("aaa","1","1","1","1","1","1","1","1","1","1",
									"1","1","1","1","1","1","1","1","1","1",
									"1","1","1","1","1");
		System.out.println("calls_status is " + calls_status);
		
		//test insert_cases
		insert_cases tt6 = new insert_cases();
		String cases_status = tt6.send("aaa","1","1","1","1","1","1","1","1","1","1",
									"1","1","1","1","1");
		System.out.println("cases_status is " + cases_status);
		
		//test insert_contacts
		insert_contacts tt7 = new insert_contacts();
		String contacts_status = tt7.send("aaa","1","1","1","1","1","1","1","1","1","1",
									"1","1","1","1","1","1","1","1","1","1",
									"1","1","1","1","1","1","1","1","1","1",
									"1","1","1","1","1","1","1","1","1","1",
									"1","1","1","1");
		System.out.println("contacts_status is " + contacts_status);
		
		//test insert_emails
		insert_emails tt8 = new insert_emails();
		String emails_status = tt8.send("aaa","1","1","1","1","1","1","1","1","1","1",
										"1","1","1","1","1","1","1","1");
		System.out.println("emails_status is " + emails_status);
		
		//test insert_leads
		insert_leads tt9 = new insert_leads();
		String leads_status = tt9.send("aaa","1","1","1","1","1","1","1","1","1","1",
										"1","1","1","1","1","1","1","1","1","1",
										"1","1","1","1","1","1","1","1","1","1",
										"1","1","1","1","1","1","1","1","1","1",
										"1","1","1","1","1","1","1","1","1","1",
										"1","1","1");
		System.out.println("leads_status is " + leads_status);
		
		//test insert_meetings
		insert_meetings tt10 = new insert_meetings();
		String meetings_status = tt10.send("aaa","1","1","1","1","1","1","1","1","1","1",
												"1","1","1","1","1","1","1","1","1","1");
		System.out.println("meetings_status is " + meetings_status);
		
		//test insert_tasks
		insert_tasks tt11 = new insert_tasks();
		String tasks_status = tt11.send("aaa","1","1","1","1","1","1","1","1","1","1",
												"1","1","1","1","1","1","1");
		System.out.println("tasks_status is " + tasks_status);
		
		//test insert_users
		insert_users tt12 = new insert_users();
		String users_status = tt12.send("aaa","1","1","1","1","1","1","1","1","1","1",
											"1","1","1","1","1","1","1","1","1","1",
											"1","1","1","1","1","1","1","1","1","1",
											"1","1","1","1","1","1","1");
		System.out.println("users_status is " + users_status);
		
		//test insert_faq
		insert_faq tt13 = new insert_faq();
		String faq_status = tt13.send("aaa","1","1","1","1","1","1","1","1","1","1",
											"1","1","1","1");
		System.out.println("faq_status is " + faq_status);
		
		//test insert_vendors
		insert_vendors tt14 = new insert_vendors();
		String vendors_status = tt14.send("aaa","1","1","1","1","1","1","1","1","1","1",
												"1","1","1","1","1","1","1","1","1","1",
												"1");
		System.out.println("vendors_status is " + vendors_status);
		
		//test insert_products
		insert_products tt15 = new insert_products();
		String products_status = tt15.send("aaa","1","1","1","1","1","1","1","1","1","1",
												"1","1","1","1","1","1","1","1","1","1",
												"1","1","1","1","1","1","1","1","1","1",
												"1","1","1");
		System.out.println("products_status is " + products_status);
		
		//test insert_products
		insert_services tt16 = new insert_services();
		String services_status = tt16.send("aaa","1","1","1","1","1","1","1","1","1","1",
												"1","1","1","1","1","1","1","1","1","1",
												"1","1","1");
		System.out.println("services_status is " + services_status);
		
		//test insert_quotes
		insert_quotes tt17 = new insert_quotes();
		String quotes_status = tt17.send("aaa","1","1","1","1","1","1","1","1","1","1",
											   "1","1","1","1","1","1","1","1","1","1",
											   "1","1","1","1","1","1","1","1","1","1",
											   "1","1","1","1","1","1","1","1","1","1");
		System.out.println("quotes_status is " + quotes_status);

		
		//test insert_puchaseorders
		insert_puchaseorders tt18= new insert_puchaseorders();
		String puchaseorders_status = tt18.send("aaa","1","1","1","1","1","1","1","1","1","1",
													   "1","1","1","1","1","1","1","1","1","1",
													   "1","1","1","1","1","1","1","1","1","1",
													   "1","1","1","1","1","1","1","1","1","1"
													   ,"1","1");
		System.out.println("puchaseorders_status is " + puchaseorders_status);
		
		//test insert_salesorders
				insert_salesorders tt19= new insert_salesorders();
				String salesorders_status = tt19.send("aaa","1","1","1","1","1","1","1","1","1","1",
															"1","1","1","1","1","1","1","1","1","1",
															"1","1","1","1","1","1","1","1","1","1",
															"1","1","1","1","1","1","1","1","1","1"
															,"1","1","1","1","1");
		System.out.println("salesorders_status is " + salesorders_status);
		
		//test insert_invoices
		insert_invoices tt20= new insert_invoices();
		String invoices_status = tt20.send("aaa","1","1","1","1","1","1","1","1","1","1",
												"1","1","1","1","1","1","1","1","1","1",
												"1","1","1","1","1","1","1","1","1","1",
												"1","1","1","1","1","1","1","1","1","1"
												,"1","1","1","1","1");
		System.out.println("invoices_status is " + invoices_status);
		
	
	}
		

}
