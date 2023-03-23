package com.example.hnspringboot.dao;
import com.example.hnspringboot.pojo.Book;
import com.example.hnspringboot.pojo.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookDao extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLikeOrPressLike(String keyword1, String keyword2, String keyword3);
}

