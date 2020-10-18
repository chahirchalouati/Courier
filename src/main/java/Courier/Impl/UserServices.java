/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Courier.Impl;

import Courier.Model.Contact;
import Courier.Model.User;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Chahir Chalouati
 */
public interface UserServices {

    ResponseEntity<?> register(User user, Contact contact);

    ResponseEntity<?> changePassword(String email);

    ResponseEntity<?> tackDelivery(String code, User user);

}
