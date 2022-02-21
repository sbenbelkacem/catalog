package fr.chekconsulting.catalog.repositories;


import fr.chekconsulting.catalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
