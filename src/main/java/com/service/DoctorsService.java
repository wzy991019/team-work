package com.service;

import com.model.Patients;
import com.model.vo.Office;
import com.model.vo.Result;

import java.util.List;

public interface DoctorsService {
    /**
     * 根据prid查询对应的患者信息以及医生科室等信息
     * @param prid 科室id
     * @return 返回是一个Office对象
     */
    List<Office> selectOfficeByPrid(String prid);
    /**
     * 根据姓名或卡号进行查询
     * @param word 姓名或者卡号
     * @return 返回一个office对象
     */
    List<Office> selectOfficeByNameOrCardId1(String word);
    /**
     * 根据姓名或卡号进行查询
     * @param word 姓名或者卡号
     * @return 返回一个office对象
     */
    List<Office> selectOfficeByNameOrCardId2(String word);
    /**
     * 根据姓名或卡号进行查询
     * @param word 姓名或者卡号
     * @return 返回一个office对象
     */
    List<Office> selectOfficeByNameOrCardId3(String word);
    /**
     * 根据姓名或卡号进行查询
     * @param word 姓名或者卡号
     * @return 返回一个office对象
     */
    List<Office> selectOfficeByNameOrCardId4(String word);
    /**
     * 写小结
     * @param patients 传入病人对象
     * @return 返回值>0则插入成功
     */
    Integer insertPatients(Patients patients);
    /**
     * 查询所有结果
     * @return 返回结果的集合
     */
    List<Result> selectResult();
    /**
     * 插入总结
     * @param result
     * @return >0表示插入成功
     */
    Integer insertResult(Result result);
}
