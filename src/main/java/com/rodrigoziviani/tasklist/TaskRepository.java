package com.rodrigoziviani.tasklist;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> { }
