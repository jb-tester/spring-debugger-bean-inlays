package com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection;


import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MyDataRepoFieldInjection {

    // runtime bean inlay is not shown in the non-suspended mode for EntityManager
    @Autowired
    private EntityManager entityManager;


    public List<String> getData(){
        List<String> result = new ArrayList<>();
        List<MyData> resultList = entityManager.createNativeQuery("select * from foo", MyData.class).getResultList();
        resultList.forEach(data -> result.add(data.toString()));
        return result;
    };

    @Transactional
    public void initDB() {
        entityManager.persist(new MyData("aaa", "bbb", 20));
        entityManager.persist(new MyData("ccc", "ddd", 30));
        entityManager.persist(new MyData("eee", "fff", 40));
    }
}
