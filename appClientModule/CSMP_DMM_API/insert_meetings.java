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




public class insert_meetings {
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
	private String name=null ;
	private String location=null ;
	private String duration_hours=null ;
	private String duration_minutes=null ;
	private String date_start=null ;
	private String date_end=null ;
	private String parent_type=null ;
	private String status=null ;
	private String type=null ;
	private String parent_id=null ;
	private String reminder_time=null ;

	
	private String Restatus = "0";
		  public insert_meetings(){
		  
		  }
		  @SuppressWarnings("restriction")
		public String send(String Token,String id,String deleted,String SME_ID,String date_entered,String date_modified,String modified_user_id,String created_by,String description,String assigned_user_id,String name,String location,String duration_hours,String duration_minutes,String date_start,String date_end,String parent_type,String status,String type,String parent_id,String reminder_time){
		 
		  try{
			 
//		   URL httpurl = new URL("https://140.116.82.17:8463/CSMP_DMM/backup_opportunities.do");
		   URL httpurl = new URL("http://dmm.vcap.me/backup_meetings.do");
		   
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
		    this.location = "location="+URLEncoder.encode(((location==null||location==""||location=="NULL")?"NULL":"\""+location+"\""),"UTF-8");
		    this.duration_hours = "duration_hours="+URLEncoder.encode(((duration_hours==null||duration_hours==""||duration_hours=="NULL")?"NULL":"\""+duration_hours+"\""),"UTF-8");
		    this.duration_minutes = "duration_minutes="+URLEncoder.encode(((duration_minutes==null||duration_minutes==""||duration_minutes=="NULL")?"NULL":"\""+duration_minutes+"\""),"UTF-8");
		    this.date_start = "date_start="+URLEncoder.encode(((date_start==null||date_start==""||date_start=="NULL")?"NULL":"\""+date_start+"\""),"UTF-8");
		    this.date_end = "date_end="+URLEncoder.encode(((date_end==null||date_end==""||date_end=="NULL")?"NULL":"\""+date_end+"\""),"UTF-8");
		    this.parent_type = "parent_type="+URLEncoder.encode(((parent_type==null||parent_type==""||parent_type=="NULL")?"NULL":"\""+parent_type+"\""),"UTF-8");
		    this.status = "status="+URLEncoder.encode(((status==null||status==""||status=="NULL")?"NULL":"\""+status+"\""),"UTF-8");
		    this.type = "type="+URLEncoder.encode(((type==null||type==""||type=="NULL")?"NULL":"\""+type+"\""),"UTF-8");
		    this.parent_id = "parent_id="+URLEncoder.encode(((parent_id==null||parent_id==""||parent_id=="NULL")?"NULL":"\""+parent_id+"\""),"UTF-8");
		    this.reminder_time = "reminder_time="+URLEncoder.encode(((reminder_time==null||reminder_time==""||reminder_time=="NULL")?"NULL":"\""+reminder_time+"\""),"UTF-8");


		    
		    out.print(this.Token+"&"+this.id+"&"+this.deleted+"&"+this.SME_ID+"&"+this.date_entered+"&"+this.date_modified+"&"+this.modified_user_id+"&"+this.created_by+"&"+this.description+"&"+this.assigned_user_id+"&"+this.name+"&"+this.location+"&"+this.duration_hours+"&"+this.duration_minutes+"&"+this.date_start+"&"+this.date_end+"&"+this.parent_type+"&"+this.status+"&"+this.type+"&"+this.parent_id+"&"+this.reminder_time);
		   out.flush();
		   out.close();
		   BufferedReader br = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
		   Restatus = br.readLine();
		   br.close();
		   
		  }catch(Exception e){
		   e.printStackTrace();
		  }
		return Restatus;
		  
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
