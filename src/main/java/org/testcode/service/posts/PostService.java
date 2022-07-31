package org.testcode.service.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.testcode.domain.posts.PostsRepository;
import org.testcode.web.dto.PostSaveRequestDto;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
