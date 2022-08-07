package org.testcode.web.dto;

import lombok.Getter;
import org.testcode.domain.posts.Posts;

import java.time.LocalDateTime;

@Getter
public class PostListResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
