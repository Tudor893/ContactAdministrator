package tudor.example.contactapi;

import tudor.example.contactapi.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepo extends JpaRepository<Contact, String> {
    Optional<Contact> findById(String id);
}