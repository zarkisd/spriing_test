package org.testcode.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.testcode.service.posts.PostService;
import org.testcode.web.dto.PostSaveRequestDto;
import org.testcode.web.dto.PostsResponseDto;
import org.testcode.web.dto.PostsUpdateRequestDto;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id,
                       @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);

    }
}
