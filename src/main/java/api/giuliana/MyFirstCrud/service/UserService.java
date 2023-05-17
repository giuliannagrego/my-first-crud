package api.giuliana.MyFirstCrud.service;

import api.giuliana.MyFirstCrud.repository.NewUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
@Service
@Slf4j
public class UserService {

    public void createUser(String user){

        log.info("Usuário"+ user);
    }
}
