package com.devaprendiz.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devaprendiz.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker,Long> {

}
