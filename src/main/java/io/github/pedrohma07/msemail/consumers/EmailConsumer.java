package io.github.pedrohma07.msemail.consumers;

import io.github.pedrohma07.msemail.dtos.EmailDto;
import io.github.pedrohma07.msemail.services.EmailService;
import io.github.pedrohma07.msemail.models.EmailModel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailDto emailDto) {
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        System.out.println("Email status: " + emailModel.getStatusEmail().toString());
    }
}
