package com.busterap.firstjobapp.company;

import com.busterap.firstjobapp.job.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {


}
