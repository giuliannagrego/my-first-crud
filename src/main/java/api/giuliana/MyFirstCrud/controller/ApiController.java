package api.giuliana.MyFirstCrud.controller;

import api.giuliana.MyFirstCrud.entity.NewUser;
import api.giuliana.MyFirstCrud.repository.NewUserRepository;
import api.giuliana.MyFirstCrud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;



@RestController
@Slf4j
public class ApiController {

    @Autowired
    private NewUserRepository newUserRepository;

    @GetMapping(path = "/teste")
    public ResponseEntity test() {
        return ResponseEntity.status(HttpStatus.OK).body("Fique de boa que tá bateno");
    }

    @PostMapping(path = "/criar_usuario")
    public ResponseEntity users(@RequestHeader String user) {
        NewUser usuario = newUserRepository.findByName(user);
        return ResponseEntity.status(HttpStatus.OK).body("Usuario criado");
    }

}
