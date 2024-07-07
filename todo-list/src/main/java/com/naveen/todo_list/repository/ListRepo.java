package com.naveen.todo_list.repository;

import com.naveen.todo_list.model.List1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepo extends JpaRepository<List1, Long> {
}
