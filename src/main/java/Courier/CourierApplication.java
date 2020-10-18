package Courier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourierApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourierApplication.class, args);
    }

//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    AuthoritieRepository authoritieRepository;
//    @Override
//    public void run(String... args) throws Exception {
//        if (authoritieRepository.findAll().size() <= 0) {
//            authoritieRepository.saveAll(
//                    List.of(
//                            new Authoritie("MANAGER"),
//                            new Authoritie("COSTUMER"),
//                            new Authoritie("COURIER"))
//            );
//        }
//
////        for (int i = 0; i < 100; i++) {
////
////            userRepository.save(
////                    new User("COURIER F" + i,
////                            "COURIER L" + i,
////                            "COURIER U" + i,
////                            "COURIER" + i + "@mail.com",
////                            "23051988",
////                            authoritieRepository.findByAuthoritie("COURIER")));
////
////        }
//
//    }
}
