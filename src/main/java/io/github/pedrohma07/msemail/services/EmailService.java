package io.github.pedrohma07.msemail.services;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import io.github.pedrohma07.msemail.enums.StatusEmail;
import io.github.pedrohma07.msemail.models.EmailModel;
import io.github.pedrohma07.msemail.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailService {

    @Autowired
    private AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    private EmailRepository emailRepository;

    public EmailModel sendEmail(EmailModel emailModel) {
        try {
            SendEmailRequest request = new SendEmailRequest()
                    .withDestination(
                            new Destination().withToAddresses(emailModel.getEmailTo()))
                    .withMessage(new Message()
                            .withBody(new Body()
                                    .withText(new Content()
                                            .withCharset("UTF-8").withData(emailModel.getText())))
                            .withSubject(new Content()
                                    .withCharset("UTF-8").withData(emailModel.getSubject())))
                    .withSource(emailModel.getEmailFrom());
            amazonSimpleEmailService.sendEmail(request);
            emailModel.setStatusEmail(StatusEmail.SENT);
            emailModel.setSendDateEmail(LocalDateTime.now());
            emailRepository.save(emailModel);
        } catch (Exception ex) {
            System.out.println("O e-mail não foi enviado.");
            System.out.println("Detalhes do erro: " + ex.getMessage());
            emailModel.setStatusEmail(StatusEmail.ERROR);
            emailRepository.save(emailModel);
        } finally {
            return emailRepository.save(emailModel);
        }
    }
}
