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




public class insert_users {
	private String Token = null;
	private String id=null ;
	private String deleted=null ;
	private String SME_ID=null ;
	private String date_entered=null ;
	private String date_modified=null ;
	private String modified_user_id=null ;
	private String created_by=null ;
	private String description=null ;
	
	private String user_name=null ;
	private String user_password=null ;
	private String first_name=null ;
	private String last_name=null ;
	private String is_admin=null ;
	private String title=null ;
	private String role_id=null ;
	private String department=null ;
	private String email=null ;
	private String secondaryemail=null ;
	private String phone_home=null ;
	private String phone_mobile=null ;
	private String phone_work=null ;
	private String phone_other=null ;
	private String phone_fax=null ;
	private String status=null ;
	private String address_street=null ;
	private String address_city=null ;
	private String address_state=null ;
	private String address_country=null ;
	private String address_postalcode=null ;
	private String alt_address_pobox=null ;
	private String messenger_id=null ;
	private String messenger_type=null ;
	private String reports_to_id=null ;
	private String date_format=null ;
	private String time_zone=null ;
	private String currency=null ;
	private String language=null ;

	
	private String Restatus = "0";
		  public insert_users(){
		  
		  }
		  @SuppressWarnings("restriction")
		public String send(String Token,String id,String deleted,String SME_ID,String date_entered,String date_modified,String modified_user_id,String created_by,String description,String user_name,String user_password,String first_name,String last_name,String is_admin,String title,String role_id,String department,String email,String secondaryemail,String phone_home,String phone_mobile,String phone_work,String phone_other,String phone_fax,String status,String address_street,String address_city,String address_state,String address_country,String address_postalcode,String alt_address_pobox,String messenger_id,String messenger_type,String reports_to_id,String date_format,String time_zone,String currency,String language){
		 
		  try{
			 
//		   URL httpurl = new URL("https://140.116.82.17:8463/CSMP_DMM/backup_opportunities.do");
		   URL httpurl = new URL("http://csmp_dmm_chichi.vcap.me/backup_users.do");
		   
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
		    
		    this.user_name = "user_name="+URLEncoder.encode(((user_name==null||user_name==""||user_name=="NULL")?"NULL":"\""+user_name+"\""),"UTF-8");
		    this.user_password = "user_password="+URLEncoder.encode(((user_password==null||user_password==""||user_password=="NULL")?"NULL":"\""+user_password+"\""),"UTF-8");
		    this.first_name = "first_name="+URLEncoder.encode(((first_name==null||first_name==""||first_name=="NULL")?"NULL":"\""+first_name+"\""),"UTF-8");
		    this.last_name = "last_name="+URLEncoder.encode(((last_name==null||last_name==""||last_name=="NULL")?"NULL":"\""+last_name+"\""),"UTF-8");
		    this.is_admin = "is_admin="+URLEncoder.encode(((is_admin==null||is_admin==""||is_admin=="NULL")?"NULL":"\""+is_admin+"\""),"UTF-8");
		    this.title = "title="+URLEncoder.encode(((title==null||title==""||title=="NULL")?"NULL":"\""+title+"\""),"UTF-8");
		    this.role_id = "role_id="+URLEncoder.encode(((role_id==null||role_id==""||role_id=="NULL")?"NULL":"\""+role_id+"\""),"UTF-8");
		    this.department = "department="+URLEncoder.encode(((department==null||department==""||department=="NULL")?"NULL":"\""+department+"\""),"UTF-8");
		    this.email = "email="+URLEncoder.encode(((email==null||email==""||email=="NULL")?"NULL":"\""+email+"\""),"UTF-8");
		    this.secondaryemail = "secondaryemail="+URLEncoder.encode(((secondaryemail==null||secondaryemail==""||secondaryemail=="NULL")?"NULL":"\""+secondaryemail+"\""),"UTF-8");
		    this.phone_home = "phone_home="+URLEncoder.encode(((phone_home==null||phone_home==""||phone_home=="NULL")?"NULL":"\""+phone_home+"\""),"UTF-8");
		    this.phone_mobile = "phone_mobile="+URLEncoder.encode(((phone_mobile==null||phone_mobile==""||phone_mobile=="NULL")?"NULL":"\""+phone_mobile+"\""),"UTF-8");
		    this.phone_work = "phone_work="+URLEncoder.encode(((phone_work==null||phone_work==""||phone_work=="NULL")?"NULL":"\""+phone_work+"\""),"UTF-8");
		    this.phone_other = "phone_other="+URLEncoder.encode(((phone_other==null||phone_other==""||phone_other=="NULL")?"NULL":"\""+phone_other+"\""),"UTF-8");
		    this.phone_fax = "phone_fax="+URLEncoder.encode(((phone_fax==null||phone_fax==""||phone_fax=="NULL")?"NULL":"\""+phone_fax+"\""),"UTF-8");
		    this.status = "status="+URLEncoder.encode(((status==null||status==""||status=="NULL")?"NULL":"\""+status+"\""),"UTF-8");
		    this.address_street = "address_street="+URLEncoder.encode(((address_street==null||address_street==""||address_street=="NULL")?"NULL":"\""+address_street+"\""),"UTF-8");
		    this.address_city = "address_city="+URLEncoder.encode(((address_city==null||address_city==""||address_city=="NULL")?"NULL":"\""+address_city+"\""),"UTF-8");
		    this.address_state = "address_state="+URLEncoder.encode(((address_state==null||address_state==""||address_state=="NULL")?"NULL":"\""+address_state+"\""),"UTF-8");
		    this.address_country = "address_country="+URLEncoder.encode(((address_country==null||address_country==""||address_country=="NULL")?"NULL":"\""+address_country+"\""),"UTF-8");
		    this.address_postalcode = "address_postalcode="+URLEncoder.encode(((address_postalcode==null||address_postalcode==""||address_postalcode=="NULL")?"NULL":"\""+address_postalcode+"\""),"UTF-8");
		    this.alt_address_pobox = "alt_address_pobox="+URLEncoder.encode(((alt_address_pobox==null||alt_address_pobox==""||alt_address_pobox=="NULL")?"NULL":"\""+alt_address_pobox+"\""),"UTF-8");
		    this.messenger_id = "messenger_id="+URLEncoder.encode(((messenger_id==null||messenger_id==""||messenger_id=="NULL")?"NULL":"\""+messenger_id+"\""),"UTF-8");
		    this.messenger_type = "messenger_type="+URLEncoder.encode(((messenger_type==null||messenger_type==""||messenger_type=="NULL")?"NULL":"\""+messenger_type+"\""),"UTF-8");
		    this.reports_to_id = "reports_to_id="+URLEncoder.encode(((reports_to_id==null||reports_to_id==""||reports_to_id=="NULL")?"NULL":"\""+reports_to_id+"\""),"UTF-8");
		    this.date_format = "date_format="+URLEncoder.encode(((date_format==null||date_format==""||date_format=="NULL")?"NULL":"\""+date_format+"\""),"UTF-8");
		    this.time_zone = "time_zone="+URLEncoder.encode(((time_zone==null||time_zone==""||time_zone=="NULL")?"NULL":"\""+time_zone+"\""),"UTF-8");
		    this.currency = "currency="+URLEncoder.encode(((currency==null||currency==""||currency=="NULL")?"NULL":"\""+currency+"\""),"UTF-8");
		    this.language = "language="+URLEncoder.encode(((language==null||language==""||language=="NULL")?"NULL":"\""+language+"\""),"UTF-8");

		    out.print(this.Token+"&"+this.id+"&"+this.deleted+"&"+this.SME_ID+"&"+this.date_entered+"&"+this.date_modified+"&"+this.modified_user_id+"&"+this.created_by+"&"+this.description+"&"+this.user_name+"&"+this.user_password+"&"+this.first_name+"&"+this.last_name+"&"+this.is_admin+"&"+this.title+"&"+this.role_id+"&"+this.department+"&"+this.email+"&"+this.secondaryemail+"&"+this.phone_home+"&"+this.phone_mobile+"&"+this.phone_work+"&"+this.phone_other+"&"+this.phone_fax+"&"+this.status+"&"+this.address_street+"&"+this.address_city+"&"+this.address_state+"&"+this.address_country+"&"+this.address_postalcode+"&"+this.alt_address_pobox+"&"+this.messenger_id+"&"+this.messenger_type+"&"+this.reports_to_id+"&"+this.date_format+"&"+this.time_zone+"&"+this.currency+"&"+this.language);
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
