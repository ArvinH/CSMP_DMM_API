package CSMP_DMM_API;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.cert.X509Certificate;




public class insert_leads {
	private String Token = null;
	private String id=null ;
	private String deleted=null ;
	private String SME_ID=null ;
	private String date_entered=null ;
	private String date_modified=null ;
	private String modified_user_id=null ;
	private String created_by=null ;
	private String description=null ;
	
	private String assigned_user_id=null ;
	private String salutation=null ;
	private String first_name=null ;
	private String last_name=null ;
	private String company=null ;
	private String title=null ;
	private String department=null ;
	private String do_not_call=null ;
	private String industry=null ;
	private String annual_revenue=null ;
	private String email=null ;
	private String secondaryemail=null ;
	private String phone_home=null ;
	private String phone_mobile=null ;
	private String phone_work=null ;
	private String phone_other=null ;
	private String phone_fax=null ;
	private String rating=null ;
	private String employees=null ;
	private String primary_address_street=null ;
	private String primary_address_city=null ;
	private String primary_address_state=null ;
	private String primary_address_postalcode=null ;
	private String primary_address_country=null ;
	private String primary_address_pobox=null ;
	private String alt_address_street=null ;
	private String alt_address_city=null ;
	private String alt_address_state=null ;
	private String alt_address_postalcode=null ;
	private String alt_address_country=null ;
	private String alt_address_pobox=null ;
	private String assistant=null ;
	private String assistant_phone=null ;
	private String converted=null ;
	private String refered_by=null ;
	private String lead_source=null ;
	private String lead_source_description=null ;
	private String lead_status=null ;
	private String lead_status_description=null ;
	private String reports_to_id=null ;
	private String account_id=null ;
	private String opportunity_id=null ;
	private String opportunity_amount=null ;
	private String campaign_id=null ;
	private String website=null ;

	
	private String status = "0";
		  public insert_leads(){
		  
		  }
		  @SuppressWarnings("restriction")
		public String send(String Token,String id,String deleted,String SME_ID,String date_entered,String date_modified,String modified_user_id,String created_by,String description,String assigned_user_id,String salutation,String first_name,String last_name,String company,String title,String department,String do_not_call,String industry,String annual_revenue,String email,String secondaryemail,String phone_home,String phone_mobile,String phone_work,String phone_other,String phone_fax,String rating,String employees,String primary_address_street,String primary_address_city,String primary_address_state,String primary_address_postalcode,String primary_address_country,String primary_address_pobox,String alt_address_street,String alt_address_city,String alt_address_state,String alt_address_postalcode,String alt_address_country,String alt_address_pobox,String assistant,String assistant_phone,String converted,String refered_by,String lead_source,String lead_source_description,String lead_status,String lead_status_description,String reports_to_id,String account_id,String opportunity_id,String opportunity_amount,String campaign_id,String website){
		 
		  try{
			 
//		   URL httpurl = new URL("https://140.116.82.17:8463/CSMP_DMM/backup_opportunities.do");
		   URL httpurl = new URL("http://dmm.vcap.me/backup_leads.do");
		   
		   HostnameVerifier hv = new HostnameVerifier() {
		        public boolean verify(String urlHostName, SSLSession session) {
//		            System.out.println("Warning: URL Host: " + urlHostName + " vs. "
//		                               + session.getPeerHost());
		            return true;
		        }
		    };
		    
//		   trustAllHttpsCertificates();
//		   HttpsURLConnection.setDefaultHostnameVerifier(hv);

		   HttpURLConnection httpConn = (HttpURLConnection)httpurl.openConnection(); 
		   httpConn.setRequestMethod("POST");
		   httpConn.setDoOutput(true);
		   httpConn.setDoInput(true);
		   httpConn.setUseCaches(false);
		   PrintWriter out = new PrintWriter(httpConn.getOutputStream());
		   
		    this.Token = "Token="+URLEncoder.encode(((Token==null||Token==""||Token=="NULL")?"NULL":Token),"UTF-8");
		    this.id = "id="+URLEncoder.encode(((id==null||id==""||id=="NULL")?"NULL":"\""+id+"\""),"UTF-8");
		    this.deleted = "deleted="+URLEncoder.encode(((deleted==null||deleted==""||deleted=="NULL")?"NULL":"\""+deleted+"\""),"UTF-8");
		    this.SME_ID = "SME_ID="+URLEncoder.encode(((SME_ID==null||SME_ID==""||SME_ID=="NULL")?"NULL":"\""+SME_ID+"\""),"UTF-8");
		    this.date_entered = "date_entered="+URLEncoder.encode(((date_entered==null||date_entered==""||date_entered=="NULL")?"NULL":"\""+date_entered+"\""),"UTF-8");
		    this.date_modified = "date_modified="+URLEncoder.encode(((date_modified==null||date_modified==""||date_modified=="NULL")?"NULL":"\""+date_modified+"\""),"UTF-8");
		    this.modified_user_id = "modified_user_id="+URLEncoder.encode(((modified_user_id==null||modified_user_id==""||modified_user_id=="NULL")?"NULL":"\""+modified_user_id+"\""),"UTF-8");
		    this.created_by = "created_by="+URLEncoder.encode(((created_by==null||created_by==""||created_by=="NULL")?"NULL":"\""+created_by+"\""),"UTF-8");
		    this.description = "description="+URLEncoder.encode(((description==null||description==""||description=="NULL")?"NULL":"\""+description+"\""),"UTF-8");
		    
		    this.assigned_user_id = "assigned_user_id="+URLEncoder.encode(((assigned_user_id==null||assigned_user_id==""||assigned_user_id=="NULL")?"NULL":"\""+assigned_user_id+"\""),"UTF-8");
		    this.salutation = "salutation="+URLEncoder.encode(((salutation==null||salutation==""||salutation=="NULL")?"NULL":"\""+salutation+"\""),"UTF-8");
		    this.first_name = "first_name="+URLEncoder.encode(((first_name==null||first_name==""||first_name=="NULL")?"NULL":"\""+first_name+"\""),"UTF-8");
		    this.last_name = "last_name="+URLEncoder.encode(((last_name==null||last_name==""||last_name=="NULL")?"NULL":"\""+last_name+"\""),"UTF-8");
		    this.company = "company="+URLEncoder.encode(((company==null||company==""||company=="NULL")?"NULL":"\""+company+"\""),"UTF-8");
		    this.title = "title="+URLEncoder.encode(((title==null||title==""||title=="NULL")?"NULL":"\""+title+"\""),"UTF-8");
		    this.department = "department="+URLEncoder.encode(((department==null||department==""||department=="NULL")?"NULL":"\""+department+"\""),"UTF-8");
		    this.do_not_call = "do_not_call="+URLEncoder.encode(((do_not_call==null||do_not_call==""||do_not_call=="NULL")?"NULL":"\""+do_not_call+"\""),"UTF-8");
		    this.industry = "industry="+URLEncoder.encode(((industry==null||industry==""||industry=="NULL")?"NULL":"\""+industry+"\""),"UTF-8");
		    this.annual_revenue = "annual_revenue="+URLEncoder.encode(((annual_revenue==null||annual_revenue==""||annual_revenue=="NULL")?"NULL":"\""+annual_revenue+"\""),"UTF-8");
		    this.email = "email="+URLEncoder.encode(((email==null||email==""||email=="NULL")?"NULL":"\""+email+"\""),"UTF-8");
		    this.secondaryemail = "secondaryemail="+URLEncoder.encode(((secondaryemail==null||secondaryemail==""||secondaryemail=="NULL")?"NULL":"\""+secondaryemail+"\""),"UTF-8");
		    this.phone_home = "phone_home="+URLEncoder.encode(((phone_home==null||phone_home==""||phone_home=="NULL")?"NULL":"\""+phone_home+"\""),"UTF-8");
		    this.phone_mobile = "phone_mobile="+URLEncoder.encode(((phone_mobile==null||phone_mobile==""||phone_mobile=="NULL")?"NULL":"\""+phone_mobile+"\""),"UTF-8");
		    this.phone_work = "phone_work="+URLEncoder.encode(((phone_work==null||phone_work==""||phone_work=="NULL")?"NULL":"\""+phone_work+"\""),"UTF-8");
		    this.phone_other = "phone_other="+URLEncoder.encode(((phone_other==null||phone_other==""||phone_other=="NULL")?"NULL":"\""+phone_other+"\""),"UTF-8");
		    this.phone_fax = "phone_fax="+URLEncoder.encode(((phone_fax==null||phone_fax==""||phone_fax=="NULL")?"NULL":"\""+phone_fax+"\""),"UTF-8");
		    this.rating = "rating="+URLEncoder.encode(((rating==null||rating==""||rating=="NULL")?"NULL":"\""+rating+"\""),"UTF-8");
		    this.employees = "employees="+URLEncoder.encode(((employees==null||employees==""||employees=="NULL")?"NULL":"\""+employees+"\""),"UTF-8");
		    this.primary_address_street = "primary_address_street="+URLEncoder.encode(((primary_address_street==null||primary_address_street==""||primary_address_street=="NULL")?"NULL":"\""+primary_address_street+"\""),"UTF-8");
		    this.primary_address_city = "primary_address_city="+URLEncoder.encode(((primary_address_city==null||primary_address_city==""||primary_address_city=="NULL")?"NULL":"\""+primary_address_city+"\""),"UTF-8");
		    this.primary_address_state = "primary_address_state="+URLEncoder.encode(((primary_address_state==null||primary_address_state==""||primary_address_state=="NULL")?"NULL":"\""+primary_address_state+"\""),"UTF-8");
		    this.primary_address_postalcode = "primary_address_postalcode="+URLEncoder.encode(((primary_address_postalcode==null||primary_address_postalcode==""||primary_address_postalcode=="NULL")?"NULL":"\""+primary_address_postalcode+"\""),"UTF-8");
		    this.primary_address_country = "primary_address_country="+URLEncoder.encode(((primary_address_country==null||primary_address_country==""||primary_address_country=="NULL")?"NULL":"\""+primary_address_country+"\""),"UTF-8");
		    this.primary_address_pobox = "primary_address_pobox="+URLEncoder.encode(((primary_address_pobox==null||primary_address_pobox==""||primary_address_pobox=="NULL")?"NULL":"\""+primary_address_pobox+"\""),"UTF-8");
		    this.alt_address_street = "alt_address_street="+URLEncoder.encode(((alt_address_street==null||alt_address_street==""||alt_address_street=="NULL")?"NULL":"\""+alt_address_street+"\""),"UTF-8");
		    this.alt_address_city = "alt_address_city="+URLEncoder.encode(((alt_address_city==null||alt_address_city==""||alt_address_city=="NULL")?"NULL":"\""+alt_address_city+"\""),"UTF-8");
		    this.alt_address_state = "alt_address_state="+URLEncoder.encode(((alt_address_state==null||alt_address_state==""||alt_address_state=="NULL")?"NULL":"\""+alt_address_state+"\""),"UTF-8");
		    this.alt_address_postalcode = "alt_address_postalcode="+URLEncoder.encode(((alt_address_postalcode==null||alt_address_postalcode==""||alt_address_postalcode=="NULL")?"NULL":"\""+alt_address_postalcode+"\""),"UTF-8");
		    this.alt_address_country = "alt_address_country="+URLEncoder.encode(((alt_address_country==null||alt_address_country==""||alt_address_country=="NULL")?"NULL":"\""+alt_address_country+"\""),"UTF-8");
		    this.alt_address_pobox = "alt_address_pobox="+URLEncoder.encode(((alt_address_pobox==null||alt_address_pobox==""||alt_address_pobox=="NULL")?"NULL":"\""+alt_address_pobox+"\""),"UTF-8");
		    this.assistant = "assistant="+URLEncoder.encode(((assistant==null||assistant==""||assistant=="NULL")?"NULL":"\""+assistant+"\""),"UTF-8");
		    this.assistant_phone = "assistant_phone="+URLEncoder.encode(((assistant_phone==null||assistant_phone==""||assistant_phone=="NULL")?"NULL":"\""+assistant_phone+"\""),"UTF-8");
		    this.converted = "converted="+URLEncoder.encode(((converted==null||converted==""||converted=="NULL")?"NULL":"\""+converted+"\""),"UTF-8");
		    this.refered_by = "refered_by="+URLEncoder.encode(((refered_by==null||refered_by==""||refered_by=="NULL")?"NULL":"\""+refered_by+"\""),"UTF-8");
		    this.lead_source = "lead_source="+URLEncoder.encode(((lead_source==null||lead_source==""||lead_source=="NULL")?"NULL":"\""+lead_source+"\""),"UTF-8");
		    this.lead_source_description = "lead_source_description="+URLEncoder.encode(((lead_source_description==null||lead_source_description==""||lead_source_description=="NULL")?"NULL":"\""+lead_source_description+"\""),"UTF-8");
		    this.lead_status = "lead_status="+URLEncoder.encode(((lead_status==null||lead_status==""||lead_status=="NULL")?"NULL":"\""+lead_status+"\""),"UTF-8");
		    this.lead_status_description = "lead_status_description="+URLEncoder.encode(((lead_status_description==null||lead_status_description==""||lead_status_description=="NULL")?"NULL":"\""+lead_status_description+"\""),"UTF-8");
		    this.reports_to_id = "reports_to_id="+URLEncoder.encode(((reports_to_id==null||reports_to_id==""||reports_to_id=="NULL")?"NULL":"\""+reports_to_id+"\""),"UTF-8");
		    this.account_id = "account_id="+URLEncoder.encode(((account_id==null||account_id==""||account_id=="NULL")?"NULL":"\""+account_id+"\""),"UTF-8");
		    this.opportunity_id = "opportunity_id="+URLEncoder.encode(((opportunity_id==null||opportunity_id==""||opportunity_id=="NULL")?"NULL":"\""+opportunity_id+"\""),"UTF-8");
		    this.opportunity_amount = "opportunity_amount="+URLEncoder.encode(((opportunity_amount==null||opportunity_amount==""||opportunity_amount=="NULL")?"NULL":"\""+opportunity_amount+"\""),"UTF-8");
		    this.campaign_id = "campaign_id="+URLEncoder.encode(((campaign_id==null||campaign_id==""||campaign_id=="NULL")?"NULL":"\""+campaign_id+"\""),"UTF-8");
		    this.website = "website="+URLEncoder.encode(((website==null||website==""||website=="NULL")?"NULL":"\""+website+"\""),"UTF-8");

		    
		    out.print(this.Token+"&"+this.id+"&"+this.deleted+"&"+this.SME_ID+"&"+this.date_entered+"&"+this.date_modified+"&"+this.modified_user_id+"&"+
		    			this.created_by+"&"+this.description+"&"+this.assigned_user_id+"&"+this.salutation+"&"+this.first_name+"&"+this.last_name+"&"+
		    			this.company+"&"+this.title+"&"+this.department+"&"+this.do_not_call+"&"+this.industry+"&"+this.annual_revenue+"&"+this.email+"&"+
		    			this.secondaryemail+"&"+this.phone_home+"&"+this.phone_mobile+"&"+this.phone_work+"&"+this.phone_other+"&"+this.phone_fax+"&"+
		    			this.rating+"&"+this.employees+"&"+this.primary_address_street+"&"+this.primary_address_city+"&"+this.primary_address_state+"&"+
		    			this.primary_address_postalcode+"&"+this.primary_address_country+"&"+this.primary_address_pobox+"&"+this.alt_address_street+"&"+
		    			this.alt_address_city+"&"+this.alt_address_state+"&"+this.alt_address_postalcode+"&"+this.alt_address_country+"&"+this.alt_address_pobox+"&"+
		    			this.assistant+"&"+this.assistant_phone+"&"+this.converted+"&"+this.refered_by+"&"+this.lead_source+"&"+this.lead_source_description+"&"+
		    			this.lead_status+"&"+this.lead_status_description+"&"+this.reports_to_id+"&"+this.account_id+"&"+this.opportunity_id+"&"+this.opportunity_amount+"&"+
		    			this.campaign_id+"&"+this.website);
		   out.flush();
		   out.close();
		   BufferedReader br = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
		   status = br.readLine();
		   br.close();
		   
		  }catch(Exception e){
		   e.printStackTrace();
		  }
		return status;
		  
		  }
		 
			
			private static void trustAllHttpsCertificates() throws Exception {
				javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];
				javax.net.ssl.TrustManager tm = new miTM();
				trustAllCerts[0] = tm;
				javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext
						.getInstance("SSL");
				sc.init(null, trustAllCerts, null);
				javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc
						.getSocketFactory());
			}

			static class miTM implements javax.net.ssl.TrustManager,
					javax.net.ssl.X509TrustManager {
				private static final String SERVER_KEY_STORE_PASSWORD = "netdb510";

				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					java.security.cert.X509Certificate[] chain = null;
			        try {
			            TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
			            KeyStore tks = KeyStore.getInstance("JKS");
			            tks.load(this.getClass().getClassLoader().getResourceAsStream("SSL/serverstore.jks"),
			            SERVER_KEY_STORE_PASSWORD.toCharArray());
			            tmf.init(tks);
			            chain = ((X509TrustManager) tmf.getTrustManagers()[0]).getAcceptedIssuers();
 
			          

			        } catch (Exception e) {
			            throw new RuntimeException(e);
			        }
			        return chain;
			    }

				@Override
				public void checkClientTrusted(
						java.security.cert.X509Certificate[] chain,
						String authType) throws CertificateException {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void checkServerTrusted(
						java.security.cert.X509Certificate[] chain,
						String authType) throws CertificateException {
					// TODO Auto-generated method stub
					
				}
					
				}

}
