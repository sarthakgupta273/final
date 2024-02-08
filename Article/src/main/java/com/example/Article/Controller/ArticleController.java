package com.example.Article.Controller;

import com.example.Article.Service.ArticleService;
import com.example.Article.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@CrossOrigin("*")

public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/hello")
    public String welcome(){
        return "welcome";
    }
    @PostMapping("/upload")
    public ResponseEntity<?> createArticle(@RequestBody Article article) {
        Article savedArticle = articleService.save(article);
        return new ResponseEntity<>(savedArticle, HttpStatus.CREATED);
    }

    @GetMapping("/view")
    public ResponseEntity<List<?>> getAllArticles() {
        List<Article> articles = articleService.getAllArticles();
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }
}
