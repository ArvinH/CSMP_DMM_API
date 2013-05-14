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




public class insert_products {
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
	private String discontinued=null ;
	private String code=null ;
	private String category=null ;
	private String manufacturer=null ;
	private String usageunit=null ;
	private String qtyinstock=null ;
	private String qtyindemand=null ;
	private String qty_per_unit=null ;
	private String unit_price=null ;
	private String currency=null ;
	private String commissionrate=null ;
	private String taxclass=null ;
	private String sales_start_date=null ;
	private String sales_end_date=null ;
	private String start_date=null ;
	private String expiry_date=null ;
	private String mfr_part_no=null ;
	private String vendor_part_no=null ;
	private String vendor_id=null ;
	private String website=null ;
	private String glacct=null ;
	private String serialno=null ;
	private String productsheet=null ;

	
	private String status = "0";
		  public insert_products(){
		  
		  }
		  @SuppressWarnings("restriction")
		public String send(String Token,String id,String deleted,String SME_ID,String date_entered,String date_modified,String modified_user_id,String created_by,String description,String assigned_user_id,String name,String discontinued,String code,String category,String manufacturer,String usageunit,String qtyinstock,String qtyindemand,String qty_per_unit,String unit_price,String currency,String commissionrate,String taxclass,String sales_start_date,String sales_end_date,String start_date,String expiry_date,String mfr_part_no,String vendor_part_no,String vendor_id,String website,String glacct,String serialno,String productsheet){
		 
		  try{
			 
//		   URL httpurl = new URL("https://140.116.82.17:8463/CSMP_DMM/backup_opportunities.do");
		   URL httpurl = new URL("http://dmm.vcap.me/backup_products.do");
		   
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
		    this.discontinued = "discontinued="+URLEncoder.encode(((discontinued==null||discontinued==""||discontinued=="NULL")?"NULL":"\""+discontinued+"\""),"UTF-8");
		    this.code = "code="+URLEncoder.encode(((code==null||code==""||code=="NULL")?"NULL":"\""+code+"\""),"UTF-8");
		    this.category = "category="+URLEncoder.encode(((category==null||category==""||category=="NULL")?"NULL":"\""+category+"\""),"UTF-8");
		    this.manufacturer = "manufacturer="+URLEncoder.encode(((manufacturer==null||manufacturer==""||manufacturer=="NULL")?"NULL":"\""+manufacturer+"\""),"UTF-8");
		    this.usageunit = "usageunit="+URLEncoder.encode(((usageunit==null||usageunit==""||usageunit=="NULL")?"NULL":"\""+usageunit+"\""),"UTF-8");
		    this.qtyinstock = "qtyinstock="+URLEncoder.encode(((qtyinstock==null||qtyinstock==""||qtyinstock=="NULL")?"NULL":"\""+qtyinstock+"\""),"UTF-8");
		    this.qtyindemand = "qtyindemand="+URLEncoder.encode(((qtyindemand==null||qtyindemand==""||qtyindemand=="NULL")?"NULL":"\""+qtyindemand+"\""),"UTF-8");
		    this.qty_per_unit = "qty_per_unit="+URLEncoder.encode(((qty_per_unit==null||qty_per_unit==""||qty_per_unit=="NULL")?"NULL":"\""+qty_per_unit+"\""),"UTF-8");
		    this.unit_price = "unit_price="+URLEncoder.encode(((unit_price==null||unit_price==""||unit_price=="NULL")?"NULL":"\""+unit_price+"\""),"UTF-8");
		    this.currency = "currency="+URLEncoder.encode(((currency==null||currency==""||currency=="NULL")?"NULL":"\""+currency+"\""),"UTF-8");
		    this.commissionrate = "commissionrate="+URLEncoder.encode(((commissionrate==null||commissionrate==""||commissionrate=="NULL")?"NULL":"\""+commissionrate+"\""),"UTF-8");
		    this.taxclass = "taxclass="+URLEncoder.encode(((taxclass==null||taxclass==""||taxclass=="NULL")?"NULL":"\""+taxclass+"\""),"UTF-8");
		    this.sales_start_date = "sales_start_date="+URLEncoder.encode(((sales_start_date==null||sales_start_date==""||sales_start_date=="NULL")?"NULL":"\""+sales_start_date+"\""),"UTF-8");
		    this.sales_end_date = "sales_end_date="+URLEncoder.encode(((sales_end_date==null||sales_end_date==""||sales_end_date=="NULL")?"NULL":"\""+sales_end_date+"\""),"UTF-8");
		    this.start_date = "start_date="+URLEncoder.encode(((start_date==null||start_date==""||start_date=="NULL")?"NULL":"\""+start_date+"\""),"UTF-8");
		    this.expiry_date = "expiry_date="+URLEncoder.encode(((expiry_date==null||expiry_date==""||expiry_date=="NULL")?"NULL":"\""+expiry_date+"\""),"UTF-8");
		    this.mfr_part_no = "mfr_part_no="+URLEncoder.encode(((mfr_part_no==null||mfr_part_no==""||mfr_part_no=="NULL")?"NULL":"\""+mfr_part_no+"\""),"UTF-8");
		    this.vendor_part_no = "vendor_part_no="+URLEncoder.encode(((vendor_part_no==null||vendor_part_no==""||vendor_part_no=="NULL")?"NULL":"\""+vendor_part_no+"\""),"UTF-8");
		    this.vendor_id = "vendor_id="+URLEncoder.encode(((vendor_id==null||vendor_id==""||vendor_id=="NULL")?"NULL":"\""+vendor_id+"\""),"UTF-8");
		    this.website = "website="+URLEncoder.encode(((website==null||website==""||website=="NULL")?"NULL":"\""+website+"\""),"UTF-8");
		    this.glacct = "glacct="+URLEncoder.encode(((glacct==null||glacct==""||glacct=="NULL")?"NULL":"\""+glacct+"\""),"UTF-8");
		    this.serialno = "serialno="+URLEncoder.encode(((serialno==null||serialno==""||serialno=="NULL")?"NULL":"\""+serialno+"\""),"UTF-8");
		    this.productsheet = "productsheet="+URLEncoder.encode(((productsheet==null||productsheet==""||productsheet=="NULL")?"NULL":"\""+productsheet+"\""),"UTF-8");

		    out.print(this.Token+"&"+this.id+"&"+this.deleted+"&"+this.SME_ID+"&"+this.date_entered+"&"+this.date_modified+"&"+this.modified_user_id+"&"+this.created_by+"&"+this.description+"&"+this.assigned_user_id+"&"+this.name+"&"+this.discontinued+"&"+this.code+"&"+this.category+"&"+this.manufacturer+"&"+this.usageunit+"&"+this.qtyinstock+"&"+this.qtyindemand+"&"+this.qty_per_unit+"&"+this.unit_price+"&"+this.currency+"&"+this.commissionrate+"&"+this.taxclass+"&"+this.sales_start_date+"&"+this.sales_end_date+"&"+this.start_date+"&"+this.expiry_date+"&"+this.mfr_part_no+"&"+this.vendor_part_no+"&"+this.vendor_id+"&"+this.website+"&"+this.glacct+"&"+this.serialno+"&"+this.productsheet);
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
