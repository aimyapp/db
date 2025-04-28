package com.example.db.mapper;

import com.example.db.domain.Userhi;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserhiMapper {
    List<Userhi> findAll();
    Userhi findById(int userId);
}