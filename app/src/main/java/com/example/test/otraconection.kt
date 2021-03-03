package com.example.test

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class otraconection{
    val surlhost = "http://fivessoftware.com/fives_WS/Service.asmx?WSDL";
    fun conection(){
        val datos = xmlCreate().traer()
        var surl = surlhost+datos
        var ourl : URL
        var urlCon:HttpURLConnection
        ourl =  URL(surl);



        urlCon = ourl.openConnection() as HttpURLConnection
        urlCon.setRequestMethod("GET");
        urlCon.connect()
        var code = urlCon.getResponseCode();
        val br = BufferedReader(InputStreamReader(urlCon.getInputStream()))
        print(br.toString())
        }
}