package api.giuliana.MyFirstCrud.repository;

import api.giuliana.MyFirstCrud.entity.NewUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewUserRepository extends JpaRepository<NewUser,Integer> {

    NewUser findByName(String name);
}
