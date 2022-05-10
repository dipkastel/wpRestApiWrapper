package com.notrika.wpRestApi.core.helper;

import java.util.Map;

public interface WpApiService<T> {
    T[] getAll(int page,int per_page);
    T[] getAll(Map<String, String> params);
    T get(int id);
    T get(int id, Map<String, String> params);
    void create(T obj);
    void update(T obj);
    void delete(int id);
    Class<T> getType();
}
