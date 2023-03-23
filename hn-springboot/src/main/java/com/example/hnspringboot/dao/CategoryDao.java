package com.example.hnspringboot.dao;

import com.example.hnspringboot.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
