package com.practice.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<T,ID> {

    protected Map<ID,T> map = new HashMap<>();

    void save(ID id, T object){
        map.put(id,object);
    }

    List<T> findAll(){
        return new ArrayList<>(map.values());
    }

    T findBy(ID id){
        return map.get(id);
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf( entry-> entry.getValue().equals(object));
    }

    void update(ID id,T object) {

        map.replace(id,object);

    }



}
