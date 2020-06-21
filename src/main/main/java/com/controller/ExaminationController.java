package com.controller;

import com.model.Cards;
import com.service.ExaminationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 体检操作
 */
@Controller
public class ExaminationController {
    @Resource
    private ExaminationService examinationService;

    //建卡（只存入卡号，其余为空）
    @RequestMapping("creationCards")
    @ResponseBody
    public String creationCards(Cards cards) {
        Integer integer = examinationService.creationCards(cards);
        if (integer > 0) {
            return "succ";
        }
        return "err";
    }

    //查找卡号（验证卡号是否存在）
    @RequestMapping("findCardsid")
    public void findCardsid(String cardsid, HttpServletResponse response) {
        Integer cardsid1 = examinationService.findCardsid(cardsid);
        try {
            if (cardsid1 > 0) {
                response.getWriter().print("true");
            } else {
                response.getWriter().print("false");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //护士开单
    @RequestMapping("updateCards")
    @ResponseBody
    public String updateCards(Cards cards) {
        Integer integer = examinationService.updateCards(cards);
        if (integer > 0) {
            System.out.println(integer);
            return "succ";
        }
        return "err";
    }

    //查询所有卡片
    @RequestMapping("selectAllCards")
    public ModelAndView selectAllCards(Cards cards) {
        List<Cards> cards1 = examinationService.selectAllCards();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", cards1);
        modelAndView.setViewName("cards-add");
        return modelAndView;
    }
}
