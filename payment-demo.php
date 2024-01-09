<?php

$url = 'https://api.uanapi.com/payment.do';

$data = [
  'app_id' => 'yourAppId',
  'order_no' => 'orderNo12345',
  'coin_type' => 'USDT',
  'amount' => '100'
];

$headers = [
  'Content-Type: application/json',
  'UAN-API-KEY: yourApiKey'  
];

$ch = curl_init();

curl_setopt($ch, CURLOPT_URL, $url);
curl_setopt($ch, CURLOPT_POST, 1);
curl_setopt($ch, CURLOPT_POSTFIELDS, json_encode($data));
curl_setopt($ch, CURLOPT_HTTPHEADER, $headers);

curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);

$response = curl_exec($ch);

curl_close($ch);

// Parse response
$result = json_decode($response, true);

print_r($result);

?>
