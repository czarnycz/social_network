package com.example.social_networkk.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token){
        return registrationService.confirmToken(token);
    }

}
