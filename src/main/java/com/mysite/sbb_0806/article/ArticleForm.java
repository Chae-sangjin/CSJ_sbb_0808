package com.mysite.sbb_0806.article;

import jakarta.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleForm {
    @NotEmpty(message = "내용은 필수항목입니다.")
    private String content;
}
