package com.br.supervisorio.services;

import com.br.supervisorio.entities.Login;
import com.br.supervisorio.repositories.LoginRepository;
import com.br.supervisorio.services.exceptions.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginRepository loginRepository;

    public Login findById(Long id) {
        return loginRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("The id " + id + " was not found!"));
    }
}
