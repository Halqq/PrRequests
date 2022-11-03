package dev.halq.request.requests

import java.net.HttpURLConnection
import java.net.URL

object GetRequest {

    fun create(url : String, times : Int){
        for (i in 0..times){
            val urle = URL(url)
            val conn = urle.openConnection() as HttpURLConnection

            conn.requestMethod = "GET"
            conn.setRequestProperty("User-Agent", "Mozilla/5.0")

            val responseCode = conn.responseCode

            println("Getting request on : $url, with response code : $responseCode, in $i times")
        }
    }
}