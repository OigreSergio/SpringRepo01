package com.example.Repo_Spring01.car.repo;

import com.example.Repo_Spring01.car.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOfCars extends JpaRepository<CarEntity , Long> {
}
