package com.example.test

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.simpleframework.xml.convert.AnnotationStrategy
import org.simpleframework.xml.core.Persister
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import rx.schedulers.Schedulers


class RestEngine{
    companion object{
        fun getRestEngine(): Retrofit? {
            val interceptor = HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
            val retrofit = Retrofit.Builder()
                .baseUrl("http://fivessoftware.com/fives_WS/Service.asmx?WSDL")
                .client(client)
                .addConverterFactory(
                    SimpleXmlConverterFactory.createNonStrict(
                        Persister(
                            AnnotationStrategy() // important part!
                        )
                    ))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io())) // rx stuff
                .build();

            return retrofit
        }
    }
}