package com.service.impl;

import com.dao.DoctorsMapper;
import com.model.Patients;
import com.model.vo.Office;
import com.model.vo.Result;
import com.service.DoctorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorsServiceImpl implements DoctorsService {

    @Autowired
    private DoctorsMapper doctorsMapper;
    @Override
    public List<Office> selectOfficeByPrid(String prid) {
        return doctorsMapper.selectOfficeByPrid(prid);
    }

    @Override
    public List<Office> selectOfficeByNameOrCardId1(String word) {
        return doctorsMapper.selectOfficeByNameOrCardId1(word);
    }

    @Override
    public List<Office> selectOfficeByNameOrCardId2(String word) {
        return doctorsMapper.selectOfficeByNameOrCardId2(word);
    }

    @Override
    public List<Office> selectOfficeByNameOrCardId3(String word) {
        return doctorsMapper.selectOfficeByNameOrCardId3(word);
    }

    @Override
    public List<Office> selectOfficeByNameOrCardId4(String word) {
        return doctorsMapper.selectOfficeByNameOrCardId4(word);
    }

    @Override
    public Integer insertPatients(Patients patients) {
        return doctorsMapper.insertPatients(patients);
    }

    @Override
    public List<Result> selectResult() {
        return doctorsMapper.selectResult();
    }


    @Override
    public Integer insertResult(Result result) {
        return doctorsMapper.insertResult(result);
    }
}
