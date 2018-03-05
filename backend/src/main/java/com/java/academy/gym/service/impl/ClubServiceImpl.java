package com.java.academy.gym.service.impl;

import com.java.academy.gym.model.Club;
import com.java.academy.gym.model.ContactInfo;
import com.java.academy.gym.repository.ClubDao;
import com.java.academy.gym.repository.ContactInfoDao;
import com.java.academy.gym.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImpl implements ClubService {

    private final ClubDao clubDao;
    private final ContactInfoDao contactInfoDao;

    @Autowired
    public ClubServiceImpl(ClubDao clubDao, ContactInfoDao contactInfoDao) {
        this.clubDao = clubDao;
        this.contactInfoDao = contactInfoDao;
    }

    @Override
    public List<Club> findAllClubs() {
        return clubDao.findAll();
    }

    @Override
    public List<Club> findClubsByCity(String city) {
        return clubDao.findAll()
                .stream()
                .filter(club -> club.getContactInfo().getCity().equals(city))
                .collect(Collectors.toList());
    }

    @Override
    public Club findClubByName(String name) {
        return clubDao.findClubByName(name);
    }

    @Override
    public ContactInfo getInfoAboutClubByClubName(String name) {
        return contactInfoDao.getContactInfoByClubName(name);
    }
}