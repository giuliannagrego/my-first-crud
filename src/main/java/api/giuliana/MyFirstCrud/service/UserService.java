package api.giuliana.MyFirstCrud.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    public void createUser(String user){
        log.info("Usuário"+ user);
    }
}
