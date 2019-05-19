package com.platinumstudio.searchgithubsamplemvvm.repository.remote;


import android.arch.lifecycle.LiveData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitHubApi {

    @GET("/users")
    Call<List<GitHubSearch>> getAllUsers();


}
