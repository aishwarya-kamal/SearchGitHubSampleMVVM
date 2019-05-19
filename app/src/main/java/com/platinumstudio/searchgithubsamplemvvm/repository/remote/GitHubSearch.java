package com.platinumstudio.searchgithubsamplemvvm.repository.remote;

import com.google.gson.annotations.SerializedName;

public class GitHubSearch {

    @SerializedName("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
