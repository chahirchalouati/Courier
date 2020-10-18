/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Courier.Repository;

import Courier.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Chahir Chalouati
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailContact(@Param("email") String username);

    User findByUsername(@Param("username") String username);

}
