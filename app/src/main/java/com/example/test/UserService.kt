package com.example.test

import retrofit2.http.GET
import retrofit2.Call
interface UserService{
    @GET ("servicios")
    fun listServicios(): Call<List<xmldataColection>>
}