package com.un32.entity.webservice;

import com.un32.entity.PatientInfo;

import java.util.List;

public interface PatientService {
    public String savePatient(PatientInfo form);
    public List<PatientInfo> listAllPatient();
}