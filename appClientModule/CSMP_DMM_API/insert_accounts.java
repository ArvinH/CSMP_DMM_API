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




public class insert_accounts {
	private String Token = null;
	private String id = null;
	private String deleted = null;
	private String SME_ID = null;
	private String date_entered = null;
	private String date_modified = null;
	private String modified_user_id = null;
	private String created_by = null;
	private String description = null;
	
	private String assigned_user_id = null;
	private String name = null;
	private String account_type = null;
	private String industry = null;
	private String annual_revenue = null;
	private String email = null;
	private String secondaryemail = null;
	private String phone_fax = null;
	private String rating = null;
	private String phone_office = null;
	private String phone_alternate = null;
	private String website = null;
	private String ownership = null;
	private String employees = null;
	private String ticker_symbol = null;
	private String billing_address_street = null;
	private String billing_address_city = null;
	private String billing_address_state = null;
	private String billing_address_postalcode = null;
	private String billing_address_country = null;
	private String billing_address_pobox = null;
	private String shipping_address_street = null;
	private String shipping_address_city = null;
	private String shipping_address_state = null;
	private String shipping_address_postalcode = null;
	private String shipping_address_country = null;
	private String shipping_address_pobox = null;
	private String parent_id = null;
	private String sic_code = null;
	private String campaign_id = null;
	private String emailoptout = null;
	private String notify_owner = null;
	
	private String status = "0";
		  public insert_accounts(){
		  
		  }
		  @SuppressWarnings("restriction")
		public String send(String Token, String id,String deleted,String SME_ID,String date_entered,String date_modified,String modified_user_id,String created_by,String description,String assigned_user_id,String name,String account_type,String industry,String annual_revenue,String email,String secondaryemail,String phone_fax,String rating,String phone_office,String phone_alternate,String website,String ownership,String employees,String ticker_symbol,String billing_address_street,String billing_address_city,String billing_address_state,String billing_address_postalcode,String billing_address_country,String billing_address_pobox,String shipping_address_street,String shipping_address_city,String shipping_address_state,String shipping_address_postalcode,String shipping_address_country,String shipping_address_pobox,String parent_id,String sic_code,String campaign_id,String emailoptout,String notify_owner){
		 
		  try{
			 
//		   URL httpurl = new URL("https://140.116.82.17:8463/CSMP_DMM/backup_opportunities.do");
		   URL httpurl = new URL("http://dmm.vcap.me/backup_accounts.do");
		   
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
		    this.name = "name="+URLEncoder.encode(((name==null||name==""||name=="NULL")?"NULL":"\""+name+"\""),"UTF-8");
		    this.account_type = "account_type="+URLEncoder.encode(((account_type==null||account_type==""||account_type=="NULL")?"NULL":"\""+account_type+"\""),"UTF-8");
		    this.industry = "industry="+URLEncoder.encode(((industry==null||industry==""||industry=="NULL")?"NULL":"\""+industry+"\""),"UTF-8");
		    this.annual_revenue = "annual_revenue="+URLEncoder.encode(((annual_revenue==null||annual_revenue==""||annual_revenue=="NULL")?"NULL":"\""+annual_revenue+"\""),"UTF-8");
		    this.email = "email="+URLEncoder.encode(((email==null||email==""||email=="NULL")?"NULL":"\""+email+"\""),"UTF-8");
		    this.secondaryemail = "secondaryemail="+URLEncoder.encode(((secondaryemail==null||secondaryemail=="NULL")?"NULL":"\""+secondaryemail+"\""),"UTF-8");
		    this.phone_fax = "phone_fax="+URLEncoder.encode(((phone_fax==null||phone_fax==""||phone_fax=="NULL")?"NULL":"\""+phone_fax+"\""),"UTF-8");
		    this.rating = "rating="+URLEncoder.encode(((rating==null||rating==""||rating=="NULL")?"NULL":"\""+rating+"\""),"UTF-8");
		    this.phone_office = "phone_office="+URLEncoder.encode(((phone_office==null||phone_office==""||phone_office=="NULL")?"NULL":"\""+phone_office+"\""),"UTF-8");
		    this.phone_alternate = "phone_alternate="+URLEncoder.encode(((phone_alternate==null||phone_alternate==""||phone_alternate=="NULL")?"NULL":"\""+phone_alternate+"\""),"UTF-8");
		    this.website = "website="+URLEncoder.encode(((website==null||website==""||website=="NULL")?"NULL":"\""+website+"\""),"UTF-8");
		    this.ownership = "ownership="+URLEncoder.encode(((ownership==null||ownership==""||ownership=="NULL")?"NULL":"\""+ownership+"\""),"UTF-8");
		    this.employees = "employees="+URLEncoder.encode(((employees==null||employees==""||employees=="NULL")?"NULL":"\""+employees+"\""),"UTF-8");
		    this.ticker_symbol = "ticker_symbol="+URLEncoder.encode(((ticker_symbol==null||ticker_symbol==""||ticker_symbol=="NULL")?"NULL":"\""+ticker_symbol+"\""),"UTF-8");
		    this.billing_address_street = "billing_address_street="+URLEncoder.encode(((billing_address_street==null||billing_address_street==""||billing_address_street=="NULL")?"NULL":"\""+billing_address_street+"\""),"UTF-8");
		    this.billing_address_city = "billing_address_city="+URLEncoder.encode(((billing_address_city==null||billing_address_city==""||billing_address_city=="NULL")?"NULL":"\""+billing_address_city+"\""),"UTF-8");
		    this.billing_address_state = "billing_address_state="+URLEncoder.encode(((billing_address_state==null||billing_address_state==""||billing_address_state=="NULL")?"NULL":"\""+billing_address_state+"\""),"UTF-8");
		    this.billing_address_postalcode = "billing_address_postalcode="+URLEncoder.encode(((billing_address_postalcode==null||billing_address_postalcode==""||billing_address_postalcode=="NULL")?"NULL":"\""+billing_address_postalcode+"\""),"UTF-8");
		    this.billing_address_country = "billing_address_country="+URLEncoder.encode(((billing_address_country==null||billing_address_country==""||billing_address_country=="NULL")?"NULL":"\""+billing_address_country+"\""),"UTF-8");
		    this.billing_address_pobox = "billing_address_pobox="+URLEncoder.encode(((billing_address_pobox==null||billing_address_pobox==""||billing_address_pobox=="NULL")?"NULL":"\""+billing_address_pobox+"\""),"UTF-8");
		    this.shipping_address_street = "shipping_address_street="+URLEncoder.encode(((shipping_address_street==null||shipping_address_street==""||shipping_address_street=="NULL")?"NULL":"\""+shipping_address_street+"\""),"UTF-8");
		    this.shipping_address_city = "shipping_address_city="+URLEncoder.encode(((shipping_address_city==null||shipping_address_city==""||shipping_address_city=="NULL")?"NULL":"\""+shipping_address_city+"\""),"UTF-8");
		    this.shipping_address_state = "shipping_address_state="+URLEncoder.encode(((shipping_address_state==null||shipping_address_state==""||shipping_address_state=="NULL")?"NULL":"\""+shipping_address_state+"\""),"UTF-8");
		    this.shipping_address_postalcode = "shipping_address_postalcode="+URLEncoder.encode(((shipping_address_postalcode==null||shipping_address_postalcode==""||shipping_address_postalcode=="NULL")?"NULL":"\""+shipping_address_postalcode+"\""),"UTF-8");
		    this.shipping_address_country = "shipping_address_country="+URLEncoder.encode(((shipping_address_country==null||shipping_address_country==""||shipping_address_country=="NULL")?"NULL":"\""+shipping_address_country+"\""),"UTF-8");
		    this.shipping_address_pobox = "shipping_address_pobox="+URLEncoder.encode(((shipping_address_pobox==null||shipping_address_pobox==""||shipping_address_pobox=="NULL")?"NULL":"\""+shipping_address_pobox+"\""),"UTF-8");
		    this.parent_id = "parent_id="+URLEncoder.encode(((parent_id==null||parent_id==""||parent_id=="NULL")?"NULL":"\""+parent_id+"\""),"UTF-8");
		    this.sic_code = "sic_code="+URLEncoder.encode(((sic_code==null||sic_code==""||sic_code=="NULL")?"NULL":"\""+sic_code+"\""),"UTF-8");
		    this.campaign_id = "campaign_id="+URLEncoder.encode(((campaign_id==null||campaign_id==""||campaign_id=="NULL")?"NULL":"\""+campaign_id+"\""),"UTF-8");
		    this.emailoptout = "emailoptout="+URLEncoder.encode(((emailoptout==null||emailoptout==""||emailoptout=="NULL")?"NULL":"\""+emailoptout+"\""),"UTF-8");
		    this.notify_owner = "notify_owner="+URLEncoder.encode(((notify_owner==null||notify_owner==""||notify_owner=="NULL")?"NULL":"\""+notify_owner+"\""),"UTF-8");
		    
		    
		   out.print(this.Token+"&"+this.id+"&"+this.deleted+"&"+this.SME_ID+"&"+this.date_entered+"&"+this.date_modified+"&"+this.modified_user_id+"&"+this.created_by+"&"+this.description+"&"+this.assigned_user_id+"&"+this.name+"&"+this.account_type+"&"+this.industry+"&"+this.annual_revenue+"&"+this.email+"&"+this.secondaryemail+"&"+this.phone_fax+"&"+this.rating+"&"+this.phone_office+"&"+this.phone_alternate+"&"+this.website+"&"+this.ownership+"&"+this.employees+"&"+this.ticker_symbol+"&"+this.billing_address_street+"&"+this.billing_address_city+"&"+this.billing_address_state+"&"+this.billing_address_postalcode+"&"+this.billing_address_country+"&"+this.billing_address_pobox+"&"+this.shipping_address_street+"&"+this.shipping_address_city+"&"+this.shipping_address_state+"&"+this.shipping_address_postalcode+"&"+this.shipping_address_country+"&"+this.shipping_address_pobox+"&"+this.parent_id+"&"+this.sic_code+"&"+this.campaign_id+"&"+this.emailoptout+"&"+this.notify_owner);
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
