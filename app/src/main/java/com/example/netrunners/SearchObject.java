package com.example.netrunners;

public class SearchObject {
    private int id;
    private String search;

    public SearchObject(int id, String search) {
        this.id = id;
        this.search = search;
    }

    public int getSearchId() {
        return id;
    }

    public String getSearch() {
        return search;
    }

}
