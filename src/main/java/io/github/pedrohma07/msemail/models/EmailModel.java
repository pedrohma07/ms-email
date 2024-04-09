package io.github.pedrohma07.msemail.models;

import io.github.pedrohma07.msemail.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
