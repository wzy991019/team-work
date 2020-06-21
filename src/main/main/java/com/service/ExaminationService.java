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
}
