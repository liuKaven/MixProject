package com.un32.entity.webservice.impl;

import com.un32.entity.PatientInfo;
import com.un32.entity.UserSexEnum;
import com.un32.entity.webservice.PatientService;
import com.un32.mapper.PatientInfoMapper;
import com.un32.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientInfoMapper patientInfoMapper;

    @Override
    public String savePatient(PatientInfo form) {

        patientInfoMapper.insert(new PatientInfo(CommonUtil.generateUUID(),form.getName(), form.getPassword(), UserSexEnum.MAN.name()));

        System.out.print(patientInfoMapper.getAll().size());
        return "true";
    }

    @Override
    public List<PatientInfo> listAllPatient() {
        return patientInfoMapper.getAll();
    }
}
