package dev.halq.request.requests

import java.net.HttpURLConnection
import java.net.URL

object PostRequest {

    fun create(url : String, times : Int){
        for (i in 0..times){
            val url = URL(url)
            val conn = url.openConnection() as HttpURLConnection

            conn.requestMethod = "POST"
            conn.setRequestProperty("User-Agent", "Mozilla/5.0")

            val responseCode = conn.responseCode

            println("Posting request on : $url, with response code : $responseCode, in $i times")
        }
    }
}