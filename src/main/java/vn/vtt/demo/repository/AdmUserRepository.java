package vn.vtt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.vtt.demo.domain.AdmUser;

import java.util.Optional;

public interface AdmUserRepository extends JpaRepository<AdmUser, Long> {
    Optional<AdmUser> getByUsername(String username);
}
