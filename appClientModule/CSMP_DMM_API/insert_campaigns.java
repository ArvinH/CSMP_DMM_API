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




public class insert_campaigns {
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
	private String type = null;
	private String status = null;
	private String date_closed = null;
	private String expectedrevenue = null;
	private String budgetcost = null;
	private String actualcost = null;
	private String expectedresponse = null;
	private String numsent = null;
	private String product_id = null;
	private String sponsor = null;
	private String targetaudience = null;
	private String targetsize = null;
	private String expectedresponsecount = null;
	private String expectedsalescount = null;
	private String expectedroi = null;
	private String actualresponsecount = null;
	private String actualsalescount = null;
	private String actualroi = null;
	private String ReStatus = "0";
		  public insert_campaigns(){
		  
		  }
		  @SuppressWarnings("restriction")
		public String send(String Token, String id, String deleted, String SME_ID, String date_entered, String date_modified, String modified_user_id, String created_by, String description,
				String assigned_user_id, String name, String type, String status, String date_closed, String expectedrevenue, String budgetcost, 
					String actualcost, String expectedresponse, String numsent, String product_id, String sponsor, String targetaudience, String targetsize, String expectedresponsecount,
					String expectedsalescount, String expectedroi, String actualresponsecount, String actualsalescount, String actualroi){
		 
		  try{
			 
		   URL httpurl = new URL("https://140.116.82.17:8463/CSMP_DMM/backup_campaigns.do");
		   
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
		   this.type = "type="+URLEncoder.encode(type,"UTF-8");
		   this.status = "status="+URLEncoder.encode(status,"UTF-8");
		   this.date_closed = "date_closed="+URLEncoder.encode(date_closed,"UTF-8");
		   this.expectedrevenue = "expectedrevenue="+URLEncoder.encode(expectedrevenue,"UTF-8");
		   this.budgetcost = "budgetcost="+URLEncoder.encode(budgetcost,"UTF-8");
		   this.actualcost = "actualcost="+URLEncoder.encode(actualcost,"UTF-8");
		   this.expectedresponse = "expectedresponse="+URLEncoder.encode(expectedresponse,"UTF-8");
		   this.numsent = "numsent="+URLEncoder.encode(numsent,"UTF-8");
		   this.product_id = "product_id="+URLEncoder.encode(product_id,"UTF-8");
		   this.sponsor = "sponsor="+URLEncoder.encode(sponsor,"UTF-8");
		   this.targetaudience = "targetaudience="+URLEncoder.encode(targetaudience,"UTF-8");
		   this.targetsize = "targetsize="+URLEncoder.encode(targetsize,"UTF-8");
		   this.expectedresponsecount = "expectedresponsecount="+URLEncoder.encode(expectedresponsecount,"UTF-8");
		   this.expectedsalescount = "expectedsalescount="+URLEncoder.encode(expectedsalescount,"UTF-8");
		   this.expectedroi = "expectedroi="+URLEncoder.encode(expectedroi,"UTF-8");
		   this.actualresponsecount = "actualresponsecount="+URLEncoder.encode(actualresponsecount,"UTF-8");
		   this.actualsalescount = "actualsalescount="+URLEncoder.encode(actualsalescount,"UTF-8");
		   this.actualroi = "actualroi="+URLEncoder.encode(actualroi,"UTF-8");
		   
	
		   
		
		   out.print(this.Token+"&"+this.id+"&"+this.deleted+"&"+this.SME_ID+"&"+this.date_entered+"&"+this.date_modified+"&"+this.modified_user_id+"&"+
		    this.created_by+"&"+this.description+"&"+this.assigned_user_id+"&"+this.name+"&"+this.type+"&"+
		    this.status+"&"+this.date_closed+"&"+this.expectedrevenue+"&"+this.budgetcost+"&"+this.actualcost+"&"+
		    this.expectedresponse+"&"+this.numsent+"&"+this.product_id+"&"+this.sponsor+"&"+this.targetaudience+"&"+this.targetsize+"&"+this.expectedresponsecount+"&"+this.expectedsalescount
		    +"&"+this.expectedroi+"&"+this.actualresponsecount+"&"+this.actualsalescount+"&"+this.actualroi);
		   out.flush();
		   out.close();
		   BufferedReader br = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
		   ReStatus =br.readLine();
		   br.close();
		   
		  }catch(Exception e){
		   e.printStackTrace();
		  }
		return ReStatus;
		  
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
