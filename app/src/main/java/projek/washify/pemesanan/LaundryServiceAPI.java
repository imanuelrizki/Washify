package projek.washify.pemesanan;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface LaundryServiceAPI {
    @GET("v1/219c0455-ddfa-47d6-928f-a48885cb0958")
    Call<KetersediaanResponse> cekKetersediaanPakaianBiasa(@Query("jenisPakaian") String jenisPakaian);

    @GET("v1/cd58ea96-d4e9-4115-81e8-805878853317")
    Call<KetersediaanResponse> cekKetersediaanPakaianBerat(@Query("jenisPakaian") String jenisPakaian);

    @GET("v1/6b2f04c5-45d6-4296-9f8a-4a1521b351ae")
    Call<KetersediaanResponse> cekKetersediaanPakaianKhusus(@Query("jenisPakaian") String jenisPakaian);
}
