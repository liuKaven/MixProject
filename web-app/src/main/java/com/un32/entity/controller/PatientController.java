package com.un32.entity.controller;

import com.un32.entity.PatientInfo;
import com.un32.entity.webservice.impl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PatientController {

    @Autowired
    private PatientServiceImpl patientService;

    @GetMapping("/patient")
    public String patientInfoPage(@RequestParam(value = "word", required = false) String word, ModelMap model) {
        model.addAttribute("word", word);
        return "patient/patient";
    }

    @PostMapping(value = "/patient/save",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String savePatientInfo(@RequestBody PatientInfo form) {
        return patientService.savePatient(form);
    }

    @PostMapping(value = "/patient/list",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<PatientInfo> patientList(){
       return patientService.listAllPatient();
    }

    //TODO: git提交
    //TODO：搭建本地仓库
    //TODO：搭建docker
}
