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




public class insert_quotes {
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
	private String subject=null ;
	private String opportunityid=null ;
	private String accountid=null ;
	private String quotestatus=null ;
	private String validtill=null ;
	private String contactid=null ;
	private String carrier=null ;
	private String shipping=null ;
	private String inventorymanager=null ;
	private String subtotal=null ;
	private String adjustment=null ;
	private String total=null ;
	private String taxtype=null ;
	private String discount_percent=null ;
	private String discount_amount=null ;
	private String s_h_amount=null ;
	private String terms_conditions=null ;
	private String currency=null ;
	private String conversion_rate=null ;
	private String billing_address_street=null ;
	private String billing_address_city=null ;
	private String billing_address_state=null ;
	private String billing_address_postalcode=null ;
	private String billing_address_country=null ;
	private String billing_address_pobox=null ;
	private String shipping_address_street=null ;
	private String shipping_address_city=null ;
	private String shipping_address_state=null ;
	private String shipping_address_postalcode=null ;
	private String shipping_address_country=null ;
	private String shipping_address_pobox=null ;

	
	private String status = "0";
		  public insert_quotes(){
		  
		  }
		  @SuppressWarnings("restriction")
		public String send(String Token,String id,String deleted,String SME_ID,String date_entered,String date_modified,String modified_user_id,String created_by,String description,String assigned_user_id,String subject,String opportunityid,String accountid,String quotestatus,String validtill,String contactid,String carrier,String shipping,String inventorymanager,String subtotal,String adjustment,String total,String taxtype,String discount_percent,String discount_amount,String s_h_amount,String terms_conditions,String currency,String conversion_rate,String billing_address_street,String billing_address_city,String billing_address_state,String billing_address_postalcode,String billing_address_country,String billing_address_pobox,String shipping_address_street,String shipping_address_city,String shipping_address_state,String shipping_address_postalcode,String shipping_address_country,String shipping_address_pobox){
		 
		  try{
			 
//		   URL httpurl = new URL("https://140.116.82.17:8463/CSMP_DMM/backup_opportunities.do");
		   URL httpurl = new URL("http://csmp_dmm_chichi.vcap.me/backup_quotes.do");
		   
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
		    this.subject = "subject="+URLEncoder.encode(((subject==null||subject==""||subject=="NULL")?"NULL":"\""+subject+"\""),"UTF-8");
		    this.opportunityid = "opportunityid="+URLEncoder.encode(((opportunityid==null||opportunityid==""||opportunityid=="NULL")?"NULL":"\""+opportunityid+"\""),"UTF-8");
		    this.accountid = "accountid="+URLEncoder.encode(((accountid==null||accountid==""||accountid=="NULL")?"NULL":"\""+accountid+"\""),"UTF-8");
		    this.quotestatus = "quotestatus="+URLEncoder.encode(((quotestatus==null||quotestatus==""||quotestatus=="NULL")?"NULL":"\""+quotestatus+"\""),"UTF-8");
		    this.validtill = "validtill="+URLEncoder.encode(((validtill==null||validtill==""||validtill=="NULL")?"NULL":"\""+validtill+"\""),"UTF-8");
		    this.contactid = "contactid="+URLEncoder.encode(((contactid==null||contactid==""||contactid=="NULL")?"NULL":"\""+contactid+"\""),"UTF-8");
		    this.carrier = "carrier="+URLEncoder.encode(((carrier==null||carrier==""||carrier=="NULL")?"NULL":"\""+carrier+"\""),"UTF-8");
		    this.shipping = "shipping="+URLEncoder.encode(((shipping==null||shipping==""||shipping=="NULL")?"NULL":"\""+shipping+"\""),"UTF-8");
		    this.inventorymanager = "inventorymanager="+URLEncoder.encode(((inventorymanager==null||inventorymanager==""||inventorymanager=="NULL")?"NULL":"\""+inventorymanager+"\""),"UTF-8");
		    this.subtotal = "subtotal="+URLEncoder.encode(((subtotal==null||subtotal==""||subtotal=="NULL")?"NULL":"\""+subtotal+"\""),"UTF-8");
		    this.adjustment = "adjustment="+URLEncoder.encode(((adjustment==null||adjustment==""||adjustment=="NULL")?"NULL":"\""+adjustment+"\""),"UTF-8");
		    this.total = "total="+URLEncoder.encode(((total==null||total==""||total=="NULL")?"NULL":"\""+total+"\""),"UTF-8");
		    this.taxtype = "taxtype="+URLEncoder.encode(((taxtype==null||taxtype==""||taxtype=="NULL")?"NULL":"\""+taxtype+"\""),"UTF-8");
		    this.discount_percent = "discount_percent="+URLEncoder.encode(((discount_percent==null||discount_percent==""||discount_percent=="NULL")?"NULL":"\""+discount_percent+"\""),"UTF-8");
		    this.discount_amount = "discount_amount="+URLEncoder.encode(((discount_amount==null||discount_amount==""||discount_amount=="NULL")?"NULL":"\""+discount_amount+"\""),"UTF-8");
		    this.s_h_amount = "s_h_amount="+URLEncoder.encode(((s_h_amount==null||s_h_amount==""||s_h_amount=="NULL")?"NULL":"\""+s_h_amount+"\""),"UTF-8");
		    this.terms_conditions = "terms_conditions="+URLEncoder.encode(((terms_conditions==null||terms_conditions==""||terms_conditions=="NULL")?"NULL":"\""+terms_conditions+"\""),"UTF-8");
		    this.currency = "currency="+URLEncoder.encode(((currency==null||currency==""||currency=="NULL")?"NULL":"\""+currency+"\""),"UTF-8");
		    this.conversion_rate = "conversion_rate="+URLEncoder.encode(((conversion_rate==null||conversion_rate==""||conversion_rate=="NULL")?"NULL":"\""+conversion_rate+"\""),"UTF-8");
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

		    out.print(this.Token+"&"+this.id+"&"+this.deleted+"&"+this.SME_ID+"&"+this.date_entered+"&"+this.date_modified+"&"+this.modified_user_id+"&"+this.created_by+"&"+this.description+"&"+this.assigned_user_id+"&"+this.subject+"&"+this.opportunityid+"&"+this.accountid+"&"+this.quotestatus+"&"+this.validtill+"&"+this.contactid+"&"+this.carrier+"&"+this.shipping+"&"+this.inventorymanager+"&"+this.subtotal+"&"+this.adjustment+"&"+this.total+"&"+this.taxtype+"&"+this.discount_percent+"&"+this.discount_amount+"&"+this.s_h_amount+"&"+this.terms_conditions+"&"+this.currency+"&"+this.conversion_rate+"&"+this.billing_address_street+"&"+this.billing_address_city+"&"+this.billing_address_state+"&"+this.billing_address_postalcode+"&"+this.billing_address_country+"&"+this.billing_address_pobox+"&"+this.shipping_address_street+"&"+this.shipping_address_city+"&"+this.shipping_address_state+"&"+this.shipping_address_postalcode+"&"+this.shipping_address_country+"&"+this.shipping_address_pobox);
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
