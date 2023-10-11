package request

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataApiClient {
    companion object {
        private val DATAURL = "https://d49c3a78-a4f2-437d-bf72-569334dea17c.mock.pstmn.io"
        fun getRetrofitInstance(): Retrofit {
            val retrofit = Retrofit.Builder()
                .baseUrl(DATAURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit!!
        }
    }
}