package com.service;

import com.model.Cards;

import java.util.List;

public interface ExaminationService {
    //建卡（只存入卡号，其余为空）
    Integer creationCards(Cards cards);

    //查找卡号（验证卡号是否存在）
    Integer findCardsid(String cardsid);

    //护士开单
    Integer updateCards(Cards cards);

    //查询所有卡片
    List<Cards> selectAllCards();

    //查询体检人员信息（开单信息）
    List<Cards> nonemptyCards(String all);

    //结算、更新状态
    Integer updateState(Integer cid);
}
