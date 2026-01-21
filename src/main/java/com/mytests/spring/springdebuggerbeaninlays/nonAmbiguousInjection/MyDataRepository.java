package com.mytests.spring.springdebuggerbeaninlays.nonAmbiguousInjection;

import org.springframework.data.repository.CrudRepository;


interface MyDataRepository extends CrudRepository<MyData, Integer> {
}
