package com.java.academy.gym.repository;

import com.java.academy.gym.BaseITest;
import com.java.academy.gym.model.Club;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
public class ClubRepoTest extends BaseITest {
    @Autowired
    private ClubRepo clubRepo;

    @Test
    public void testFindClubByNameAndLangCode() {
        String langCode = "EN";
        String name = "Bora Bora";
        String description = "Super Gym!";
        Optional<Club> clubOptional = clubRepo.findClubByNameAndLangCode(name, langCode);
        assertTrue(clubOptional.isPresent());
        assertEquals(description, clubOptional.get().getDescription());
    }
}
