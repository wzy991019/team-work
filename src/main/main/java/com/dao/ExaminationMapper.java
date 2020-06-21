package com.dao;

import com.model.Cards;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 体检单
 */
public interface ExaminationMapper {
    //建卡（只存入卡号，其余为空）
    Integer creationCards(Cards cards);

    //查找卡号（验证卡号是否存在）
    Integer findCardsid(@Param("cardsid") String cardsid);

    //查询所有卡片
    List<Cards> selectAllCards();

    //护士开单
    Integer updateCards(Cards cards);
}
