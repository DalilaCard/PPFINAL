package com.upiiz.PPF.repositories;
import com.upiiz.PPF.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
    @Query("SELECT r FROM DepartmentEntity r WHERE r.departmentId = :id")
    DepartmentEntity findDepartmentEntityById(@Param("id") Long id);
}

