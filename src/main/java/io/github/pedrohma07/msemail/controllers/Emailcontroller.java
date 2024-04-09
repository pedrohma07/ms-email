package io.github.pedrohma07.msemail.controllers;

import io.github.pedrohma07.msemail.dtos.EmailDto;
import io.github.pedrohma07.msemail.models.EmailModel;
import io.github.pedrohma07.msemail.services.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Emailcontroller {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto){
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        return ResponseEntity.ok(emailModel);
    }
}
