package com.example.restfulblogapplication.mappers;

import com.example.restfulblogapplication.dtos.CommentDto;
import com.example.restfulblogapplication.entities.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CommentMapper {

  @Mapping(target = "post", ignore = true)
  Comment toModel(CommentDto commentDto);

  CommentDto toDto(Comment post);
}