package com.notrika.wpRestApi.core.helper;

import java.util.Map;

public interface WpApiService<T> {
    T[] getAll(int page,int per_page);
    T get(Long id);
    void create(T obj);
    void update(T obj);
    void delete(int id);
}
