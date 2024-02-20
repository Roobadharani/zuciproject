package com.zuci.ZuciIStay.repository;

import com.zuci.ZuciIStay.model.Registeration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registeration,String> {
}
