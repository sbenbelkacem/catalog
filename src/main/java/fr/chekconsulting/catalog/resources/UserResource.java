package fr.chekconsulting.catalog.resources;


import fr.chekconsulting.catalog.repositories.UserRepository;
import fr.chekconsulting.catalog.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1")
public class UserResource {

    private final UserService userService;
    private final UserRepository userRepository;


    public UserResource(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }


    @GetMapping("user")
    public String getUserRole(Authentication authentication){

        String userName = (String) ((Jwt) authentication.getPrincipal()).getClaims().get("preferred_username");

        return userRepository.findById(userName).get().getRole().toString();

    }


    @GetMapping("users")
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
