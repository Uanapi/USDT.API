package com.example.uanapi;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PaymentDemo {

  public static void main(String[] args) throws IOException {

    OkHttpClient client = new OkHttpClient();

    String url = "https://URL/payment.do";

    RequestBody body = RequestBody.create(MediaType.parse("application/json"), "{" + 
        "  \"app_id\":\"yourAppId\"," +
        "  \"order_no\":\"orderNo12345\"," + 
        "  \"coin_type\":\"USDT\"," +
        "  \"amount\":\"100\"" +
        "}");

    Request request = new Request.Builder()
      .url(url)
      .header("Content-Type","application/json")
      .header("UAN-API-KEY", "yourApiKey")  
      .post(body)
      .build();

    Response response = client.newCall(request).execute();

    // Parse response
  }

}
