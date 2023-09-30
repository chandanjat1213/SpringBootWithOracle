package com.first;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="my",collectionResourceRel = "studentInfo")
public interface MyRepo extends JpaRepository<Student, Integer> {

}
