package dev.halq.request

import dev.halq.request.requests.GetRequest
import dev.halq.request.requests.PostRequest

/**
 *@author Halq
 *@since 03/11/2022 at 17:31
 */

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
           var url : String
           var mode : String
           var int : Int

           try{
                url = args[0]
                mode = args[1]
                int = args[2].toInt()
           } catch (e : Exception){
               println("Use java -jar request.jar <url> <mode> <times>")
               return
           }

            //it work S2

            when(mode){
                "GET" -> GetRequest.create(url, int)
                "POST" -> PostRequest.create(url, int)
                else -> println("Use java -jar request.jar <url> <mode> <times> \n Modes : <GET, POST>")
            }
        }
    }
}