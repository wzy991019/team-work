package com.controller;


import com.model.Patients;
import com.model.vo.Office;
import com.model.vo.Result;
import com.service.DoctorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DoctorsController {
    @Autowired
    private DoctorsService doctorsService;

    @RequestMapping("/jiankang/{prid}")
    public String Jiankang(@PathVariable("prid") String prid, Model model){
        List<Office> offices = doctorsService.selectOfficeByPrid(prid);
        model.addAttribute("offices",offices);
        return "jiankang";
    }
    @RequestMapping("/guomin01/{prid}")
    public String Guomin01(@PathVariable("prid") String prid, Model model){
        List<Office> offices = doctorsService.selectOfficeByPrid(prid);
        model.addAttribute("offices",offices);
        return "guomin01";
    }
    @RequestMapping("/gan/{prid}")
    public String Gan(@PathVariable("prid") String prid, Model model){
        List<Office> offices = doctorsService.selectOfficeByPrid(prid);
        model.addAttribute("offices",offices);
        return "gan";
    }
    @RequestMapping("/guomin02/{prid}")
    public String Guomin02(@PathVariable("prid") String prid, Model model){
        List<Office> offices = doctorsService.selectOfficeByPrid(prid);
        model.addAttribute("offices",offices);
        return "guomin02";
    }
    @RequestMapping("/query01")
    public String Query01(String word, Model model){
        List<Office> offices = doctorsService.selectOfficeByNameOrCardId1(word);
        model.addAttribute("offices",offices);
        return "jiankang";
    }
    @RequestMapping("/query02")
    public String Query02(String word, Model model){
        List<Office> offices = doctorsService.selectOfficeByNameOrCardId2(word);
        model.addAttribute("offices",offices);
        return "guomin01";
    }
    @RequestMapping("/query03")
    public String Query03(String word, Model model){
        List<Office> offices = doctorsService.selectOfficeByNameOrCardId3(word);
        model.addAttribute("offices",offices);
        return "gan";
    }
    @RequestMapping("/query04")
    public String Query04(String word, Model model){
        List<Office> offices = doctorsService.selectOfficeByNameOrCardId4(word);
        model.addAttribute("offices",offices);
        return "guomin02";
    }
    @RequestMapping("/toReport01/{prid}")
    public String toReport01(@PathVariable("prid") String prid, Model model){
        if(prid.equals("01")||prid=="01"){
            List<Office> offices = doctorsService.selectOfficeByPrid(prid);
            model.addAttribute("offices",offices);
            return "report-01";
        }else if(prid.equals("02")||prid=="02"){
            List<Office> offices = doctorsService.selectOfficeByPrid(prid);
            model.addAttribute("offices",offices);
            return "report-02";
        }else if(prid.equals("03")||prid=="03"){
            List<Office> offices = doctorsService.selectOfficeByPrid(prid);
            model.addAttribute("offices",offices);
            return "report-03";
        }else if(prid.equals("04")||prid=="04"){
            List<Office> offices = doctorsService.selectOfficeByPrid(prid);
            model.addAttribute("offices",offices);
            return "report-04";
        }else {
            return "404";
        }

    }
    @RequestMapping("/insertResult1")
    public String insertResult1(Patients patients){
        Integer integer = doctorsService.insertPatients(patients);
        if (integer>0){
            return "jiankang";
        }
        return "404";
    }
    @RequestMapping("/insertResult2")
    public String insertResult2(Patients patients){
        Integer integer = doctorsService.insertPatients(patients);
        if (integer>0){
            return "guomin01";
        }
        return "404";
    }
    @RequestMapping("/insertResult3")
    public String insertResult3(Patients patients){
        Integer integer = doctorsService.insertPatients(patients);
        if (integer>0){
            return "guomin01";
        }
        return "404";
    }
    @RequestMapping("/insertResult4")
    public String insertResult4(Patients patients){
        Integer integer = doctorsService.insertPatients(patients);
        if (integer>0){
            return "guomin01";
        }
        return "404";
    }
    @RequestMapping("/toResult")
    public String toResult(Model model){
        List<Result> results = doctorsService.selectResult();
        model.addAttribute("results",results);
        return "result";
    }
    @RequestMapping("/toResultAll")
    public String toResultAll(){
        return "reportall";
    }
    @RequestMapping("/resultAll")
    public String resultAll(Result result){
        Integer integer = doctorsService.insertResult(result);
        if (integer >0){
            return "redirect:/toResult";
        }
        return "404";
    }
}
