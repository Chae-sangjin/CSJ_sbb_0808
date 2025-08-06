package com.mysite.sbb_0806.article;

import com.mysite.sbb_0806.question.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public void create(Question question, String content) {
        Article article = new Article();
        article.setContent(content);
        article.setCreateDate(LocalDateTime.now());
        article.setQuestion(question);
        this.articleRepository.save(article);
    }

}
