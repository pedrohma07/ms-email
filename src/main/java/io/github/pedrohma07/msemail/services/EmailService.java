package io.github.pedrohma07.msemail.services;

import io.github.pedrohma07.msemail.models.EmailModel;
import io.github.pedrohma07.msemail.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel) {

    }
}
