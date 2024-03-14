package com.emreilgar.movieapp.repository;

import com.emreilgar.movieapp.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IShowRepository extends JpaRepository<Show,Long> {
}
