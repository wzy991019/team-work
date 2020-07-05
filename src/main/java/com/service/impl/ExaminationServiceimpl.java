package com.service.impl;

import com.dao.ExaminationMapper;
import com.model.Cards;
import com.service.ExaminationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExaminationServiceimpl implements ExaminationService {

    @Resource
    private ExaminationMapper examinationMapper;

    //建卡（只存入卡号，其余为空）
    @Override
    public Integer creationCards(Cards cards) {
        Integer integer = examinationMapper.creationCards(cards);
        return integer;
    }

    //查找卡号（验证卡号是否存在）
    @Override
    public Integer findCardsid(String cardsid) {
        Integer cardsid1 = examinationMapper.findCardsid(cardsid);
        return cardsid1;
    }

    //护士开单
    @Override
    public Integer updateCards(Cards cards) {
        Integer integer = examinationMapper.updateCards(cards);
        return integer;
    }

    //查询所有卡片
    @Override
    public List<Cards> selectAllCards() {
        List<Cards> cards = examinationMapper.selectAllCards();
        return cards;
    }

    //查询体检人员信息（开单信息）
    @Override
    public List<Cards> nonemptyCards(String all) {
        List<Cards> cards = examinationMapper.nonemptyCards(all);
        return cards;
    }

    //结算、更新状态
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer updateState(Integer cid) {
        Integer integer = examinationMapper.updateState(cid);
        return integer;
    }
}
