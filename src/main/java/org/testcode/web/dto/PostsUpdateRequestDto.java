package org.testcode.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.testcode.domain.posts.Posts;

@Getter
@RequiredArgsConstructor
@Builder
public class PostsUpdateRequestDto {
    private final String title;
    private final String content;
}
