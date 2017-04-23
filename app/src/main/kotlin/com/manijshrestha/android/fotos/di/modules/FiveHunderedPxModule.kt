package com.manijshrestha.android.fotos.di.modules

import com.manijshrestha.android.fotos.data.remote.fivehundredpx.PxManager
import com.manijshrestha.android.fotos.data.remote.fivehundredpx.PxManagerImpl
import com.manijshrestha.android.fotos.data.remote.fivehundredpx.api.PxApi
import com.manijshrestha.android.fotos.data.remote.fivehundredpx.interceptor.ConsumerKeyInterceptor
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class FiveHunderedPxModule {

    @Provides internal fun providesPxRetrofit(okHttpClient: OkHttpClient) =
            Retrofit.Builder()
                    .baseUrl("https://api.500px.com/")
                    .client(okHttpClient.newBuilder()
                            .addInterceptor(ConsumerKeyInterceptor()).build())
                    .addCallAdapterFactory(
                            RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()

    @Provides internal fun providesPxApi(retrofit: Retrofit) = retrofit.create(PxApi::class.java)

    @Provides internal fun providesPxManager(pxApi: PxApi): PxManager = PxManagerImpl(pxApi)
}