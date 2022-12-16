package com.example.crudoperation;


import com.example.crudoperation.User.User;
import com.example.crudoperation.User.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)

public class UserRepositoryTests {
    @Autowired private UserRepository repo;

//    @Test
//    public void testAddNew(){
//        User user = new User();
//            user.setEmail("Dj@gmail.com");
//            user.setPassword("Dj@123");
//            user.setFirstname("Deba");
//            user.setLastname("Jena");
//
//            User savedUser = repo.save(user);
//
//        Assertions.assertThat(savedUser).isNotNull();
//        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
//    }
    @Test
    public void testAddNew(){
        User user = new User();
        user.setEmail("Rossy@gmail.com");
        user.setPassword("rossy123");
        user.setFirstname("Debashree");
        user.setLastname("Jena");

        User savedUser = repo.save(user);

        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
    }

//
    @Test
    public void testListAll(){
        Iterable<User>users=repo.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);
        for (User user:users){
            System.out.println(user);
        }
    }

    @Test
    public void testUpdate(){
        Long userId =(long) 2;
        Optional<User> optionalUser=repo.findById(userId);
        User user=optionalUser.get();
        user.setPassword("hi123");
        repo.save(user);
        User updatedUser=repo.findById(userId).get();
        Assertions.assertThat(updatedUser.getPassword()).isEqualTo("hi123");
    }

        @Test
        public void testGet(){
            Long userId=(long)2;
            Optional<User> optionalUser=repo.findById(userId);
            Assertions.assertThat(optionalUser).isPresent();
            System.out.println(optionalUser.get());
        }


@Test
public void testDelete(){
Long userId=(long) 1;
repo.deleteById(userId);
   Optional<User> optionalUser=repo.findById(userId);
   Assertions.assertThat(optionalUser).isNotPresent();
   }


}
