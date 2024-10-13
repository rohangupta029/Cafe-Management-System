package com.inn.cafe.restimpl;

import com.inn.cafe.rest.UserRest;
import com.inn.cafe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {

        try {
            return userService.signUp(requestMap);

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return new ResponseEntity<String>("{\"message\":\""+ "Something went wrong at product service." +"\"}", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
