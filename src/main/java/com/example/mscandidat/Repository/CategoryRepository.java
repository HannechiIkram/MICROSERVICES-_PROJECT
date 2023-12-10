package com.example.mscandidat.Repository;

import com.example.mscandidat.Entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("select c from Category c where c.nom like :name")
    public Page<Category> categoryByNom(@Param("name") String n, Pageable pageable);


}
