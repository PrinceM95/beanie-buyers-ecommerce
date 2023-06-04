package com.beaniebuyers.web.services;

import com.beaniebuyers.web.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
