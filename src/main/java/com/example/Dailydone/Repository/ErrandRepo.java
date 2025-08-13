package com.example.Dailydone.Repository;

import com.example.Dailydone.Entity.Errand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrandRepo extends JpaRepository<Errand,Long> {

}
