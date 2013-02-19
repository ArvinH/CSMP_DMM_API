package CSMP_DMM_API;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;




public class insert_opportunities {
	private String id = null;
	private String SME_ID = null;
	private String name = null;
	private String date_entered = null;
	private String date_modified = null;
	private String modified_user_id = null;
	private String created_by = null;
	private String description = null;
	private String deleted = null;
	private String assigned_user_id = null;
	private String opportunity_type = null;
	private String campaign_id = null;
	private String lead_source = null;
	private String amount = null;
	private String amount_usdollar = null;
	private String date_closed = null;
	private String next_step = null;
	private String sales_stage = null;
	private String probability = null;
		  public insert_opportunities(){
		  
		  }
		  @SuppressWarnings("restriction")
		public void send(String id, String SME_ID, String name, String date_entered, String date_modified, String modified_user_id, String created_by, String description, String
					deleted, String assigned_user_id, String opportunity_type, String campaign_id, String lead_source, String amount, String amount_usdollar, String date_closed, 
					String next_step, String sales_stage, String probability){
		 
		  try{
			 
		   URL httpurl = new URL("https://192.168.1.160:8443/CSMP_DMM/insert_opportunities.do");
		   
		   HostnameVerifier hv = new HostnameVerifier() {
		        public boolean verify(String urlHostName, SSLSession session) {
		            System.out.println("Warning: URL Host: " + urlHostName + " vs. "
		                               + session.getPeerHost());
		            return true;
		        }
		    };
		   trustAllHttpsCertificates();
		   HttpsURLConnection.setDefaultHostnameVerifier(hv);

		   HttpsURLConnection httpConn = (HttpsURLConnection)httpurl.openConnection(); 
		   httpConn.setRequestMethod("POST");
		   httpConn.setDoOutput(true);
		   httpConn.setDoInput(true);
		   httpConn.setUseCaches(false);
		   PrintWriter out = new PrintWriter(httpConn.getOutputStream());
		    this.id = "id="+URLEncoder.encode(id,"UTF-8");
		    this.SME_ID = "SME_ID="+URLEncoder.encode(SME_ID,"UTF-8");
		    this.name = "name="+URLEncoder.encode(name,"UTF-8");
		    this.date_entered = "date_entered="+URLEncoder.encode(date_entered,"UTF-8");
		    this.date_modified = "date_modified="+URLEncoder.encode(date_modified,"UTF-8");
		    this.modified_user_id = "modified_user_id="+URLEncoder.encode(modified_user_id,"UTF-8");
		    this.created_by = "created_by="+URLEncoder.encode(created_by,"UTF-8");
		    this.description = "description="+URLEncoder.encode(description,"UTF-8");
		    this.deleted = "deleted="+URLEncoder.encode(deleted,"UTF-8");
		    this.assigned_user_id = "assigned_user_id="+URLEncoder.encode(assigned_user_id,"UTF-8");
		    this.opportunity_type = "opportunity_type="+URLEncoder.encode(opportunity_type,"UTF-8");
		    this.campaign_id = "campaign_id="+URLEncoder.encode(campaign_id,"UTF-8");
		    this.lead_source = "lead_source="+URLEncoder.encode(lead_source,"UTF-8");
		    this.amount = "amount="+URLEncoder.encode(amount,"UTF-8");
		    this.amount_usdollar = "amount_usdollar="+URLEncoder.encode(amount_usdollar,"UTF-8");
		    this.date_closed = "date_closed="+URLEncoder.encode(date_closed,"UTF-8");
		    this.next_step = "next_step="+URLEncoder.encode(next_step,"UTF-8");
		    this.sales_stage = "sales_stage="+URLEncoder.encode(sales_stage,"UTF-8");
		    this.probability = "probability="+URLEncoder.encode(probability,"UTF-8");
		
		   out.print(this.id+"&"+this.SME_ID+"&"+this.name+"&"+this.date_entered+"&"+this.date_modified+"&"+this.modified_user_id+"&"+
		    this.created_by+"&"+this.description+"&"+this.deleted+"&"+this.assigned_user_id+"&"+this.opportunity_type+"&"+
		    this.campaign_id+"&"+this.lead_source+"&"+this.amount+"&"+this.amount_usdollar+"&"+this.date_closed+"&"+
		    this.next_step+"&"+this.sales_stage+"&"+this.probability);
		   out.flush();
		   out.close();
		   BufferedReader br = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
		   br.close();
		  }catch(Exception e){
		   e.printStackTrace();
		  }
		  
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
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public boolean isServerTrusted(
						java.security.cert.X509Certificate[] certs) {
					return true;
				}

				public boolean isClientTrusted(
						java.security.cert.X509Certificate[] certs) {
					return true;
				}

				public void checkServerTrusted(
						java.security.cert.X509Certificate[] certs, String authType)
						throws java.security.cert.CertificateException {
					return;
				}

				public void checkClientTrusted(
						java.security.cert.X509Certificate[] certs, String authType)
						throws java.security.cert.CertificateException {
					return;
				}
			}

}
