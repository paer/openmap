/*package com.openmap.grupp1.database;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import com.google.android.gms.maps.model.LatLng;



import android.os.AsyncTask;
import android.util.Log;


public class GetLocationTask extends AsyncTask<Void, Void, ArrayList<LocationMarker>>{
	private ArrayList<NameValuePair> al = new ArrayList<NameValuePair>();
	private final String url = "http://129.16.234.200/php_mysql/getLocation.php";
	public GetLocationTask(){
		
	}
	
	public ArrayList<LocationMarker> getLocation() throws Exception{
		ArrayList<LocationMarker> lpArray = new ArrayList<LocationMarker>();

		
		HttpClient httpClient = new DefaultHttpClient();//used to execute post
		HttpPost httpPost = new HttpPost(url);
		
		al.add(new BasicNameValuePair("tag", "add"));
		httpPost.setEntity(new UrlEncodedFormEntity(al));
		
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		String responseBody = httpClient.execute(httpPost, responseHandler);
		
		JSONArray jArray = new JSONArray(responseBody);
		JSONObject json_data = new JSONObject();		
		Log.d("HEJ",""+jArray.length());
		for (int i=0; i<jArray.length(); i++){
		LocationMarker lp = new LocationMarker();
			json_data = jArray.getJSONObject(i);
			//JSONArray tags = new JSONArray(json_data.getString("tags"));
			//JSONArray locations = new JSONArray(json_data.getString("locations"));
			
			//for (int j = 0; j<locations.length(); j++){
				//JSONObject json_data = locations.getJSONObject(j);
				Log.d("HALL�",""+json_data.getString("title"));
				lp.setTitle(json_data.getString("title"));
				Log.d("HALL�",""+json_data.getString("latitude"));
				lp.setLatitude(Double.parseDouble(json_data.getString("latitude")));
				Log.d("HALL�",""+json_data.getString("longitude"));
				lp.setLongitude(Double.parseDouble(json_data.getString("longitude")));
				Log.d("HALL�",""+json_data.getString("description"));
				lp.setDescription(json_data.getString("description"));
			//}
				/*String[] tagArray = new String[tags.length()];
			for (int j = 0; j<tags.length(); j++){
				JSONObject tags_data = tags.getJSONObject(j);
				Log.d("HALL�",""+tags_data.getString("tag"));
				tagArray[j] = tags_data.getString("tag");
			}
			lp.setTags(tagArray);*//*
			lp.setLatLng();
			lpArray.add(lp);
			//Log.i("tag"+i,"tag: " + tagName);
			Log.i("Jarray enght", ""+jArray.length());
			Log.d("how big is it now?",""+lpArray.size());
		}

		Log.i("koll1:",responseBody);

		Log.d("kolla h�r d�!:", "The response is: " + lpArray.size());
		return lpArray;
		
						
	}
	@Override
	protected ArrayList<LocationMarker> doInBackground(Void... params) {
	try {
		return getLocation();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	return null;
	}
	
	@Override
	protected void onPostExecute(ArrayList<LocationMarker> result){
		
	}
	public void setMinMaxLatLng(double minLat, double minLng, double maxLat, double maxLng ){
		al.add(new BasicNameValuePair("restraint", "square"));
		al.add(new BasicNameValuePair("minLat", ""+minLat));
		al.add(new BasicNameValuePair("minLng", ""+minLng));
		al.add(new BasicNameValuePair("maxLat", ""+maxLat));
		al.add(new BasicNameValuePair("maxLng", ""+maxLng));
		
	}
	public void getLocationPairFromLatLng(LatLng ll) throws InterruptedException, ExecutionException{
		
	
		al.add(new BasicNameValuePair("restraint", "fromLatLng"));
		al.add(new BasicNameValuePair("lat",""+ll.latitude));
		al.add(new BasicNameValuePair("lng",""+ll.longitude));

		}
}*/


