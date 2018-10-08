package com.un32.mapper;

import com.un32.entity.PatientInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PatientInfoMapper {

    List<PatientInfo> getAll();

    PatientInfo getOne(String id);

    void insert(PatientInfo user);

    void update(PatientInfo user);

    void delete(String id);

}
