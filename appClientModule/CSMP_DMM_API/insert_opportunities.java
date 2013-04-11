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




public class insert_opportunities {
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
	private String related_to = null;
	private String opportunity_type = null;
	private String campaign_id = null;
	private String lead_source = null;
	private String amount = null;
	private String date_closed = null;
	private String next_step = null;
	private String sales_stage = null;
	private String probability = null;
	private int status = 0;
		  public insert_opportunities(){
		  
		  }
		  @SuppressWarnings("restriction")
		public int send(String Token, String id,String deleted, String SME_ID, String date_entered, String date_modified, String modified_user_id, String created_by, String description,  String assigned_user_id, String name, String related_to, String opportunity_type, String campaign_source, String lead_source, String amount,String date_closed, 
					String next_step, String sales_stage, String probability){
		 
		  try{
			 
		   URL httpurl = new URL("https://140.116.82.17:8463/CSMP_DMM/insert_opportunities.do");
		   
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
		    this.Token = "Token="+URLEncoder.encode(Token,"UTF-8");
		    this.id = "id="+URLEncoder.encode(id,"UTF-8");
		    this.deleted = "deleted="+URLEncoder.encode(deleted,"UTF-8");
		    this.SME_ID = "SME_ID="+URLEncoder.encode(SME_ID,"UTF-8");
		    this.date_entered = "date_entered="+URLEncoder.encode(date_entered,"UTF-8");
		    this.date_modified = "date_modified="+URLEncoder.encode(date_modified,"UTF-8");
		    this.modified_user_id = "modified_user_id="+URLEncoder.encode(modified_user_id,"UTF-8");
		    this.created_by = "created_by="+URLEncoder.encode(created_by,"UTF-8");
		    this.description = "description="+URLEncoder.encode(description,"UTF-8");
		    this.assigned_user_id = "assigned_user_id="+URLEncoder.encode(assigned_user_id,"UTF-8");
		    this.name = "name="+URLEncoder.encode(name,"UTF-8");
            this.related_to = "related_to="+URLEncoder.encode(related_to,"UTF-8");  
		    this.opportunity_type = "opportunity_type="+URLEncoder.encode(opportunity_type,"UTF-8");
		    this.campaign_id = "campaign_id="+URLEncoder.encode(campaign_id,"UTF-8");
		    this.lead_source = "lead_source="+URLEncoder.encode(lead_source,"UTF-8");
		    this.amount = "amount="+URLEncoder.encode(amount,"UTF-8");
		    this.date_closed = "date_closed="+URLEncoder.encode(date_closed,"UTF-8");
		    this.next_step = "next_step="+URLEncoder.encode(next_step,"UTF-8");
		    this.sales_stage = "sales_stage="+URLEncoder.encode(sales_stage,"UTF-8");
		    this.probability = "probability="+URLEncoder.encode(probability,"UTF-8");
		
		   out.print(this.Token+"&"+this.id+"&"+this.deleted+"&"+this.SME_ID+"&"+this.date_entered+"&"+this.date_modified+"&"+this.modified_user_id+"&"+
		    this.created_by+"&"+this.description+"&"+this.assigned_user_id+"&"+this.name+"&"+this.related_to+"&"+
		    this.opportunity_type+"&"+this.campaign_id+"&"+this.lead_source+"&"+this.amount+"&"+this.date_closed+"&"+
		    this.next_step+"&"+this.sales_stage+"&"+this.probability);
		   out.flush();
		   out.close();
		   BufferedReader br = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
		   status = Integer.parseInt(br.readLine());
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
			            tks.load(new FileInputStream("SSL/serverstore.jks"),
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
