package com.pbl.teamproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Getter
@NoArgsConstructor
public class Post extends Timestamped{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long post_no;

    @Column(nullable = false)
    private String post_title;

    @Column(nullable = false)
    private String post_contents;

    @Column(nullable = false)
    private String images;

    @Column(nullable = false)
    private Long likes;

    @Column(nullable = false)
    private Long views;

    @Column(nullable = false)
    private Long user_no;

    public Post(String post_title, String post_contents, String images, Long likes, Long views, Long user_no) {
        this.post_title = post_title;
        this.post_contents = post_contents;
        this.images = images;
        this.likes = likes;
        this.views = views;
        this.user_no = user_no;
    }
//
//    public Post(PostRequestDto requestDto) {
//        this.post_title = requestDto.getPost_title();
//        this.user_no = requestDto.getUser_no();
//        this.images =requestDto.getImages();
//        this.post_contents = requestDto.getPost_contents();
//        this.likes = requestDto.getLikes();
//        this.views = requestDto.getViews();
//    }
//
//    public void update(PostRequestDto requestDto) {
//        this.post_title = requestDto.getPost_title();
//        this.user_no = requestDto.getUser_no();
//        this.images =requestDto.getImages();
//        this.post_contents = requestDto.getPost_contents();
//        this.likes = requestDto.getLikes();
//        this.views = requestDto.getViews();
//    }
}
