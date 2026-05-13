package com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection;

import org.springframework.data.repository.CrudRepository;


public interface MyDataRepository extends CrudRepository<MyData, Integer> {
}
