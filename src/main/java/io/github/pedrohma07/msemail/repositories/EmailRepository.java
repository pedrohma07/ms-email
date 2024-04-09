package io.github.pedrohma07.msemail.repositories;

import io.github.pedrohma07.msemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
